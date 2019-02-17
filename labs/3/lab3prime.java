package cmpt;

public class lab3prime {
	public static void main(String[] args)
	{
		int max = 0;
		boolean prime = true;
		for(int n=0; n<15000; n++)
		{
			for(int i=2; i<n; i++){
	            if(n%i==0)
	            {
	            	prime = false;
	            	i=n;
	            }
			}
			if(prime)
				max = n;
			prime = true;
		}
		System.out.print(max);
	}
}
