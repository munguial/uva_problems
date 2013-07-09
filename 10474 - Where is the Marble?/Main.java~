import java.io.*;
import java.util.*;

public class Main
{
	static int array[];
	public static void main(String... agrs)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int count=1;
		while(true)
		{
			String en[]= in.readLine().split(" ");
			int n = new Integer(en[0]);
			int m = new Integer(en[1]);
			
			if(n==0 && m==0)
				break;
				
			array = new int[n];
			
			for(int i=0;i<n;++i)
				array[i] = new Integer(in.readLine());
			
			Arrays.sort(array);
			out.println("CASE# "+(count++)+":");
			
			while(m-->0)
			{
				int a = new Integer(in.readLine());
				int x = binary_search(0, array.length-1 ,a);	
				if(x>=0)
					out.println(a+" found at "+(x+1));
				else
					out.println(a+" not found");
				out.flush();
			}
		}
	}
	static int binary_search(int i, int u,int x)
	{
		int m;
		
		while(i <= u)
		{
			m = (i + u) /2;
			if(x > array[m])
				i = m+1;
			else if(x < array[m])
				u = m-1;
			else
			{
				if(m==i)
					return m;

				else
				{
					int a = binary_search(i,m-1,x);
					if(a<0)
						return m;
					else
						return a;
				}
			}
		}
		return -1;
	}
}