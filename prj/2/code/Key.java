package cmpt;

public class Key
{
	private int[] code;
	private String keyway;
	
	public Key()
	{
		code = new int[5];
		keyway = "A";
	}
	
	public Key(int[] c, String kw)
	{
		code = c;
		keyway = kw;
	}
	
	public int[] getBitting()
	{
		return code;
	}
	
	public String getKeyway()
	{
		return keyway;
	}
}
