import java.util.Scanner;

public class lab1convert {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("How many ounces would you like to convert?");
		double oz = s.nextDouble();
		double grams = oz*(28.3495);
		System.out.println(oz + " ounces is " + grams + " grams.");
	}
}
