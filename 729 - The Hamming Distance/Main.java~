import java.util.*;
import java.io.*;

public class Main
{
	static int N, H, c;
	static int []a;
	static PrintWriter out;
	
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		out = new PrintWriter(new OutputStreamWriter(System.out));
		boolean chido=false;
		int n = new Integer(in.readLine());
		
		while(n-->0)
		{
			in.readLine();
			StringTokenizer tk = new StringTokenizer(in.readLine());
			
			N = new Integer(tk.nextToken());
			H = new Integer(tk.nextToken());
			a = new int[N];
			c=0;
			if(chido)
			{
				out.println();
				out.flush();
			}
			chido=true;
			dfs(0);
		}
	}
	static void dfs(int i)
	{
		int k;
		
		for(k=0;k<2;++k)
		{
			a[i]=k;
			++c;
			if(c == N)
				check();
			else
				if(i < N-1)
					dfs(i+1);	
			--c;
		}
	}
	static void check()
	{
		int x=0;
		for(int i=0;i<N;++i)
			if(a[i]!=0)
				++x;
		if(x == H)
		{
			for(int i=0;i<N;++i)
				out.print(a[i]);
			out.println();
			out.flush();
		}
	}
}
