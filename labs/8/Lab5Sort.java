package cmpt;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab5Sort
{
   public static void sort(ArrayList<Integer> a)
   {
	   for(int i=0; i<a.size(); i++)
		   for(int j=0; j<a.size()-1; j++)
			   if(a.get(j) > a.get(j+1))
				{
					int temp = a.get(j);
					a.set(j, a.get(j+1));
					a.set(j+1, temp);
				}
   }
   
	public static void main(String args[])
	{
		ArrayList<Integer> f = new ArrayList<Integer>();
		Scanner s= new Scanner(System.in);
		int n=0;
		
		while(n<5)
		{
			System.out.print("Enter a number: ");
			int x = s.nextInt();
			f.add(x);
			n++;
		}
		
		System.out.print(f);
		sort(f);
		System.out.print("\n" + f);
		
		s.close();
	}
}
