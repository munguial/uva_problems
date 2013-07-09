import java.io.*;
import java.util.*;

public class Main
{
	static TreeMap<String, Integer> count;
	static TreeMap<String, String> map;

	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		while(true)
		{
			String line[] = in.readLine().split(" ");
			int n = new Integer(line[0]);
			int m = new Integer(line[1]);
			
			if(n ==0 && m==0)
				break;
				
			map=new TreeMap<String, String>();
			count=new TreeMap<String, Integer>();
			
			while(n-- >0)
			{
				String en = in.readLine();
				map.put(en,en);
				count.put(en, 1);
			}
			while(m-- >0)
			{
				String line2[] = in.readLine().split(" ");
				union(line2[0],line2[1]);
			}
			int max=0;
			for(int i : count.values())
			{
				if(i>max)
					max=i;
			}
			out.println(max);
			in.readLine();
		}
		out.flush();
	}
	static void union(String one, String two)
	{
		int cuenta_uno = count.get(find(one));
		int cuenta_dos = count.get(find(two));
		boolean chido=false;
		if(!find(one).equals(find(two)))
			chido=true;
		
		if(count.get(find(one)) > count.get(find(two)))
		{
			map.put(find(one), find(two));
		}
		else
		{
			map.put(find(two), find(one));
		}
		if(chido)
			count.put(find(one), cuenta_uno + cuenta_dos);
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