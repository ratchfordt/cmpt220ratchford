package cmpt;

public class Toaster extends Appliance
{
	int slots;
	double width;
	double height;
	
	public Toaster(double v, String c, String mi, double p, int s, double w, double h)
	{
		super(v,c,mi,p);
		slots = s;
		width = w;
		height = h;
	}
	
	public Toaster(double p)
	{
		super(120, "Red", "USA", p);
		slots = 2;
		width = 10;
		height = 5;
	}
	
	public int getSlots()
	{
		return slots;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getHeight()
	{
		return height;
	}
	
	public String toString()
	{
		return "$" + super.getPrice()+ ": " + super.getColor() + " toaster, made in " + super.getMadeIn();
	}
}
