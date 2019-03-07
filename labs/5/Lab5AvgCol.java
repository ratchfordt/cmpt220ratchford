package cmpt;
import java.util.Scanner;

public class Lab5AvgCol {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double[][] user;		
		
		System.out.print("Enter the number of rows in your array: ");
		int row = s.nextInt();
		
		System.out.print("Enter the number of columns: ");
		int col = s.nextInt();
		
		user = new double[row][col];
		
		System.out.println();
		for(int x=0; x<row; x++)
			for(int y=0; y<col; y++)
			{
				System.out.print("Enter the value at ["+x+"]["+y+"]: " );
				user[x][y] = s.nextDouble();
			}
		
		System.out.println();
		for(int i=0; i<user.length; i++)
		{
			for(int j=0; j<user[0].length; j++)
				System.out.print((int)user[i][j]+" ");
			System.out.println();
		}
		
		System.out.print("\nEnter the column to take the average of: ");
		int n = s.nextInt();
		
		System.out.println("The average of column " + n + " is " + averageRow(user, n));
		
		s.close();
	}
	
	public static double averageRow(double[][] mat, int col)
	{
		int sum=0;
		try 
		{
			for(int y=0; y<mat.length; y++)
				sum += mat[y][col-1];
		}
		catch(Exception e)
		{
			return -1;
		}
		return sum/mat.length;
	}

}
