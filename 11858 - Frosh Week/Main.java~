import java.io.*;
import java.util.*;

public class Main
{
	static long swaps;
	public static void main(String... args)
	{
		try
		{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			PrintWriter o=new PrintWriter(new OutputStreamWriter(System.out));
			
			String entrada;
			
			while((entrada=in.readLine())!=null)
			{
				swaps=0;
				int n=new Integer(entrada);
				
				int a[]=new int[n];
				
				for(int i=0;i<n;i++)
					a[i]=new Integer(in.readLine());
					
				a=mergesort(a);
				o.println(swaps);
				o.flush();
			}
		}
		catch(Exception e){}
	}
	
	static int[] mergesort(int a[])
	{
		int tam=a.length;
		if(tam>1)
		{
			int x[]=new int[tam/2];
			int y[]=new int[tam - (tam/2)];
			
			for(int i=0;i<x.length;i++)
				x[i]=a[i];
			for(int i=0;i<y.length;i++)
				y[i]=a[i+(tam/2)];
				
			a=merge(mergesort(x),mergesort(y));	
		}
		return a;
	}
	static int[] merge(int a[], int[]b)
	{
		int x=0, y=0, al=a.length, bl=b.length;
		int c[]=new int[al + bl];
		
		for(int i=0;i<c.length;i++)
		{
			if(x>=al)
			{
				c[i]=b[y++];
				continue;
			}
			if(y>=bl)
			{
				c[i]=a[x++];
				continue;
			}
			if(a[x] <= b[y])
				c[i]=a[x++];
				
			else if(a[x] > b[y])
			{
				c[i]=b[y++];
				swaps+=(al - x);
			}
		}
		return c;
	}
}
