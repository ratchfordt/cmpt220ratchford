package lab2;
import java.util.Scanner;

public class lab2strings {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String a = s.next();
		
		System.out.print("Enter another string: ");
		String b = s.next();
		
		String first = null;
		String second = null;
		
		int shorter;
		if(a.length() < b.length())
		{
			shorter = a.length();
			first = a;
			second = b;
		}
		else
		{
			shorter = b.length();
			first = b;
			second = a;
		}
		
		if(a.equals(b))
		{
			System.out.println("These strings are identical.");
			System.exit(0);
		}
		
		for(int i=0; i<shorter; i++)
		{
			
			if((int)a.charAt(i) < (int)b.charAt(i)) 
			{
				first = a;
				second = b;
				break;
			}
			else if((int)a.charAt(i) > (int)b.charAt(i))
			{
				first = b;
				second = a;
				break;
			}
			
		}
		System.out.println("First: " + first);
		System.out.println("Second: " + second);
	}
}
