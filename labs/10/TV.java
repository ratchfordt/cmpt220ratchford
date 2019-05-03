package cmpt;

public class TV extends Appliance
{
	private double resolution;
	private String brand;
	private boolean hd;
	
	public TV(double v, String c, String mi, double p, double res, String b, boolean def)
	{
		super(v,c,mi,p);
		resolution = res;
		brand = b;
		hd = def;
	}
	
	public TV(double p)
	{
		super(120.0, "Black", "China", p);
		resolution = 1080;
		brand = "Samsung";
		hd = false;
	}

	public String getBrand() 
	{
		return brand;
	}

	public double getResolution() 
	{
		return resolution;
	}

	public boolean isHd()
	{
		return hd;
	}
	
	public String toString()
	{
		return "$"+super.getPrice() + ": " + super.getColor() + " TV made in " + super.getMadeIn();
	}
}
