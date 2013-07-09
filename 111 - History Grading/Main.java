import java.io.*;
import java.util.*;

public class Main
{
	static int pos[];
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));		
		int n = new Integer(in.readLine());
		pos = new int[n+1];
		StringTokenizer tk = new StringTokenizer(in.readLine());
		
		for(int i = 1; i<=n ; ++i)
			pos[i] = new Integer(tk.nextToken());
			
		for(; true; )
		{
			String line = in.readLine();
			if(line == null)
				break;
			int count = 0;
			
			int LIS[] = new int[21];
			tk = new StringTokenizer(line);
			int numbers[] = new int[n+1];
			for(int i = 1; i<=n ; ++i)
				numbers[new Integer(tk.nextToken())] = i;
			
			int top = 1;
			int maxLIS = 1;
			LIS[1] = numbers[1];
			
			for(int x = 2; x<=n ; ++x)
			{
				int f = findPos(LIS, numbers[x], top);
				top = Math.max(top, f);
				LIS[f] = numbers[x];
				if(top>maxLIS)
					maxLIS = top;
			}
			
			out.printf("%d\n",maxLIS);
			out.flush();
		}
	}
	static int findPos(int LIS[], int num, int n)
	{
		int position = n+1;
		
		for(int i=n; i>0; --i, --position)
		{
			if( pos[num] > pos[LIS[i]] )
				return position;
		}
		return position;
	}
}
