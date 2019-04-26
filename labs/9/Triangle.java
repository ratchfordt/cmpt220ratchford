package cmpt;

import java.util.Scanner;

public class Triangle //extends GeometricObject
{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle()
	{
		super();
		side1 = 1;
		side2 = 1;
		side3 = 1;
	}
	
	public Triangle(double s1, double s2, double s3) throws IllegalTriangleException
	{
		if(s1 + s2 < s3 || s1 + s3 < s2 || s2 + s3 < s1)
			throw new IllegalTriangleException();
		
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	
	public double getArea()
	{
		double s = (side1 + side2 + side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	
	public double getPerimeter()
	{
		return side1 + side2 + side3;
	}
	
	public String toString()
	{
		return "Triangle: side1: " + side1 + " side2: " + side2 + " side3: " + side3;
	}
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter side 1: ");
		double s1 = s.nextDouble();
		
		System.out.print("Enter side 2: ");
		double s2 = s.nextDouble();
		
		System.out.print("Enter side 3: ");
		double s3 = s.nextDouble();
		
		Triangle t = new Triangle(s1, s2, s3);
		
		System.out.print("Enter a color: ");
		String color = s.next();
		
		System.out.print("Is the triangle filled? (y/n) ");
		String fill = s.next();
		boolean filled = true;
		
		if(fill.toLowerCase().charAt(0) == 'y')
			filled = true;
		else
			filled = false;
		
		System.out.print(t + ", color = " + color + ", filled = " + filled);
		
		s.close();
	}
}
