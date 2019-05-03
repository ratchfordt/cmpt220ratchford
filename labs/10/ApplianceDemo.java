package cmpt;

public class ApplianceDemo
{
	public static void main(String[] args)
	{
		Appliance vec[] = 
			{
				new TV(319),
				new Telephone(231),
				new Toaster(227),
				new TV(195),
				new Telephone(244),
				new Toaster(280),
				new TV(49),
				new Telephone(169),
				new Toaster(134),
				new TV(163),
				new Telephone(286),
				new Toaster(281),
				new TV(63),
				new Telephone(83),
				new Toaster(382),
				new TV(367),
				new Telephone(239),
				new Toaster(253),
				new TV(5),
				new Telephone(202),
				new Toaster(336),
				new TV(6),
				new Telephone(142),
				new Toaster(359),
				new TV(212),
				new Telephone(92),
				new Toaster(101),
				new TV(18),
				new Telephone(102),
				new Toaster(326),
				new TV(191),
				new Telephone(392),
				new Toaster(44),
				new TV(72),
				new Telephone(10),
				new Toaster(97),
				new TV(208),
				new Telephone(99),
				new Toaster(100),
				new TV(132)
			};
		
		 for (int i = vec.length - 1; i > 0; i--) 
	        for (int j = 0; j < i; j++) 
            	if (vec[j + 1].compareTo(vec[j]) < 0) 
	            {
	                Appliance temp = vec[j + 1];
	                vec[j + 1] = vec[j];
	                vec[j] = temp;
	            }
		 
		 for(Appliance a:vec)
		 {
			 System.out.println(a);
		 }
	}
}
