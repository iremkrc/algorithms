import java.util.HashMap;

// 1.4 Palindrome Permutation: Given a string, write a function to check if it is a permutation of a palin­drome. A palindrome is a word or phrase that is the same forwards and backwards. A permutationis a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.

public class PalindromePermutation {

	// Time Complexity: O(N), Space Complexity: O(N)
    public static boolean palindromePermutation(String str){
    	HashMap<Character, Integer> letters = new HashMap<>();
    	for(int i=0; i<str.length(); i++){
    		if(str.charAt(i) != ' '){
    			if(letters.containsKey(str.charAt(i))){
    				letters.put(str.charAt(i), letters.get(str.charAt(i))+1);
    			}else{
    				letters.put(str.charAt(i), 1);
    			}
    		}
    	}
    	int oddCounter = 0;
    	for(char c: letters.keySet()){
    		if(letters.get(c) %2 == 1){
    			oddCounter++;
    		}
    	}
    	
    	if(oddCounter <= 1){
    		return true;
    	}else{
    		return false;
    	}
    }
}
