public class Test {
    public static void main(String[] args) {
        System.out.println(IsUnique.isUniqueWithMap("asdfghj"));
        System.out.println(IsUnique.isUniqueWithoutAdditionalSpace("a"));
        System.out.println(CheckPermutation.checkPermutation("abca", "xcvb"));
        String s = "            ";
        char[] arr = s.toCharArray();
        URLify.urlifyUpdated(arr, 4);
        for(char c: arr){
			System.out.print(c);
		}
        System.out.println("\n");
        System.out.println(PalindromePermutation.palindromePermutation("tact coa"));

        System.out.println(OneAway.isOneAway("xxyx", "xxx"));

        System.out.println(StringCompression.compressString("aabcccccaaax"));
        int[][] matrix = new int[][]{
            {0, 2, 3, 9},
            {4, 5, 6, 8},
            {7, 8, 9, 7},
            {1, 11, 0, 6}
        };
        ZeroMatrix.zeroMatrixInPlace(matrix);
        
        for(int i=0; i<matrix.length; i++){
    		for(int j=0; j<matrix.length; j++){
    			System.out.print(matrix[i][j] + " ");
    		}
    		System.out.println();
    	}

        System.out.println(StringRotation.isRotation("water", "terwx"));

    }
}
