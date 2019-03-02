package cmpt;
import java.util.Scanner;

public class lab4sort
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a list of positive numbers separated by a space. Finish the sequence by entering a 0: ");
		String user = s.nextLine();
		String[] sa = user.split(" ");
		int[] a = new int[sa.length];
		
		for(int conv=0; conv<sa.length && conv<100; conv++)
		{
			int n = Math.abs(Integer.parseInt(sa[conv]));
			if(n != 0)
				a[conv] = n;
			else
				break;
		}
		
		for (int i=0; i<a.length-1; i++)           
			for (int j=0; j<a.length-i-1; j++)  
				if (a[j] > a[j+1]) 
				{
					int temp = a[j]; 
					a[j] = a[j+1]; 
					a[j+1] = temp; 
				}
		for(int t:a)
			System.out.print(t + " ");
		
		s.close();
	}

}
