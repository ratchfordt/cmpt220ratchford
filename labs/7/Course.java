package cmpt;

public class Course {
	private String courseName;
	private String[] students = new String[30];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		String[] newStudents = new String[students.length + 5];
		
		if(numberOfStudents>=students.length) 
		{
			for(int i=0; i<students.length; i++)
				newStudents[i]=students[i];
			students = newStudents;
		}
		
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void clear()
	{
		students = new String[30];
		numberOfStudents = 0;
	}
	
	public void dropStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				for (int j=i+1; j < numberOfStudents; j++)
					students[j - 1] = students[j];
				numberOfStudents--;
				return;
			}
		}
	}

	public static void main(String[] args)
	{
		Course c = new Course("CMPT 220");
		c.addStudent("Trevor");
		c.addStudent("Ryan");
		c.addStudent("Jackson");
		
		for(int s = 0; s<c.getNumberOfStudents(); s++)
			System.out.println(c.getStudents()[s]);
		
		c.dropStudent("Trevor");
		System.out.println("\n");
		
		for(int s = 0; s<c.getNumberOfStudents(); s++)
			System.out.println(c.getStudents()[s]);
	}
}