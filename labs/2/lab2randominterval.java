package lab2;
import java.util.Scanner;

public class lab2randominterval {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Input a lower bound: ");
		double low = s.nextDouble();
		System.out.print("Input an upper bound: ");
		double high = s.nextDouble();	
		
		for(int i = 0; i < 3; i++) 
		{
			System.out.println((int)(Math.random()*(high-low+1))+low);
		}
		
	}
}
