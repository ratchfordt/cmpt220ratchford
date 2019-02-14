package cmpt;
import java.util.Scanner;

public class lab3vowels {
	public static double vowels(String sr)
	{
		sr = sr.replace(" ", "");
		String[] a = sr.split("");
		
		double n = 0;
		for(String i : a)
		{
			if(
			i.toLowerCase().equals("a")||
			i.toLowerCase().equals("e")||
			i.toLowerCase().equals("i")||
			i.toLowerCase().equals("o")||
			i.toLowerCase().equals("u"))
				n += 1;
			else if(i.toLowerCase().equals("y"))
				n += .5;
			else
				n += 0;
		}
		return n;
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String user = s.nextLine();
		System.out.print("Your string has " + vowels(user) + " vowels in it.");
	}
}
