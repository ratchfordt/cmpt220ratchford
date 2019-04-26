package cmpt;

public class Person 
{
	private Key personalKey;
	private String name;
	
	public Person(Key k, String n)
	{
		personalKey = k;
		name = n;
	}
	
	public String getName()
	{
		return name;
	}
	
	public Key getKey()
	{
		return personalKey;
	}
}
