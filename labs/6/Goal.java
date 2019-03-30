package cmpt;

public class Goal
{
	private int minute;
	private Player player;
	
	public Goal()
	{
		minute = -1;
		player = null;
	}
	
	public Goal(int m, Player p)
	{
		minute = m;
		player = p;
	}
	
	public void setMinute(int i)
	{
		minute = i;
	}
	
	public int getMinute()
	{
		return minute;
	}
	
	public void setPlayer(Player p)
	{
		player = p;
	}
	
	public Player getPlayer()
	{
		return player;
	}
	
}
