package cmpt;

public class SportCar implements Printable
{
	private String name;
	private double price;
	
	public SportCar(String n, double p)
	{
		name = n;
		price = p;
	}
	
	public String toString()
	{
		return "name= " + name + ", price= " + price;
	}
	
	public void print()
	{
		System.out.println(toString());
	}
}
