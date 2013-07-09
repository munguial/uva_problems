import java.util.*;
import java.io.*;

public class Main
{
	static int compus[];
	static int result[];
	static int count[];
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		int n = new Integer(in.readLine());
		in.readLine();
		boolean chido=false;
		
		while(n-- >0)
		{
			int pcs = new Integer(in.readLine());
			init_array(pcs);
			result=new int[2];
			
			while(true)
			{
				String line = in.readLine();
				
				if(line==null || line.isEmpty())
					break;
					
				String split[]=line.split(" ");
				
				if(split[0].equals("c"))
					union(new Integer(split[1])-1,new Integer(split[2])-1);
				else
					is_conected(new Integer(split[1])-1,new Integer(split[2])-1);
			}
			if(chido)
				out.println();
			chido=true;
			
			out.println(result[0]+","+result[1]);
		}
		out.flush();
	}
	static void is_conected(int a, int b)
	{
		if(find(a) == find(b))
			result[0]++;
		else
			result[1]++;
	}
	
	static void union(int a, int b)
	{
		if(count[find(a)] > count[find(b)])
		{
			compus[find(b)]=find(a);
			count[find(a)]++;
		}
		else
		{
			compus[find(a)]=find(b);
			count[find(b)]++;
		}
	}
	
	static int find(int i)
	{
		if(compus[i]==i)
			return i;
		else
		{
			int r = find(compus[i]);
			compus[i] = r;
			return r;
		}
	}
	static void init_array(int size)
	{
		compus = new int[size];
		count = new int[size];
		for(int i=0;i<size;++i)
		{
			compus[i]=i;
		}
	}
}
