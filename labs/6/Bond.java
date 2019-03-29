package cmpt;

public class Bond 
{
	private double coupon;
	private int payments;
	private double interest;
	private double valueMaturity;
	
	public Bond()
	{
		coupon = 200;
		payments = 50;
		interest = .08;
		valueMaturity = 8000;
	}
	
	public Bond(double c, int p, double i, double vm)
	{
		coupon = c;
		payments = p;
		interest = i;
		valueMaturity = vm;
	}
	
	public double getPrice()
	{
		double price = coupon*(1 - (1/Math.pow((1+interest),payments))) + valueMaturity*(1/Math.pow((1+interest), payments));
		price = (double) Math.round(price*100) / 100;
		return price;
	}
	
	public static void main(String[] args)
	{
		Bond b = new Bond(500, 100, .05, 10000);
		System.out.print("Price: $" + b.getPrice());
	}
}
