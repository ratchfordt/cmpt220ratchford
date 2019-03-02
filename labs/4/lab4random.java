package cmpt;

public class lab4random {
	public static void main(String[] args)
	{
		int[] numbers = new int[1000];
		for(int i=0; i<numbers.length; i++)
			numbers[i] = (int)(Math.random()*101);
		
		int low = 0;
		int high = 0;
		int sum = 0;
		for(int l:numbers)
			sum += l;
		double avg = sum/numbers.length;
		for(int m:numbers)
		{
			if(m>avg)
				high++;
			else
				low++;
		}
		System.out.println("Average: " + avg +
				"\nLower: " + low + "\nHigher: " + high);
	}
}
