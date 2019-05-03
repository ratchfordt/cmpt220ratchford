package cmpt;

public class Rectangle implements Printable
{
	private double x;
	private double y;
	
	public Rectangle(double xc, double yc)
	{
		x = xc;
		y = yc;
	}
	
	public String toString()
	{
		return "x= " + x + ", y= " + y;
	}
	
	public void print()
	{
		System.out.println(toString());
	}
}
