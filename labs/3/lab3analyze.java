package cmpt;
import java.util.ArrayList;
import java.util.Scanner;

public class lab3analyze {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Please enter a positive integer. You may end input by entering 0: ");
		
		int next = -1;
		while(next != 0)
		{
			next = Math.abs(s.nextInt());
			list.add(next);
		}
		
		int even = 0;
		int sum = 0;
		for(int i : list) 
		{
			sum += i;
			if(i%2==0)
				even++;
		}
		int avg = sum/list.size();
		
		System.out.println("The total amount of even numbers: " + even);
		System.out.println("The total sum: " + sum);
		System.out.println("The average is: " + avg);
		
	}

}
