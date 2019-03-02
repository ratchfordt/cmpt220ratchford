package cmpt;
import java.util.Scanner;

public class MyString {
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a word to see if it is a palindrome: ");
		String user = s.nextLine();
		System.out.println(isPalindrome(user));
		
		s.close();
	}
	
	public static String reverse(String s)
	{
		String[] mylist = s.split("");
		s = "";
		for(int i=0; i<mylist.length/2; i++)
		{
			String temp = mylist[i];
			mylist[i] = mylist[mylist.length-(i+1)];
			mylist[mylist.length-(i+1)] = temp;
		}
		for(String l:mylist)
			s += l;
		return s;
	}
	
	public static boolean isPalindrome(String s)
	{
		s = s.toLowerCase().replace(" ", "");
		int length = s.length();
		int half = length/2;
		int half2 = half;
		if(length%2!=0)
			half2 = half + 1;
		
		String sub1 = s.substring(0,half);
		String sub2 = reverse(s.substring(half2, length));
		
		if(sub1.equals(sub2))
			return true;

		return false;
	}
}
