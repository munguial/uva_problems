import java.io.*;
import java.util.*;

public class Main
{
	static int []array;
	static int c, suma;
	static boolean []used; 
	static boolean puto;
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		while(true)
		{
			boolean chido=false;
			array= new int[5];
			c=0; suma=0;
			used = new boolean[5];
			puto =false;
			
			StringTokenizer tk = new StringTokenizer(in.readLine());
			
			for(int i=0;i<5;++i)
			{
				array[i] = new Integer(tk.nextToken());
				if(array[i] != 0)
					chido = true;
			}
		
			if(!chido)
				break;
				
			dfs();
			
			out.println(puto ? "Possible" : "Impossible");
			out.flush();
		}
		
	}
	static void dfs()
	{
		///if(c>6)
			//System.out.println("PUTO");
		int k;
		for(k=0;k<5;++k)
		{
			int temp = array[k];
			if(!used[k])
			{
				int x;
				for(x=0;x<3;++x)
				{	
					if(isValid(temp,x) && !puto)
					{
						if(x == 0)
							suma += temp;
						else if(x == 1)
							suma *= temp;
						else if(x == 2)
							suma -= temp;
						
						used[k] = true;
						++c;
					
						if(c == 5 && suma == 23)
						{
							puto=true;
						}
						else
						{
							dfs();
						}
						
						if(x == 0)
							suma -= temp;
						else if(x == 1)
							suma /= temp;
						else if(x == 2)
							suma += temp;
						
						used[k] = false;
						--c;
					}
				}
			}
		}
	}
	static boolean isValid(int temp, int x)
	{
		if(c > 5)
			return false;
		if(x == 0 && (suma + temp <= 23))
			return true;
		else if(x == 1 && (suma * temp <= 23))
			return true;
		else if(x == 2 && (suma - temp <= 23))
		  	return true;
		  	
		return false;
	}
}
