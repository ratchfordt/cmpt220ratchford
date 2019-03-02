package cmpt;

public class lab45x5 {
	public static void main(String[] args)
			{
				String result = "";
				int count = 0;
				for(int i=0; i<25; i++)
				{
					if(count < 4)
					{
						result += (char)(Math.random()*27+97) + " ";
						count++;
					}
					else
					{
						result += (char)(Math.random()*27+97) + "\n";
						count = 0;
					}
				}
				System.out.println(result);
			}
}
