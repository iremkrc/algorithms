// 1.6 String Compression: Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a - z).

public class StringCompression {

	// Time Complexity: O(N), Space Complexity: O(N)
	public static String compressString(String str){
		int index = 0;
		int counter = 0;
		StringBuilder sb = new StringBuilder();
		while(index < str.length()-1){
			if(str.charAt(index) == str.charAt(index+1)){
				counter++;
				index++;
				if(index == str.length()-1){
					sb.append(str.charAt(index));
					sb.append(String.valueOf(counter+1));
				}
			}else{
				sb.append(str.charAt(index));
				sb.append(String.valueOf(counter+1));
				counter = 0;
				index++;
				if(index == str.length()-1){
					sb.append(str.charAt(index));
					sb.append("1");
				}
			}
		}
		if(str.length() > sb.length()) str = sb.toString();
		
		return str;
	}
}
