package cmpt;

public class lab3ascii 
{
	public static void main(String[] args)
	{
		String output = "";
		int counter = 0;
		for(int n=1; n<=100; n++)
		{
			if(counter>=20)
			{
				output += (char)n+"\n";
				counter = 0;
			}
			else
			{
				output += (char)n;
			}
			counter++;
		}
		System.out.println(output);
	}
}
