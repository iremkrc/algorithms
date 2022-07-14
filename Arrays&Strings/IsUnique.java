//1.1 Is Unique: Implement an algorithm to determine if a string has all unique characters.

import java.util.HashMap;

public class IsUnique {
	

    // Time Complexity: O(N), Space Complexity: O(N)
    public static boolean isUniqueWithMap(String str){
        HashMap<Character, Integer> letters = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            if(letters.containsKey(str.charAt(i))){
                return false;
            }else{
                letters.put(str.charAt(i), 1);
            }
        }
        return true;
    }
    
    // Time Complexity: O(N^2), Space Complexity: O(1)
    public static boolean isUniqueWithoutAdditionalSpace(String str){
    	for(int i=0; i<str.length(); i++){
    		for(int j=i+1; j<str.length(); j++){
    			if(str.charAt(i) == str.charAt(j)){
    				return false;
    			}
    		}
    	}
    	return true;
    }

    
}
