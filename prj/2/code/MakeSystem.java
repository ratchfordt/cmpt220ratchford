package cmpt;

import java.util.ArrayList;

public class MakeSystem
{
	private int[] masterCode;
	private int numberOfKeys;
	private String keyway;
	
	public MakeSystem()
	{
		int[] mc = {9,2,7,3,9};
		
		masterCode = mc;
		numberOfKeys = 10;
		keyway = "A";
	}
	
	public MakeSystem(int[] mc, String k)
	{
		masterCode = mc;
		keyway = k;
	}
	
	public int[][] developCodes()
	//This function will not work properly beyond 25
	//distinct codes if the user enters a bitting code 
	//that is all within 2 cuts of the upper or lower 
	//bounds. To correct this, the code that originates
	//change keys should be adjusted to create
	//bitting values that reflect the larger range of 
	//potential cuts rather than +- 2 cuts. It's fine for now.
	{
		int[] change1 = new int[masterCode.length];
		
		for(int m=0; m<masterCode.length; m++) //This randomly generates a similar first change key.
		{
			if(masterCode[m]+2>9)
				change1[m] = masterCode[m]+2;
			else if(masterCode[m]-2<1)
				change1[m] = masterCode[m]-2;
			else
			{
				if(Math.random()>.5)
					change1[m] = masterCode[m]+2;
				else
					change1[m] = masterCode[m]-2;
			}
		}
		
		int[] change2 = new int[masterCode.length];
		
		for(int m=0; m<masterCode.length; m++) //This randomly generates a similar second change key
		{
			if(masterCode[m]+2>9)
				change1[m] = masterCode[m]+2;
			else if(masterCode[m]-2<1)
				change1[m] = masterCode[m]-2;
			else
			{
				if(Math.random()>.5)
					change1[m] = masterCode[m]+2;
				else
					change1[m] = masterCode[m]-2;
			}
		}
		
		int[][] codes = new int[numberOfKeys][masterCode.length];
		//The following code will create 50 distinct keys based off of two generated change keys.
		//This is done by iterating one of the original change keys by changing the height of one pin,
		//starting with the 5th pin and moving backwards as to not duplicate keys.
		
		for(int h=0; h<25; h++)
			codes[h] = change1;
		
		for(int h=25; h<codes.length; h++)
			codes[h] = change2;
		
		int i=0;
		int cut=1;
		for(int j=codes[0].length-1; j>=0; j--)
		{
			while(i<codes.length && cut<10)
			{
				codes[i][j] = cut;
				i++;
				cut++;
			}
			cut = 1;	
		}
		
		return codes;
	}
	
	public ArrayList<Object> keyLockPairs(int n)
	{
		//this method should create an ArrayList of Keys and Locks from developCodes()
		//and return them as kl = {keys, locks}
		ArrayList<Object> kl = new ArrayList<Object>();
		ArrayList<Key> keys = new ArrayList<Key>();
		ArrayList<Lock> locks = new ArrayList<Lock>();
		
		for(int i=0; i<n; n++)
		{
			keys.add(new Key(developCodes()[i], keyway));
			locks.add(new Lock(masterCode, developCodes()[i], keyway, "AA" + i));
		}
		
		kl.add(keys);
		kl.add(locks);
		return kl;
	}
}
