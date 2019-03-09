package cmpt;
import java.util.Scanner;
import java.util.Arrays;

public class Lab5Equal {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the first array: ");
		String s1 = s.nextLine();
		String[] s1a = s1.split(" ");
		int[] user1 = new int[s1a.length];
		
		System.out.print("Enter the second array: ");
		String s2 = s.nextLine();
		String[] s2a = s2.split(" ");
		int[] user2 = new int[s2a.length];
		
		for(int i=0; i<s1a.length; i++)
			user1[i] = Integer.parseInt(s1a[i]);
		
		for(int l=0; l<s2a.length; l++)
			user2[l] = Integer.parseInt(s2a[l]);
		
		if(equal(user1, user2))
			System.out.println("These arrays are identical.");
		else
			System.out.println("These arrays are different.");
	
		s.close();
	}
	
	public static boolean equal(int[] x, int[] y)
	{
		if(x[0] != y[0])
			return false;
		
		x[0] = 0;
		y[0] = 0;
		
		Arrays.sort(x);
		Arrays.sort(y);
		try 
		{
			for(int j=0; j<x.length; j++)
				if(x[j] != y[j])
					return false;
		}
		catch(Exception e)
		{
			return false;
		}
		
		return true;
	}
}
