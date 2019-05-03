package cmpt;

public class Clerk extends Employee 
{
	
	public Clerk(String n, double a, double hr)
	{
		super.name = n;
		super.age = a;
		super.hourRate = hr;
	}
	
	public double salary(double hours)
	{
		return hours*hourRate;
	}
	
	public String toString()
	{
		return super.toString();
	}
}
