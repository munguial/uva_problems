import java.io.*;
import java.util.*;

public class Main
{
	static int matrix[][];
	static int queens[];
	static int max;
	static int sum;

	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		int n = new Integer(in.readLine());
		
		while(n-- > 0)
		{
			matrix = new int[8][8];
			StringTokenizer tk;
			queens = new int[8];
			max=0;
			sum=0;
			for(int i=0;i<8;++i)
			{
				tk = new StringTokenizer(in.readLine());
				
				for(int j=0;j<8;++j)
					matrix[i][j] = new Integer(tk.nextToken());
			}
			
			dfs(0);
			out.printf("%5d\n",max);
			out.flush();
		}
	}
	
	static void dfs(int i)
	{
		int k;
		
		for(k=0;k<8;++k)
		{
			if(isValid(i,k))
			{
				queens[i] = k;
				sum += matrix[i][k];
				if(i == 7)
				{
					if(sum > max)
						max=sum;
				}
				else
					dfs(i+1);
				
				sum -= matrix[i][k];
			}
		}
	}
	static boolean isValid(int i ,int k)
	{
		for(int x=0;x<i;++x)
		{
			if(queens[x] == k)
				return false;
			if((x+queens[x] == i+k) || (x-queens[x] == i-k))
				return false;
		}
		return true;
	}
}
