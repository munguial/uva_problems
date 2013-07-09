import java.util.*;
import java.io.*;

public class Main
{
	static boolean primes[]=new boolean[1000010];
	static ArrayList<Integer> list = new ArrayList<Integer>();
	
	public static void main(String... agrs)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int cases =0;
		getPrimes();
		
		while(true)
		{
			int N = new Integer(in.readLine());
			if(N == 0)
				break;
				
			long count=0;
			for(int i=0; list.get(i)<N;++i)
			{
				int index = bs(N - list.get(i));
				if(index <= i)
					break;
				count += index - i;
			}
			out.println("Case "+(++cases)+": "+count);
			out.flush();
		}
	}
	static int bs(int x)
	{
		int ini = 0;
		int fin = list.size() - 1;
		int m=0;
		
		while(ini <= fin)
		{
			m = (fin + ini) /2;
			
			if( list.get(m) > x )
				fin = m-1;
				
			else if(list.get(m) == x)
				return m;
				
			else
				ini = m +1;
		}
		if(list.get(m)>x)
			--m;
				
		return m;
	}
	static void getPrimes()
	{
		for(long i=2; i<=1000000; ++i)
			if(!primes[(int)i])
			{
				for(long j = i*i; j<=1000000; j= j+i)
					primes[(int)j]=true;
					
				list.add((int)i);
			}
	}
}