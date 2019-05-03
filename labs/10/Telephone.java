package cmpt;

public class Telephone extends Appliance
{
	private boolean waterproof;
	private String brand;
	private boolean smart;
	
	public Telephone(double v, String c, String mi, double p, boolean w, String b, boolean sm)
	{
		super(v,c,mi,p);
		waterproof = w;
		brand = b;
		smart = sm;
	}
	
	public Telephone(double p)
	{
		super(80, "White", "Taiwan", p);
		waterproof = false;
		brand = "iPhone";
		smart = true;
	}

	public String getBrand() 
	{
		return brand;
	}

	public boolean isWaterproof() 
	{
		return waterproof;
	}

	public boolean isSmart()
	{
		return smart;
	}
	
	public String toString()
	{
		return "$" + super.getPrice() + ": " + super.getColor() + " phone made in " + super.getMadeIn();
	}
}
