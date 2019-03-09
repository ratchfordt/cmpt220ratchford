package cmpt;

public class Lab5Matrix {

	public static void main(String[] args) 
	{
		int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
				System.out.print(mat[i][j]);
			System.out.println();
		}
		
		System.out.println();
		mat = transpose(mat);
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
				System.out.print(mat[i][j]);
			System.out.println();
		}
	}
	
	public static int[][] transpose(int[][] m)
	{
		int[][] arr2 = new int[m[0].length][m.length];
		
		for(int x=0; x<arr2.length; x++)
			for(int y=0; y<arr2[0].length; y++)
				arr2[x][y] = m[y][x];
		
		return arr2;
	}
}
