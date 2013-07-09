import java.util.*;

public class Main
{
	static int dp[][];
	public static void main(String... args)
	{
		Scanner sc =  new Scanner(System.in);
		int n=sc.nextInt();
		
		while(n-->0)
		{
			int items = sc.nextInt();
			int v[] = new int[items];
			int w[] = new int[items];
			
			dp = new int[1001][101];
			for(int i=0;i<1001;++i)
				for(int j=0;j<101;++j)
					dp[i][j] = -1;
			
			for(int i=0;i<items;++i)
			{
				v[i] = sc.nextInt();
				w[i] = sc.nextInt();
			}
			
			int people = sc.nextInt();
			int total = 0;
			
			while(people-->0)
				total += add(w, v, sc.nextInt(), 0);
				
			System.out.println(total);
		}
	}
	static int add(int []w, int[]v, int c, int i)
	{
		if(i == w.length)
			return 0;
			
		if(c <= 0)
			return 0;
			
		if(dp[i][c] != -1)
			return dp[i][c]; 
			
		if(w[i] > c)
			return add(w, v, c, i + 1);
		
		else
			return dp[i][c] = Math.max(add(w, v, c, i+1), v[i] + add(w, v, c-w[i], i+1));
	}
}
