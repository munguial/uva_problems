import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o = new PrintWriter(new OutputStreamWriter(System.out));
		
		String en;
		ArrayList<String> dic=new ArrayList<String>();
		
		while(!(en=in.readLine()).equals("XXXXXX"))
			dic.add(en);
		
		Collections.sort(dic);
		
		while(!(en=in.readLine()).equals("XXXXXX"))
		{
			int abc[]=new int[256];
			int temp[];
			boolean chido=false;
			
			for(int i=0;i<en.length();i++)
				abc[en.charAt(i)]++;
				
			for(String a:dic)
			{
				if(a.length() == en.length())
				{
					temp=new int[256];
					
					for(int i=0;i<a.length();i++)
					{
						char x=a.charAt(i);
						temp[x]++;
					}
				}
			}
		}
	}
}
