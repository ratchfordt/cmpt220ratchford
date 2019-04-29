package cmpt;

import java.util.ArrayList;

public class Course2 {
	private String courseName;
	private static ArrayList<String> students = new ArrayList<String>();
	private int numberOfStudents;
	
	public Course2(String courseName)
	{
		this.courseName = courseName;
	}
	
	public void addStudent(String student) 
	{
		students.add(student);
	}

	public String getCourseName() 
	{
		return courseName;
	}

	// JA: You should not change the contract of the method
	public ArrayList<String> getStudents() 
	{
		return students;
	}

	public int getNumberOfStudents() 
	{
		return numberOfStudents;
	}
	
	public void clear() 
	{
		students = new ArrayList<String>();
		numberOfStudents = 0;
	}
	
	public void dropStudent(String student) 
	{
		students.remove(student);
	}

	public static void main(String[] args)
	{
		Course2 c = new Course2("CMPT 220");
		c.addStudent("Trevor");
		c.addStudent("Ryan");
		c.addStudent("Jackson");
		
		for(int s = 0; s<c.getNumberOfStudents(); s++)
			System.out.println(c.getStudents().get(s));
		
		c.dropStudent("Trevor");
		System.out.println("\n");
		
		for(int s = 0; s<c.getNumberOfStudents(); s++)
			System.out.println(c.getStudents().get(s));
	}
}