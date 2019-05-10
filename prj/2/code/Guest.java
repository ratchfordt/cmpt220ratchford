package cmpt;

public class Guest extends Person
{
	String room;
	
	public Guest(Key k, String n, String r) 
	{
		super(k, n);
		room = r;
	}
	
	public String getRoom()
	{
		return room;
	}
	
	public String toString()
	{
		return "name: " + super.getName() + "\nroom: " + room;
	}
}
