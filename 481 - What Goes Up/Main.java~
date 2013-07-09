import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		int lis[] = new int[1000000];
		int parents[] = new int[1000000];
		int nums[] = new int[1000000];
		int max_lis = 0;
		int index=0;
		int max_index=0;
		int pos = 0;
		Stack<Integer> pila = new Stack<Integer>();
		
		while(true)
		{
			String line = in.readLine();
			
			if(line ==null)
				break;
				
			int n = new Integer(line);
			nums[index] = n;
			if(index != 0)
				pos = findPos(nums, lis, n, 0, max_lis);
			
			parents[index] = pos==0 ? -1 : lis[pos-1];
			
			if(pos > max_lis)
			{
				max_index = index;
			}
			lis[pos] = index;	
			max_lis = Math.max(max_lis, pos);
			
			++index;
			
		}
		
		out.println(max_lis+1);
		out.println("-");
		pila.push(nums[max_index]);
		for(int i=max_index;i>0;)
		{
			pila.push(nums[parents[i]]);
			i = parents[i];
		}
		
		for(;!pila.isEmpty();)
		{
			out.println(pila.pop());
		}
		
		out.flush();
		
	}
	static int findPos(int nums[],int []lis, int n, int start, int end)
	{	
		int m = -1;
		while(start <= end)
		{
			m = (start + end) / 2;
			if(nums[lis[m]] == n)
			{
				return m;
			}	
			if(n > nums[lis[m]])
				start = m+1;
			else if(n < nums[lis[m]])
				end = m-1;
		}
		if(nums[lis[m]] > n)
			return m;
		else
			return m+1;
	}
}
