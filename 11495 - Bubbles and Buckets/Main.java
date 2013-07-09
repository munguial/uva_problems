import java.io.*;
import java.util.*;

public class Main
{
	static long swaps;
	
	public static void main(String... args)throws Exception
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o=new PrintWriter(new OutputStreamWriter(System.out));

		String entrada;

		while(!(entrada=in.readLine()).equals("0"))
		{
			swaps=0;
			Scanner sc=new Scanner(entrada);
			
			int n=sc.nextInt();
			int a[]=new int[n];
			
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
				
			a=mergesort(a);
			
			if(swaps%2!=0)
				o.println("Marcelo");
			else
				o.println("Carlos");
			o.flush();
		}
	}
	static int[] mergesort(int []a)
	{
		int tam=a.length;
		if(tam>1)
		{
			int x[]=new int[tam/2];
			int y[]=new int[tam - (tam/2)];
			
			for(int i=0;i<x.length;i++)
				x[i]=a[i];
			for(int i=0;i<y.length;i++)
				y[i]=a[i+x.length];	
				
			a=merge(mergesort(x),mergesort(y));
		}
		return a;
	}
	static int[] merge(int []a, int[]b)
	{
		int x=0,y=0, la=a.length, lb=b.length;
		int c[]=new int[la + lb];
		for(int i=0;i<c.length;i++)
		{
			if(x>=la)
			{
				c[i]=b[y++];
				continue;
			}
			if(y>=lb)
			{
				c[i]=a[x++];
				continue;	
			}
			
			if(a[x]<=b[y])
				c[i]=a[x++];
				
			else if(a[x]>b[y])
			{
				c[i]=b[y++];
				swaps+=(la - x);
			}	
		}
		return c;
	}
}
