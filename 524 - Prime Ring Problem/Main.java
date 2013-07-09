import java.io.*;
import java.util.*;

public class Main
{
	static boolean checked[];
	static StringBuffer salida;
	static int last;
	static boolean prims[];
	
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		prims = new boolean[33];
		
		for(int i=1;i<33;++i)
		{
			prims[i]=isPrime(i);
			//System.out.println(i+": "+prims[i]);
		}
		//System.out.println();
		
		while(true)
		{
			String en =in.readLine();
			
			if(en==null)
				break;
				
			int n = new Integer(en);
			checked = new boolean[n+1];
			salida=new StringBuffer("");
			last=1;
			checked[1]=true;
			salida.append(1);
			dfs(2);
		}
	}
	static void dfs(int i)
	{
		int k;
		
		for(k=2; k<checked.length;++k)
		{
			if(prims[ k+last ] && !checked[k])
			{
				//System.out.println("k: "+ k +" last: "+last+"   " + salida);
				int temp = last;
				checked[k]=true;
				salida.append(k);
				last = k;
				
				if(salida.length()==checked.length-1)
				{
					if(prims[k + 1])
						System.out.println(salida);
				}
				else
				{
					dfs(k+1);
				}
				
				last = temp;
				checked[k]=false;
				salida.deleteCharAt(salida.length()-1);
			}
		}
	}
	
	static boolean isPrime(int n)
	{
		if(n==1)
			return true;
		if(n%2 == 0)
			return false;
		
		int root = (int)Math.sqrt(n); 
			
		for(int i=3;i<=root;++i)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}