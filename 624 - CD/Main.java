import java.util.*;
import java.io.*;

public class Main
{
	static int []a;
	static int n;
	static int max;
	static int suma, result_int;
	static String result;
	static ArrayList<Integer> list;
	static ArrayList<Integer> list_r;
	static boolean used[];
	public static void main(String... agrs)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		StringTokenizer tk;
		
		while(true)
		{
			String line = in.readLine();
			if(line == null)
				break;
				
			tk = new StringTokenizer(line);
			
			n = new Integer(tk.nextToken());
			int nums = new Integer(tk.nextToken());
			max=-1;
			list = new ArrayList<Integer>();
			list_r = new ArrayList<Integer>();
			suma=0;
			result="";
			result_int=0;
			salida=new StringBuffer("");
			a=new int[nums];
			used =new boolean[nums];
			
			for(int i=0;i<nums;++i)
				a[i] = new Integer(tk.nextToken());
				
			dfs(0);
			
			for(int i:list_r)
				out.print(i+" ");
			out.println("sum:"+result_int);
			out.flush();
		}
		
	}
	static void dfs(int i)
	{
		int k;
		for(k=i;k<a.length;++k)
		{
			if(suma + a[k] <= n && !used[k])
			{
				used[k]=true;
				suma += a[k];
				list.add(a[k]);
				
				if(suma > max)
				{
					max = suma;
					result_int = suma;
					list_r = (ArrayList<Integer>)list.clone();
				}
				
				dfs(k+1);
				
				suma -= a[k];
				list.remove(list.size()-1);
				used[k]=false;
			}
		}
	}
}