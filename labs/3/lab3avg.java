package cmpt;
import java.util.Scanner;

public class lab3avg {
	public static double average(double a, double b, double c)
	{
		return (a+b+c)/3;
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double one = s.nextDouble();
		System.out.print("Enter a second number: ");
		double two = s.nextDouble();
		System.out.print("Enter a third number: ");
		double three = s.nextDouble();
		
		System.out.println("The average of your numbers is " + average(one, two, three));
	}
}
