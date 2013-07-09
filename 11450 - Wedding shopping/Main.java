import java.io.*;
import java.util.*;

public class Main
{
	static int prices[][];
	static int memo[][];
	static int levels, total;

	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		int n = new Integer(in.readLine());
		StringTokenizer tk;
		
		while(n-->0)
		{
			tk = new StringTokenizer(in.readLine());
			
			memo = new int[21][202];
			for(int i=0;i<21;++i)
				for(int j=0;j<202;++j)
					memo[i][j] = -1;
					
			total = new Integer(tk.nextToken());
			levels = new Integer(tk.nextToken());
			
			prices=new int[22][22];
			
			for(int i=0;i<levels;++i)
			{
				tk = new StringTokenizer(in.readLine());
				int nums = new Integer(tk.nextToken());
				prices[i][0] = nums;
				for(int j=1;j<nums+1;++j)
					prices[i][j] = new Integer(tk.nextToken());
			}
			
			int ans = -10000000;
			
			ans = dfs(total,0);
			
			if(ans < 0)
				out.println("no solution");
			else
				out.println(ans);
				
			out.flush();
		}
	}
	static int dfs(int money, int level)
	{
		int k;
		int ans = -10000000;
		
		if(memo[level][money] != -1)
			return memo[level][money];
		
		if(levels == level)
			return total - money;
		
		for(k = 1; k < prices[level][0]+1; ++k )
			if(money - prices[level][k] >= 0)
				ans = Math.max(ans, dfs(money-prices[level][k],level+1));

		return memo[level][money] = ans;
	}
}
