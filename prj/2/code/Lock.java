package cmpt;

public class Lock 
{
	private String name;
	private int[] changeCode;
	private String keyway;
	private int[] masterCode;
	
	public Lock()
	{
		changeCode = new int[5];
		masterCode = new int[5];
		keyway = "A";
	}
	
	public Lock(int[] c, String kw, String n)
	{
		changeCode = c;
		keyway = kw;
		name = n;
		masterCode = changeCode;
	}
	
	public Lock(int[] cc, int[] mc, String kw, String n)
	{
		changeCode = cc;
		masterCode = mc;
		keyway = kw;
		name = n;		
	}
	
	public boolean tryKey(Key k)
	{		
		int[] bitting = k.getBitting();
		
		if(changeCode.length != bitting.length || keyway != k.getKeyway())
			return false;
		
		for(int i=0; i<changeCode.length; i++)
			if(changeCode[i]!=bitting[i]) //testing for change key
				for(int j=0; j<masterCode.length; j++)
					if(masterCode[j]!=bitting[j]) //testing for master key
						return false;
		
		return true;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		String mstring = "";
		for(int c:masterCode)
			mstring += c;
		
		String cstring = "";
		for(int c:changeCode)
			cstring += c;
		
		return "name: " + name + "\nkeyway: " + keyway + "\nmaster code: " +mstring + "\nchange code: " + cstring;
		
	}
}
