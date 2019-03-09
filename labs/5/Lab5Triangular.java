package cmpt;

public class Lab5Triangular 
{
	public static void main(String[] args)
	{
	double[][] mat = {{2,1,4},{0,3,-1},{0,0,-2}}; 
	//This is not an upper triangular matrix by the given definition. at [2][0] row -2 and col = 2, so [0][2] should not be 0, etc.
	//If you meant that a cell is 0 when row < col, this matrix is upper triangular. I have adjusted my code to assume that the given matrix is upper triangular.		
			for(int i=0; i<3; i++)
			{
				for(int j=0; j<3; j++)
					System.out.print(mat[i][j] + " ");
				System.out.println();
			}
			
			System.out.println("\nIs this upper triangular? " + isUpperTriangular(mat));
			
	}
	
	public static boolean isUpperTriangular(double[][] array)
	{
		for(int x=0; x<array.length; x++)
			for(int y=0; y<array[0].length; y++)
				if(array[x][y] == 0)
				{
					double row = 0;
					double col = 0;
					
					for(double i:array[x])
						row+= i;
					
					for(int i=0; i<array.length; i++)
						col += array[i][y];
					
					if(row>col)
						return false;
				}
		
		return true;
	}

}
