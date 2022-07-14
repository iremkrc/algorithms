// 1.2 Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.

/// ASK: Is it case sensitive?

import java.util.HashMap;

public class CheckPermutation {

	// Time Complexity: O(N), Space Complexity: O(N)
	public static boolean checkPermutation(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		HashMap<Character, Integer> letters = new HashMap<>();
		for(int i=0; i<str1.length(); i++){
			if(letters.containsKey(str1.charAt(i))){
				letters.put(str1.charAt(i), letters.get(str1.charAt(i))+1);
			}else{
				letters.put(str1.charAt(i), 1);
			}
		}
		
		for(int i=0; i<str2.length(); i++){
			if(!letters.containsKey(str2.charAt(i))){
				return false;
			}else{
				if(letters.get(str2.charAt(i)) > 0){
					letters.put(str2.charAt(i), letters.get(str2.charAt(i))-1);				
				}else{
					return false;
				}
			}
		}
		
		return true;
	}
}
