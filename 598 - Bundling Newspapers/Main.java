import java.io.*;
import java.util.*;

public class Main
{
	static ArrayList<String> list;
	static ArrayList<String> salida;
	static int c, x;
	static PrintWriter out;
	
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(new OutputStreamWriter(System.out));
		boolean chido=false;
		int n = new Integer(in.readLine());
		in.readLine();
		
		while(n-- >0)
		{
			String temp=in.readLine();
			if(temp==null)
				break;
			StringTokenizer tk = new StringTokenizer(temp);
			
			String puta = tk.nextToken();
			
			int a=0, b=0;
			
			String name;
			list = new ArrayList<String>();
			salida = new ArrayList<String>();
			c=0;
			while(true)
			{
				name=in.readLine();
				if(name == null || name.isEmpty())
					break;
				list.add(name);
			}
			
			if(puta.equals("*"))
			{
				a = 1;
				b = list.size();
			}
			else
			{
				a= new Integer(puta);
				if(tk.hasMoreElements())
					b= new Integer(tk.nextToken());
				else
					b = a;
			}
			if(chido)
				out.println();
			chido=true;
			for(x=a;x<=b;++x)
			{
				out.println("Size "+x);
				dfs(0);
				out.println();
				out.flush();
			}
		}
	}
	static void dfs(int i)
	{
		int k;
		for(k=i;k<list.size();++k)
		{
			salida.add(list.get(k));
			++c;
			if(c == x)
				print();
			else
				dfs(k+1);
				
			--c;
			salida.remove(salida.size()-1);
		}
	}
	static void print()
	{
		boolean chido=false;
		for(int i=0;i<salida.size();++i)
		{
			if(chido)
				out.print(", ");
			chido=true;
			out.print(salida.get(i));
		}
		out.println();
		out.flush();
	}
}
