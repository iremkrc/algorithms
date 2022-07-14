// 1.5 One Away: There are three types of edits that can be performed on strings: insert a character, remove a character, or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.

public class OneAway {

	// Time Complexity: O(n), Space Complexity: O(1)
    public static boolean isOneAway(String str1, String str2){
    	int len1 = str1.length();
    	int len2 = str2.length();
    	if(Math.abs(len1-len2) > 1) return false;
    	
    	boolean first = true;
    	if(len1 == len2){
    		for(int i=0; i<len1; i++){
    			
    			if(str1.charAt(i) != str2.charAt(i)){
    				if(first) first = false;
    				else return false;
    			}
    		}
    	}else if(len1 < len2){
    	int j = 0;
    		for(int i=0; i<len1; i++){
    			if(str1.charAt(i) != str2.charAt(i+j)){
    				if(first){
    					first = false;
    					j = 1;
    					if(str1.charAt(i) != str2.charAt(i+j)) return false;
    				}
    			}
    		}
    	}else{
    	int j = 0;
    		for(int i=0; i<len2; i++){
    			if(str1.charAt(i+j) != str2.charAt(i)){
    				if(first){
    					first = false;
    					j = 1;
    					if(str1.charAt(i+j) != str2.charAt(i)) return false;
    				}
    			}
    		}
    	}
    	
    	return true;
    }
}
