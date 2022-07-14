// 1.3 URLify: Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string.

// "Mr JoJohn%20Smith"

public class URLify {
	
	// Time Complexity: O(N^2), Space Complexity: O(1), Partially working solution
	public static void urlify(char[] str, int length){
		for(int i=0; i<length; i++){
			if(str[i] == ' '){
				char temp1 = str[i+1];
				char temp2 = str[i+2];
				str[i] = '%';
				str[i+1] = '2';
				str[i+2] = '0';
				char temp3 = ' ';
				char temp4 = ' ';
				for(int j=i+3; j<length+1; j=j+2){
					temp3 = str[j];
					temp4 = str[j+1];
					str[j] = temp1;
					str[j+1] = temp2;
					temp1 = temp3;
					temp2 = temp4;
				}
			}
		}
		for(char s: str){
			System.out.print(s);
		}
	}
	
    // Time Complexity: O(N), Space Complexity: O(1)
	public static void urlifyUpdated(char[] str, int length){
		int spaceCounter = 0;
		for(int i=0; i<length; i++){
			if(str[i] == ' '){
				spaceCounter++;
			}
		}
		int spaceAtTheEnd = spaceCounter*2;
		for(int i=length-1; i>=0; i--){
			if(str[i] != ' '){
				str[i+spaceAtTheEnd] = str[i];
			}else{
				spaceAtTheEnd -= 2;
				str[i+spaceAtTheEnd] = '%';
				str[i+spaceAtTheEnd+1] = '2';
				str[i+spaceAtTheEnd+2] = '0';
			}
		}
	}
}






































