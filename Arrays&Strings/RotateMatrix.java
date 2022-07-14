// 1.7 Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in place?

// ASK: Which direction, clock-wise or counter clock-wise? I assume it is clock-wise. 
/*
	1 2 3 4    7 4 1     0,0 0,3 3,3  3,0
	4 5 6 8 -> 8 5 2     
	7 8 9 7
	3 5 4 9   temp = 6   temp2 = 3
*/
public class RotateMatrix {
	// Time Complexity: O(N^2), Space Complexity: O(N^2)
    public static void rotateMatrix(int[][] matrix){
    	int N = matrix.length;
    	int[][] newMatrix = new int[N][N];
    	for(int i=0; i<N; i++){
    		for(int j=0; j<N; j++){
    			newMatrix[j][N-1-i] = matrix[i][j];
    		}
    	}
    	for(int i=0; i<N; i++){
    		for(int j=0; j<N; j++){
    			matrix[i][j] = newMatrix[i][j];
    		}
    	}
	}
	// Time Complexity: O(N^2), Space Complexity: O(1)
	public static void rotateMatrixInPlace(int[][] matrix){
		int N = matrix.length;
		for(int i=0; i<(N+1)/2; i++){
			for(int j=0; j<N/2; j++){
			/*
				int temp = matrix[j][N-1-i];
				matrix[j][N-1-i] = matrix[i][j];
				int temp2 = matrix[N-1-i][N-1-j];
				matrix[N-1-i][N-1-j] = temp;
				temp = matrix[N-1-j][i];
				matrix[N-1-j][i] = temp2;
				matrix[i][j] = temp;	
			*/
				int temp = matrix[i][j];
				matrix[i][j] = matrix[N-1-j][i];
				matrix[N-1-j][i] = matrix[N-1-i][N-1-j];
				matrix[N-1-i][N-1-j] = matrix[j][N-1-i];
				matrix[j][N-1-i] = temp;
			}
		}
	}
}
