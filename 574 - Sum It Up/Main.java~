import java.util.*;
import java.io.*;

public class Main
{
	static int a[];
	static int n;
	static int suma;
	static StringBuffer salida;
	static boolean chido;
	static ArrayList<Integer> list;
	
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		StringTokenizer tk;
		
		while(true)
		{
			String line = in.readLine();
			tk = new StringTokenizer(line);
			n = new Integer(tk.nextToken());
			
			if(n==0)
				break;
				
			int m = new Integer(tk.nextToken());
			chido=false;
			a = new int[m];
			suma = 0;
			salida = new StringBuffer("");
			list = new ArrayList<Integer>();
			
			for(int i=0;i<m;++i)
				a[i]=new Integer(tk.nextToken());
				
			out.println("Sums of "+n+":");
			dfs(0);
			out.print(salida);
			if(!chido)
				out.println("NONE");
			out.flush();
			
		}
	}
	static void dfs(int i)
	{
		int k;
		boolean []temp=new boolean[1001];
		for(k=i;k<a.length;++k)
		{
			if(suma + a[k] <= n && !temp[a[k]])
			{
				temp[a[k]]=true;
				suma += a[k];
				list.add(a[k]);
				
				if(suma == n)
				{
					printl();
					chido=true;
				}
				else
					dfs(k+1);
					
				suma -= a[k];
				list.remove(list.size()-1);
			}
		}
	}
	static void printl()
	{
		salida.append(list.get(0));
		
		for(int i=1;i<list.size();++i)
			salida.append("+"+list.get(i));
		salida.append("\n");
	}
}