package cmpt;

import java.io.*;
import java.util.ArrayList;

public class Lab9remove 
{
	public static void main(String[] args)
	{
		try
		{
			String remove = args[0];
			File file = new File(args[1]);
			String line = "";
			ArrayList<String> newLines = new ArrayList<String>();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			while ((line = br.readLine()) != null)
			{
				if(line.contains(remove))
					line = line.replace(remove, "");
				
				newLines.add(line);
			}
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			for(String s : newLines)
				bw.write(s);
			
			fr.close();
			br.close();
			bw.close();
			bw.flush();
			bw.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
