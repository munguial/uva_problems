import java.io.*;
import java.util.*;

public class Main
{
	static int [][]G;
	static int n, m, c, max;
	
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		while(true)
		{
			String line[] = in.readLine().split(" ");
			
			n = new Integer(line[0]);
			m = new Integer(line[1]);
			
			if(n == 0 && m == 0)
				break;
				
			G = new int[n][n];
			
			StringTokenizer tk;
			
			for(int i =0; i<m;++i)
			{
				tk = new StringTokenizer(in.readLine());
				int x = new Integer(tk.nextToken());
				int y = new Integer(tk.nextToken());
				G[x][y]=1;
				G[y][x]=1;
			}
			
			c=0;
			max=-1;
			for(int i=0;i<n;++i)
				dfs(i);
			out.println(max);
			out.flush();
		}
	}
	static void dfs(int i)
	{
		int k;
		for(k=0;k<n;++k)
		{
			if(G[i][k] == 1)
			{
				++c;
				G[i][k]=0;
				G[k][i]=0;
				
				if(c > max)
					max = c;
				
				dfs(k);
				
				--c;
				G[i][k]=1;
				G[k][i]=1;
			}
		}
	}
}