package cmpt;
import java.util.Scanner;

public class Lab5Students{
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number of students: ");
		int n = s.nextInt();
		
		String[] names = new String[n];
		double[] scores = new double[n];
		
		for(int i=0; i<n; i++)
		{
			System.out.print("Enter the name of student " + (i+1) + ": ");
			s.nextLine();
			names[i] = s.nextLine();
			
			System.out.print("Enter their score: ");
			scores[i] = s.nextDouble();
		}
		
		for (int i=0; i<scores.length-1; i++)           
			for (int j=0; j<scores.length-i-1; j++)  
				if (scores[j] < scores[j+1]) 
				{
					double temp = scores[j]; 
					scores[j] = scores[j+1]; 
					scores[j+1] = temp; 
					
					String temp2 = names[j]; 
					names[j] = names[j+1]; 
					names[j+1] = temp2; 
				}
		
		for(int l=0; l<scores.length; l++)
			System.out.println(names[l] + " | " + scores[l]);
		
		s.close();
		
	}
}
