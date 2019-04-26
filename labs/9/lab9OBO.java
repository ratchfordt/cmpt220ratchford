package cmpt;

import java.util.Scanner;

public class lab9OBO 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int[] a = new int[100];
		for(int i=0; i<100; i++)
			a[i] = (int)(Math.random()*1001);
		
		System.out.print("Enter an index between 0 and 99: ");
		
		try
		{
			int user = s.nextInt();
			System.out.print(a[user]);
		}
		catch (IndexOutOfBoundsException e)
		{
			System.out.print("Out of Bounds");
		}
		catch (Exception e)
		{
			System.out.print("Invalid input");
		}
		
	}
}
