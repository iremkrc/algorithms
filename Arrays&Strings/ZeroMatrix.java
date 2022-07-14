import java.util.HashSet;
import java.util.Set;

public class ZeroMatrix {

    // Time Complexity: O(N*M), Space Complexity: O(max(N,M))
	public static void zeroMatrix(int[][] matrix){
		int N = matrix.length;
		int M = matrix[0].length;
		Set<Integer> rowSet = new HashSet<>();
		Set<Integer> columnSet = new HashSet<>();
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				if(matrix[i][j] == 0){
					rowSet.add(i);
					columnSet.add(j);
				}
			}
		}
		
		for(int i: rowSet){
			for(int j=0; j<M; j++){
				matrix[i][j] = 0;
			}
		}
		for(int i=0; i<N; i++){
			for(int j: columnSet){
				matrix[i][j] = 0;
			}
		}
	}
	
	// Time Complexity: O(N*M), Space Complexity: O(1)
	public static void zeroMatrixInPlace(int[][] matrix){
		int N = matrix.length;
		int M = matrix[0].length;
		
		boolean rowHasZero = false;
		boolean columnHasZero = false;
		
		for(int j=0; j<M; j++){
			if(matrix[0][j] == 0){
				rowHasZero = true;
				break;
			}
		}
		for(int i=0; i<N; i++){
			if(matrix[i][0]==0){
				columnHasZero = true;
				break;
			}
		}
		for(int i=1; i<N; i++){
			for(int j=1; j<M; j++){
				if(matrix[i][j] == 0){
					matrix[0][j] = 0;
					matrix[i][0] = 0;
				}
			}
		}
		for(int j=1; j<M; j++){
			if(matrix[0][j] == 0){
				for(int i=1; i<N; i++){
					matrix[i][j] = 0;
				}
			}
		}
		
		for(int i=1; i<N; i++){
			if(matrix[i][0] == 0){
				for(int j=1; j<M; j++){
					matrix[i][j] = 0;
				}
			}
		}
		
		if(rowHasZero){
			for(int j=0; j<M; j++){
				matrix[0][j] = 0;
			}
		}
		if(columnHasZero){
			for(int i=0; i<N; i++){
				matrix[i][0] = 0;
			}
		}
	}
}
