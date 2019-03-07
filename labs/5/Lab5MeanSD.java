package cmpt;
import java.util.Scanner;

public class Lab5MeanSD {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		double[] user = new double[10];
		
		for(int i=0; i<user.length; i++)
		{
		System.out.print("Enter a number: ");
		user[i] = s.nextDouble();
		}
		
		System.out.println("The mean is: " + mean(user));
		System.out.println("The standard deviation is: " +
		deviation(user));
		
		s.close();
	}
	
	public static double mean(double[] x)
	{
		double sum = 0;
		
		for(double i:x)
			sum += i;
		
		return sum/x.length;
	}
	
	public static double deviation(double[] x)
	{
		double sum = 0;
		
		for(double i:x)
			sum += Math.pow(i-mean(x), 2);
		
		return Math.sqrt(sum/(x.length-1)); 
	}
}
