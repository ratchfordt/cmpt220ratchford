package cmpt;

public class Test {

	public static void main(String[] args) {
		Employee vec[] =
		{
			new Manager("John", 52, 104),
			new Clerk("Daniel", 26, 110),
			new Manager("Steve", 42, 120),
			new Manager("Stacey", 34, 120)
		};
		
		double hours[] = {140, 150, 130, 180};
		double total = 0;
		
		for(int i=0; i<vec.length; i++)
		{
			total += vec[i].salary(hours[i]);
			System.out.println(vec[i]);
		}
		
		System.out.println("The total payment is " + total);
	}

}
