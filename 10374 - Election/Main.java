import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o=new PrintWriter(new OutputStreamWriter(System.out));
		boolean perron=false;
		Scanner sc=new Scanner(in.readLine());
		int n=sc.nextInt();
		
		while(n-->0)
		{
			in.readLine();
			
			sc=new Scanner(in.readLine());
			int x=sc.nextInt();
			TreeMap<String, String> map=new TreeMap<String, String>();
			TreeMap<String, Integer> map2=new TreeMap<String, Integer>();
		
			while(x-->0)
				map.put(in.readLine(), in.readLine());
			
			sc=new Scanner(in.readLine());
			int z=sc.nextInt();
			while(z-->0)
			{
				String temp=in.readLine();
				Integer chido=map2.get(temp);
				map2.put(temp, chido!=null ? chido+1 : 1);
			}
			
			int i=0;
			int max=0;
			int indice=0;
			for(int a:map2.values())
			{
				if(a > max)
				{
					max=a;
					i=indice;
				}
				indice++;
			}
			
			int count=0;
			for(int a:map2.values())
				if(a == max)
					count++;
			
			int marica=0;
			String chidote="";
			for(String a:map2.keySet())
			{
				if(marica == i)
					chidote=a;
				marica++;
			}
			
			if(perron)
				o.println();
			perron=true;
			
			if(count > 1)
				o.println("tie");
			else
				o.println(map.get(chidote));
		}
		o.flush();
	}
}
