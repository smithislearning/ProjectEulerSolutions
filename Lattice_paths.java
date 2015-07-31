import java.util.Arrays;

public class Lattice_paths{
	private static long[][] grid = new long[21][21];
	private static int i = 0;
	private static int j = 0;	
	
	public static void main(String[] args){
		for (i = 0; i < 21; i++) {
			grid[i][0] = 1;
		}
		for (j = 0; j < 21; j++) {
			grid[0][j] = 1;
		}
		for (i = 1; i < 21; i++){
			for (j = 1; j < 21; j++) {
				grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
			}
		}
		System.out.println(grid[20][20]);
	}

}