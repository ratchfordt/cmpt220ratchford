package cmpt;

public class MyLong 
{
	private long value;
	
	public MyLong(long l)
	{
		value = l;
	}
	
	public long getValue()
	{
		return value;
	}
	
	public boolean isEven()
	{
		return value%2==0;
	}
	
	public boolean isOdd()
	{
		return !(value%2==0);
	}
	
	public boolean isPrime()
	{
		if(Math.abs(value)<=3)
			return true;
		
		for(int i=2; i<value-1; i++)
			if(value%i==0)
				return false;
		
		return true;
	}
	
	public boolean isEven(long l)
	{
		return l%2==0;
	}
	
	public boolean isOdd(long l)
	{
		return !(l%2==0);
	}
	
	public boolean isPrime(long l)
	{
		if(Math.abs(l)<=3)
			return true;
		
		for(int i=2; i<l-1; i++)
			if(l%i==0)
				return false;
		
		return true;
	}
	
	public boolean isEven(MyLong l)
	{
		return l.getValue()%2==0;
	}
	
	public boolean isOdd(MyLong l)
	{
		return !(l.getValue()%2==0);
	}
	
	public boolean isPrime(MyLong l)
	{
		if(Math.abs(l.getValue())<=3)
			return true;
		
		for(int i=2; i<l.getValue()-1; i++)
			if(l.getValue()%i==0)
				return false;
		
		return true;
	}
	
	public boolean equals(long l)
	{
		return l == value;
	}
	
	public boolean equals(MyLong l)
	{
		return l.getValue() == value;
	}
	
	public static long parseLong(char[] c)
	{
		String s = "";
		
		for(char x:c)
			s+=x;
		
		return Long.parseLong(s);
	}
	
	public static long parseLong(String s)
	{
		return Long.parseLong(s);
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args)
	
		MyLong mine = new MyLong(19);
		MyLong yours = new MyLong(10);
		MyLong ours = new MyLong(10);
		String a = "10";
		char[] ch = {'1','2'};
		
		System.out.println("mine.getValue(): " + mine.getValue());
		System.out.println("[19].isEven(): " + mine.isEven());
		System.out.println("[19].isOdd(): " + mine.isOdd());
		System.out.println("[10].isOdd(yours): " + yours.isOdd(yours));
		System.out.println("isPrime(11): " + mine.isPrime(11));
		System.out.println("[10].equals([10]): " + yours.equals(ours));
		System.out.println("mine.parseLong({'1','2'}): " + mine.parseLong(ch));
		System.out.println("mine.parseLong(\"10\"): " + mine.parseLong(a));
	}
}
