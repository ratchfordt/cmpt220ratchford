package cmpt;
import java.util.Scanner;

public class Project1 {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		String user = s.nextLine();
		String[] userSt = user.split(" ");
		int[] hwn = new int[3];
		
		for(int i=0; i<userSt.length; i++)
			hwn[i] = Integer.parseInt(userSt[i]);
		
		int h = hwn[0];
		int w = hwn[1];
		int n = hwn[2];
		
		int[] bricks = new int[n];
		
		user = s.nextLine();
		userSt = user.split(" ");
		
		for(int i=0; i<userSt.length; i++)
			bricks[i] = Integer.parseInt(userSt[i]);
		
		s.close();
		
		if(lars(bricks, h, w))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	
	public static boolean lars(int[] bricks, int h, int w)
	{
		int layer = 0;
		int height = 0;
		
		for(int index=0; index<bricks.length; index++)
		{
			if(height>h)
				return true;
			
			layer += bricks[index];
			
			if(layer>w)
				return false;
			else if(layer==w)
			{
				height+=1;
				layer = 0;
			}
		}
		if(height < h)
			return false;
		else
			return true;
	}
	
}
