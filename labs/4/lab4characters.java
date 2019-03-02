package cmpt;
import java.util.Scanner;

public class lab4characters {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter something: ");
		String user = s.nextLine().replace(" ", "");
		
		int[] letterCount = new int[26];
		int[] lowerCount = new int[26];
		char[] list = user.toCharArray();
		
		for(char i:list)
		{
			int index = (int)i;
			
			if(index>=65 && index<=91)
				letterCount[index-65]++;
			
			else if(index>=97 && index<=123)
				lowerCount[index-97]++;
		}

		for(int i=0; i<letterCount.length; i++)
		{
			if(letterCount[i]!=0)
				System.out.println("Number of " + (char)(i+65) + ": " + letterCount[i]);
			if(lowerCount[i]!=0)
				System.out.println("Number of " + (char)(i+97) + ": " + lowerCount[i]);
		}
		s.close();
	}

}
