package cmpt;

public class Appliance 
{
	private double voltage;
	private String color;
	private String madeIn;
	private double price;
	
	public Appliance(double v, String c, String mi, double p)
	{
		voltage = v;
		color = c;
		madeIn = mi;
		price = p;
	}
	
	public double getVoltage()
	{
		return voltage;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String getMadeIn()
	{
		return madeIn;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double p)
	{
		price = p;
	}
	
	public int compareTo(Appliance a)
	{
		if(a.getPrice() > price)
			return -1;
		
		if(a.getPrice() < price)
			return 1;
		
		return 0;
	}
	
	public String toString()
	{
		return color + " appliance, made in " + madeIn;
	}
}
