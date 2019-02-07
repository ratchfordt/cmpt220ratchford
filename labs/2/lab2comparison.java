package lab2;
import java.util.Scanner;

public class lab2comparison {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your first number: ");
		double a = s.nextDouble();
		System.out.print("Enter your second number: ");
		double b = s.nextDouble();
		
		System.out.println(a + " is LESS THAN " + b + " ? " + (a<b));
		System.out.println(a + " is LESS THAN OR EQUAL TO " + b + " ? " + (a<=b));
		System.out.println(a + " is EQUAL TO " + b + " ? " + (a==b));
		System.out.println(a + " is NOT EQUAL TO " + b + " ? " + (a!=b));
		System.out.println(a + " is GREATER THAN " + b + " ? " + (a>b));
		System.out.println(a + " is GREATER THAN OR EQUAL TO " + b + " ? " + (a>=b));
	}
}
