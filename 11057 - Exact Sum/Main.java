import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String... agrs)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		while(true)
		{
			String line = in.readLine();
			
			if(line==null)
				break;
				
			int n = new Integer(line);
			
			int a[] = new int[n];
			int c[] = new int[1000001];
			
			StringTokenizer tk = new StringTokenizer(in.readLine());
			
			for(int i=0;i<n;i++)
			{
				a[i]=new Integer(tk.nextToken());
				++c[a[i]];
			}
			
			int n2 = new Integer(in.readLine());
			int min = Integer.MAX_VALUE;
			int a2=0;
			int b=0;
			
			//if(n2 < 1000001)
			for(int i=0;i<n;++i)
			{
				if(a[i]<n2 && a[i]>0)
				{
					int f = n2 - a[i];
					//out.println(c[f]);
					if(f<1000001 && c[f]>0 && Math.abs(f - a[i]) < min)
					{
						--c[f];
						min = Math.abs(f - a[i]);
						a2=f;
						b=a[i];
					}
				}
			}
			if(a2 <= b)
				out.println("Peter should buy books whose prices are "+a2+" and "+b+".\n");
			else
				out.println("Peter should buy books whose prices are "+b+" and "+a2+".\n");
			out.flush();
			
			if(in.readLine()==null)
				break;
		}
	}
}