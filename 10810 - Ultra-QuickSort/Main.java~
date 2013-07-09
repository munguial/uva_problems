import java.util.*;
import java.io.*;

public class Main
{
	static int swaps;

	public static void main(String... args)throws Exception
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o=new PrintWriter(new OutputStreamWriter(System.out));

		while(true)
		{
			swaps=0;
			int n=new Integer(in.readLIne());
			if(n==0)
				break;

			int a[]=new int[n];

			for(int i=0;i<n;i++)
				a[i]=new Integer(in.readLine());

			a=merge(a);
			o.println(swaps);
			o.flush();
		}
	}
	static int[] mergesort(int a[], int i, int f)
	{
		int tam=a.length;
		if(tam>1)
		{
			int m=tam/2;
			int a1[]=new int[m];
			int a2[]=new int[tam - m];

			for(int x=0;x<m;x++)
				a1[x]=a[x];

			for(int x=0;x<(tam - m);x++)
				a2[x]=a[x+m];

			a=merge(mergesort(a1),mergesort(a2));
		}
		return a;
	}
	static int[] merge(int[] a, int[]b)
	{
		
	}
}
