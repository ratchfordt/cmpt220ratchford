package cmpt;

public class lab3pentagon {
	public static double pentagon(int n)
	{
		return (3*Math.pow(n, 2)-n)/2;
	}
	
	public static void main(String[] args)
	{
		int count = 0;
		String output = "";
		for(int i=0; i<=50; i++)
		{
			if(count >=9)
			{
				output += pentagon(i) + "\n";
				count = 0;
			}
			else
			{
				count++;
				output += pentagon(i) + " ";
			}
		}
		System.out.println(output);
		
	}
}
