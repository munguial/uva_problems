import java.io.*;
import java.util.*;

public class Main
{
	static int matrix[][];
	static int queens[];
	static int indx;

	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		indx=0;
		queens = new int[8];
		matrix = new int[92][8];
		dfs(0);
		int count=0;
		int temp[];
		String en;
		StringTokenizer tk;
		
		while(true)
		{
			++count;
			en = in.readLine();
			
			if(en == null)
				break;
				
			tk = new StringTokenizer(en);
			
			temp = new int[8];
			
			for(int i=0;i<8;++i)
				temp[i]=new Integer(tk.nextToken())-1;
				
			int min = 50000;
			
			int temporal = 0;
			
			for(int i=0;i<92;++i)
			{
				for(int j=0;j<8;++j)
				{
					if(matrix[i][j] != temp[j])
						++temporal; 
				}
				if(temporal < min)
					min = temporal;
				
				temporal = 0;
			}
			
			out.printf("Case %d: %d\n",count,min);
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
				if(i == 7)
				{
					for(int a=0;a<8;++a)
						matrix[indx][a] = queens[a];
					++indx;
				}
				else
					dfs(i+1);
				
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
