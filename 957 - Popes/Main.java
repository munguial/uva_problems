import java.io.*;
import java.util.*;

public class Main
{
	static int a[];
	static int N;
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		while(true)
		{
			N=new Integer(in.readLine());
			int m=new Integer(in.readLine());
			
			a=new int[m];
			
			for(int i=0;i<m;++i)
				a[i]=new Integer(in.readLine());
			
			
			int max=0;
			int a1=0;
			int b=0;
			
			for(int i=0;i<m;++i)
			{
				int indx = bs(i);
				if(indx - i + 1 > max)
				{
					max = indx - i + 1;
					a1=i;
					b=indx;
				}
			}
			
			out.println(max+" "+a[a1]+" "+a[b]);
			out.flush();
			
			if(in.readLine() ==null )
				break;
		}
	}
	static int bs(int i)
	{
		int ini = i + 1;
		int fin = a.length -1;
		int m=0;
		
		while(ini<=fin)
		{
			m = (fin + ini) /2;
			//System.out.print("se prueba "+a[m]+" ");
			if(a[m]-a[i]+1 > N)
			{
				//System.out.println((a[m]-a[i]+1)+" es mayor");
				fin = m-1;
			}
				
			else
			{
				//System.out.println((a[m]-a[i]+1)+" es menor");
				ini = m+1;
			}
		}
		if(a[m]-a[i]+1 > N)
			--m;
			
		return m;
	}
}