package cmpt;

public class lab3numbers {

	public static void main(String[] args)
	{
		String output = "";
		int counter = 0;
		for(int i=100; i<=500; i++)
		{
			if(i%5==0 ^ i%7 ==0)
			{
				if(counter<9)
				{
					output += Integer.toString(i) + " ";
					counter++;
				}
				else
				{
					counter = 0;
					output += Integer.toString(i) + "\n";
				}
			}
		}
		System.out.println(output);	

	}

}
