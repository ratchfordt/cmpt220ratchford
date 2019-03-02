package cmpt;
import java.util.ArrayList;
import java.util.Scanner;

public class lab4duplicates 
{
	public static void main(String [] args)
	{	
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter your numbers separated by spaces: ");
		String user = s.nextLine();
		String[] sa = user.split(" ");
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int l=0; l<sa.length; l++)
			a.add(Integer.parseInt(sa[l]));
		
		ArrayList<Integer> dupes = new ArrayList<Integer>();
		
		for(int i:a)
		{
			if(!dupes.contains(i))
				dupes.add(i);
		}
		
		for(int j:dupes)
			System.out.print(j+ " ");
		
		s.close();
	}
}
