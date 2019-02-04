import java.util.Scanner;

public class proj1pi {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int isEven = 1;
		double appx = 0.0;
		
		System.out.println("How many degrees would you like to approximate pi to?");
		int n = (int)s.nextInt();
		
		for(int i=0; i<n; i++) 
		{
			isEven++;
			double d = (1 + 2*i);
			if(isEven%2 == 0) 
				appx += 1/d;
			else
				appx -= 1/d;
		}
		appx *= 4;
		System.out.println("Pi is approximated to " + appx + " at " + n + " degrees.");
	}
}
