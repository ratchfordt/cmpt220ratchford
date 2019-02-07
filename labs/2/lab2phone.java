package lab2;

public class lab2phone {
	public static void main(String[] args)
	{
		String number = "(";
		for(int i = 0; i<3; i++) 
		{
			number += (int)(Math.random()*10);
		}
		
		number += ")";
		
		for(int i = 0; i<3; i++) 
		{
			number += (int)(Math.random()*10);
		}
		
		number += "-";
		
		for(int i = 0; i<4; i++) 
		{
			number += (int)(Math.random()*10);
		}
		
		System.out.print(number);
	}
}
