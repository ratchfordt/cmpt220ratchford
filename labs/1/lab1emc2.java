import java.util.Scanner;

public class lab1emc2 {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the mass in Kg: ");
		double m = s.nextDouble();
		int c = 299972458;
		double E = m*c*c;
		System.out.println("The energy is " + E);
	}
}
