import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o = new PrintWriter(new OutputStreamWriter(System.out));
		
		while(true)
		{
			StringTokenizer tk =new StringTokenizer(in.readLine());
			int n=new Integer(tk.nextToken());
			int m=new Integer(tk.nextToken());
			
			if(n==0 && m==0)
				break;
			
			long m1[]=new long[m];
			long n1[]=new long[n];
			
			for(int i=0;i<n;i++)
				n1[i]=new Integer(in.readLine());
			
			for(int i=0;i<m;i++)
				m1[i]=new Integer(in.readLine());
			
			int count=0;
			
			for(int i=0, j=0; i<n && j<m; )
			{
				if(n1[i] == m1[j])
				{
					count++;
					++i;
					++j;
				}
				else if(n1[i] < m1[j])
					++i;
				else if(n1[i] > m1[j])
					++j;
			}
			o.println(count);
		}
		o.flush();
	}
}
