package cmpt;
import java.text.DecimalFormat;

public class lab4table 
{
	public static void main(String[] args)
	{
		DecimalFormat dform = new DecimalFormat("#.00");
		System.out.println("in\t   cm | cm\t  in");
		for(double in=1, cm=1; in<=50; in++, cm+=5)
		{
			System.out.println(dform.format(in) + "\t" + dform.format((2.54*cm)) + " | " +
		cm + "\t" + .39*in);
		}
	}
}
