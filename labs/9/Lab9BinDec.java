package cmpt;

public class Lab9BinDec 
{
	public double bin2dec(String binaryString) throws NumberFormatException
	{
		try 
		{
			for(int i=0; i<binaryString.length(); i++)
			{
				int item = Integer.parseInt(binaryString.substring(i, i+1));
				if(item != 0 && item !=1)
					return 1/0;
			}
		}
		catch (Exception e)
		{
			throw new NumberFormatException();
		}
		
		return Integer.parseInt(binaryString, 2);
	}
}
