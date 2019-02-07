package lab2;
import java.util.Scanner;

public class lab2characters {
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a character: ");
		char a = s.next().charAt(0);
		
		System.out.print("Enter a second character: ");
		char b = s.next().charAt(0);
		
		int result = (int)(a+b);
		System.out.println("Result is: " + result);
		
	}
}
