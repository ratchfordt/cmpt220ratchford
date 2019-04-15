package cmpt;

public class Circle
{
	private double x;
	private double y;
	private double r;
	
	public Circle()
	{
		x = 0;
		y = 0;
		r = 1;
	}
	
	public Circle(double xcoord, double ycoord, double radius)
	{
		x = xcoord;
		y = ycoord;
		r = radius;
	}
	
	public double getX()
	{
		return x;
	}
	
	public double getY()
	{
		return y;
	}
	
	public double getRadius()
	{
		return r;
	}
	
	public double getArea()
	{
		return Math.PI*r*r;
	}
	
	public double getPerimeter()
	{
		return Math.PI*2*r;
	}
	
	public boolean contains(double xcoord, double ycoord)
	{
		double d = Math.sqrt(Math.pow(xcoord-x,2) + Math.pow(ycoord-y, 2));
		
		if(d<r)
			return true;
		
		return false;
	}
	
	public boolean contains(Circle circle)
	{
		double d = Math.sqrt(Math.pow(circle.getX()-x,2) + Math.pow(circle.getY()-y, 2));
		
		if(d+circle.getRadius()<r)
			return true;
		
		return false;
	}
	
	public boolean overlaps(Circle circle)
	{
		double d = Math.sqrt(Math.pow(circle.getX()-x,2) + Math.pow(circle.getY()-y, 2));
				
		if(d+circle.getRadius()>r && d-circle.getRadius()<r)
			return true;
		
		return false;
	}
	
	public static void main(String[] args)
	{
		Circle c1 = new Circle(2,2,5.5);
		System.out.println("c1.contains(3,3): " + c1.contains(3, 3));
		System.out.println("c1.contains(new Circle(4,5,10.5): " + c1.contains(new Circle(4,5,10.5)));
		System.out.println("c1.overlaps(new Circle(3,5,2.3): " + c1.overlaps(new Circle(3,5,2.3)));
	}
	
}
