package cmpt;

public class lab4list {
	public static void main(String[] args)
	{
		double[] list = new double[15];
		list[0] = -1;
		for(int n=1; n<11; n+=1)
			addendum(list, n);
		
		printThis(list);
		
		insertAt(list, 10, 3);
		printThis(list);
		
		insertAt(list, 100, 7);
		printThis(list);
	}
	
	public static void addendum(double[] a, double x)
	{
		for(int i=0; i<a.length; i++)
			if(a[i]==-1)
			{
				a[i]=x;
				a[i+1]=-1;
				return;
			}
	}
	
	public static void insertAt(double[] a, double num, int at)
	{
		double toAdd = a[at];
		a[at] = num;
		double temp;
		for(int i=at+1; i<a.length; i++)
		{
			temp = a[i];
			a[i] = toAdd;
			toAdd = temp;
		}
	}
	
	public static void printThis(double[] a)
	{
		for(double m:a)
			System.out.print((int)m + " ");
		System.out.println();
	}
}
