package cmpt;

public class Manager extends Employee implements Printable
{
	
	public Manager(String n, double a, double hr)
	{
		super.name = n;
		super.age = a;
		super.hourRate = hr;
	}
	
	public Manager(String n, double a)
	{
		super.name = n;
		super.age = 50;
		super.hourRate = a;
	}
	
	public double salary(double hours)
	{
		return hours*hourRate;
	}
	
	public String toString()
	{
		return super.toString();
	}
	
	public void print() 
	{
		System.out.println(toString());
	}
}
