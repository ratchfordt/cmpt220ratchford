package cmpt;
import java.util.Scanner;

public class Lab5Max {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double[] user = new double[10];
		
		for(int i=0; i<user.length; i++)
		{
		System.out.print("Enter a number: ");
		user[i] = s.nextDouble();
		}
		
		System.out.println("The maximum number is " + max(user));
		s.close();
	}
	
	public static double max(double[] array)
	{
		double m = array[0];
		
		for(double num:array)
			if(num>m)
				m = num;
		
		return m;
	}
}
