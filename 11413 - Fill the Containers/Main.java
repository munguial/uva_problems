import java.util.*;
import java.io.*;

public class Main
{
	static int array[];
	static int suma_max;
	static int max_len;
	static int m;
	
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		while(true)
		{
			String line = in.readLine();
			
			if(line == null)
				break;
				
			int n = new Integer(line.split(" ")[0]);
			m = new Integer(line.split(" ")[1]);
			
			
			line = in.readLine();
			StringTokenizer tk = new StringTokenizer(line);
			
			array = new int[n];
			suma_max = 0;
			max_len = n - (m-1);
			
			for(int i=0;i<n;++i)
			{
				array[i]=new Integer(tk.nextToken());
				suma_max += array[i];
			}
			
			out.printf("%d\n",bs());
			out.flush();
		}
	}
	static boolean valid(int n)
	{
		int suma=0;
		int c=1;
		for(int i=0;i<array.length;++i)
		{
			if(array[i] > n)
				return false;
			else if(array[i] + suma > n)
			{
				suma = array[i];
				++c;
			}
			else
				suma += array[i];
		}
		
		if(c <= m && suma <= n )
			return true;
		
		return false;
	}
	static int bs()
	{
		int ini = 1;
		int fin = suma_max;
		int m=0;
		
		while(ini < fin)
		{
			m = (ini + fin) / 2;
			
			if(valid(m)){
				fin = m;
			}
			else{
				ini = m+1;
			}
		}
		return (!valid(m) ? m+1 : m);
	}
}