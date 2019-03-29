package cmpt;

public class Square {

	private double width;
	
	public Square()
	{
		width = 1;
	}
	
	public Square(double w)
	{
		width = w;
	}
	
	public double getArea()
	{
		return width*width;
	}
	public double getPerimeter()
	{
		return 4*width;
	}
	
	public static void main(String[] args) 
	{
		Square sq = new Square(40);
		System.out.println("Square(40)");
		System.out.println("getPerimeter(): " + sq.getPerimeter());
		System.out.println("getArea(): " + sq.getArea());
		
		sq = new Square(35.9);
		System.out.println("\nSquare(35.9)");
		System.out.println("getPerimeter(): " + sq.getPerimeter());
		System.out.println("getArea(): " + sq.getArea());
		
	}

}
