package cmpt;

import java.util.ArrayList;
import java.util.Scanner;

public class Project2 
{	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		MakeSystem sys = null;
		
		boolean invalid = true;
		while(invalid)
		{
			System.out.println("Welcome. Are you using a premade code or would you like one generated?");
			
			try 
			{
				System.out.println("1) Enter code");
				System.out.println("2) Generate");
				
				int user = Integer.parseInt(s.nextLine());
				
				if(user == 2)
				{
					sys = new MakeSystem();
					invalid = false;
				}
				else if(user == 1)
				{
					System.out.println("Enter your bitting code with each cut separated by spaces.");
					String userc = s.nextLine();
					String[] ucode = userc.split(" ");
					int[] userCode = new int[ucode.length];
					
					for(int i=0; i<ucode.length; i++)
						userCode[i] = Integer.parseInt(ucode[i]);
					
					System.out.print("Enter keyway type:");
					String kw = s.nextLine();
					
					sys = new MakeSystem(userCode, kw);
					invalid = false;
				}
			}
			catch (Exception e)
			{
				System.out.println("Invalid input. try again");
				System.out.println("---------------------------");
			}
		}
		
		Key master = sys.getMasterKey();
		
		ArrayList<ArrayList<Object>> klp = sys.keyLockPairs(49);
		
		
		ArrayList<Key> keys = new ArrayList<Key>();
		ArrayList<Lock> locks = new ArrayList<Lock>();
		
		for(Object o:klp.get(0))
			keys.add((Key)o);
		
		for(Object o:klp.get(1))
			locks.add((Lock)o);
		
		
		//System.out.print( locks.get(10).tryKey(keys.get(10)) );
		ArrayList<Key> userKeys = new ArrayList<Key>();
		ArrayList<Lock> userLocks = new ArrayList<Lock>();
		ArrayList<Person> people = new ArrayList<Person>();
		//people.add(new Staff(keys.get(18), master, "John", "RA"));
		
		boolean go = true;
		while(go) 
		{
			menu();
			try	
			{
				int user = Integer.parseInt(s.nextLine());
				
				if(user == 1)
					if(keys.size()!=0)
					{
						userKeys.add(keys.get(0));
						
						System.out.println("Key added:\n" + keys.get(0));
						
						keys.remove(0);
					}
					else
						System.out.println("Maximum keys reached");
				
				if(user == 2)
					if(locks.size()!=0)
					{
						userLocks.add(locks.get(0));
						
						System.out.println("Lock added:\n" + locks.get(0));
						
						locks.remove(0);
					}
					else
						System.out.println("Maximum locks reached");
				
				if(user == 3)
				{
					if(keys.size()==0)
					{
						System.out.println("Create a key first.");
					}
					
					System.out.print("Enter a name: ");
					String name = s.nextLine();
					
					System.out.println("Choose a key: ");
					for(int i=0; i<userKeys.size(); i++)
						System.out.println((i+1) + ") " + userKeys.get(i));
					
					int u = Integer.parseInt(s.nextLine());
					Key ukey = userKeys.get(u-1);
					
					System.out.println("What type of person is this?");
					System.out.println("1) Staff\n2) Guest");
					u = Integer.parseInt(s.nextLine());
					
					Person p = null;
					boolean pbool = true;
					
					while(pbool)
					{
						if(u==1)
						{
							System.out.print("Enter job: ");
							String j = s.nextLine();
							p = new Staff(ukey, master, name, j);
							people.add(p);
							pbool = false;
						}
						else if(u==2)
						{
							System.out.print("Enter room: ");
							String room = s.nextLine();
							p = new Guest(ukey, name, room);
							people.add(p);
							pbool = false;
						}
					}
				}
				
				if(user == 4)
					for(Key k:userKeys)
						System.out.println(k);
				
				if(user == 5)
					for(Lock l:userLocks)
						System.out.println(l);
				
				if(user == 6)
					for(Person p:people)
						System.out.println(p);
				if(user == 7)
					System.out.print(master);
				
				if(user == 8)
					go = false;
			}
			catch (Exception e)
			{
				System.out.println("Invalid input, returning to menu.");
			}
		}
		
		s.close();
	}
	
	public static void menu()
	{
		System.out.println("\nMenu");
		System.out.println("---------------------------");
		System.out.println("1) Generate key");
		System.out.println("2) Generate lock");
		System.out.println("3) Create person");
		System.out.println("4) View keys");
		System.out.println("5) View locks");
		System.out.println("6) View people");
		System.out.println("7) View master key");
		System.out.println("8) Quit");
	}
}
