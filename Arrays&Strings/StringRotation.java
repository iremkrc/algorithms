// 1.9 String Rotation: Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one call to isSubstring (e.g., "waterbottle" is a rotation of "erbottlewat")

public class StringRotation {

	// Time Complexity: O(N), Space Complexity: O(1)
    public static boolean isSubstring(String s, String sub){
    	if(s.length() < sub.length()){
    		return false;
    	}
    	int index = 0;
    	int subIndex = 0;
    	int counter = 0;
    	while(index < s.length() && subIndex < sub.length()){
    		if(s.charAt(index) != sub.charAt(subIndex)){
    			index++;
    			if(counter > 0) counter = 0;
    		}else{
    			counter++;
    			index++;
    			subIndex++;
    		}
    	}
    	if(counter == sub.length()) return true;
    	else return false;
    }
	
    // Time Complexity: O(N), Space Complexity: O(1)
    public static boolean isRotation(String s1, String s2){
    	if(s1.length() != s2.length()) return false;
    	return isSubstring(s1+s1, s2);
    }
}
