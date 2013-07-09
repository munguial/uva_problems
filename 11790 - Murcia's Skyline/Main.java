import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		int n1 = new Integer(in.readLine());
		int cases=0;
		
		while(n1-->0)
		{
			int n =  new Integer(in.readLine());
			++cases;
			int h[] = new int[n];
			int w[] = new int[n];
			
			StringTokenizer tk = new StringTokenizer(in.readLine());
			for(int i=0; i<n; ++i)
			{
				h[i] = new Integer(tk.nextToken());
			}
			tk = new StringTokenizer(in.readLine());
			for(int i=0; i<n; ++i)
			{
				w[i] = new Integer(tk.nextToken());
			}
			
			int lis = LIS(h, w);
			//System.out.println(lis);
			int lds = LDS(h, w);
			//System.out.println(lds);
			if(lis >= lds)
				out.println("Case "+cases+". Increasing ("+(lis < 0 ? 0 : lis)+"). Decreasing ("+(lds < 0 ? 0 : lds)+").");
			else
				out.println("Case "+cases+". Decreasing ("+(lds < 0 ? 0 : lds)+"). Increasing ("+(lis < 0 ? 0 : lis)+").");
			
			out.flush();
		}
	}
	static int LIS(int h[], int w[])
	{
		int maxLis=0;
		int lis[] = new int[h.length];
		int maxw=0;
		int maxwi[] = new int[h.length];
		maxwi[0] = w[0];
		maxw =w[0];
		
		for(int i=0; i<h.length;++i)
		{
			int pos = getPos(h, w, lis, i, maxLis);
			
			if(pos >= 0 )
			{
				lis[pos] = i;
				maxwi[pos] = pos==0 ? w[i] : maxwi[pos-1] + w[i];
				maxLis = Math.max(pos,maxLis);
				if(maxwi[pos] > maxw)
					maxw = maxwi[pos];
			}
		}
		/*for(int i=0; i<maxLis;++i)
			System.out.print(h[lis[i]]+" ");
		System.out.println();
		*/
		return maxw;
	}
	static int LDS(int h[], int w[])
	{
		int maxLds=0;
		int lds[] = new int[h.length];
		int maxw=0;
		int maxwi[] = new int[h.length];
		maxwi[0] = w[0];
		maxw = w[0];
		
		for(int i=0; i<h.length;++i)
		{
			int pos = getPos2(h, w, lds, i, maxLds);
			//System.out.println("elem:"+h[i]+" pos:"+pos);
			if(pos >= 0 )
			{
				lds[pos] = i;
				maxwi[pos] = pos==0 ? w[i] : maxwi[pos-1] + w[i];
				maxLds = Math.max(pos,maxLds);
				if(maxwi[pos] > maxw)
				{
					//System.out.println("max["+pos+"] "+maxwi[pos] +" maxw: "+ maxw);
					maxw = maxwi[pos];
				}
				/*System.out.println("se inserta "+h[i]+" en "+pos);
				for(int x=0; x<5;++x)
					System.out.print(h[lds[x]]+" ");
				System.out.println();*/
			}
			
		}
		return maxw;
	}
	static int getPos(int h[], int w[], int []lis, int n, int maxLis)
	{
		int start = 0;
		int end = maxLis+1;
		int m = 0;
		
		while(start < end)
		{
			m = (start + end) / 2;
			if(h[lis[m]] == h[n])
			{
				if(w[n] <= w[m])
					return -1;
				else
					return m;
			}
			else if(h[lis[m]] > h[n])
			{
				end = m-1;
			}
			else if(h[lis[m]] < h[n])
			{
				start = m+1;
			}
		}
		
		while(w[m] < 0 && m>0)
			--m;
		
		if(h[lis[m]] < h[n])
			m++;	
		
		if(m <= maxLis && w[n]<0)
				return -1;
		return m;		
	}
	static int getPos2(int h[], int w[], int []lis, int n, int maxLis)
	{
		int start = 0;
		int end = maxLis+1;
		int m = 0;
		/*for(int i=0; i<maxLis;++i)
			System.out.print(h[lis[i]]+" ");
		System.out.println();*/
		
		while(start < end)
		{
			m = (start + end) / 2;
			//System.out.println("start:"+start+" end:"+end+" m:"+h[lis[m]]+" n:"+h[n]);
			if(h[lis[m]] == h[n])
			{
				
				if(w[n] <= w[m])
					return -1;
				else
					return m;
			}
			else if(h[lis[m]] > h[n])
			{
				//System.out.println("m= "+m);
				start = m+1;
				//System.out.println("start se incrementa a "+(m+1));
			}
			else if(h[lis[m]] < h[n])
			{
				//System.out.println("puta madre m= "+m);
				end = m-1;
			}
		}
		
		while(w[m] < 0 && m>0)
			--m;
		
		if(h[lis[m]] > h[n])
			++m;
		
		if(m <= maxLis && w[n]<0)
				return -1;
		
		return m;		
	}
}
