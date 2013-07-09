import java.io.*;
import java.util.*;

public class Main
{
	static TreeMap<String, String> map;
	static TreeMap<String, Integer> count;
	
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int n = new Integer(in.readLine());
		
		while(n-- >0)
		{
			int n2 = new Integer(in.readLine());
			map = new TreeMap<String, String>();
			count = new TreeMap<String, Integer>();
			
			while(n2-- >0)
			{
				String line[] = in.readLine().split(" ");
				
				String one = line[0];
				String two = line[1];
				
				if(map.get(one)==null)
				{
					map.put(one,one);
					count.put(one,1);
				}
				if(map.get(two)==null)
				{
					map.put(two,two);
					count.put(two,1);
				}
				
				union(one, two);
				out.println(count.get(find(one)));
			}
			out.flush();
		}
	}
	static void union(String one, String two)
	{
		int uno = count.get(find(one));
		int dos = count.get(find(two));
		boolean chido=false;
		if(!find(one).equals(find(two)))
		{
		  chido=true;
		}
		
		if(count.get(find(one)) > count.get(find(two)))
		{
			map.put(find(two),find(one));
		}
		else
		{
			map.put(find(one),find(two));
		}
		if(chido)
		  count.put(find(two), uno+dos);
	}
	static String find(String i)
	{
		if(map.get(i).equals(i)) return i;
		else
		{
			String temp = find(map.get(i));
			map.put(i, temp);
			return temp;
		}
	}
}
