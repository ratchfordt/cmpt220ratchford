package cmpt;
import java.util.Scanner;

public class Lab7Factors 
{

	public static int[] factor(int x)
	{
		int[] j = {-1,x};
		for(int n=2; n<x; n++)
			if(x%n==0)
			{
				j[0] = (x/n);
				j[1] = n;
				return j;
			}
		return j;
	}
	
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int user = s.nextInt();
		StackOfIntegers stack = new StackOfIntegers();
		
		while(factor(user)[0] != -1)
		{
			stack.push(factor(user)[1]);
			user = factor(user)[0];
		}
		stack.push(factor(user)[1]);
		
		while(!stack.empty())
			System.out.print(stack.pop());
		
		s.close();
	}

}
