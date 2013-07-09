import java.io.*;
import java.util.*;

public class Main
{
	static String regla;
	static StringBuffer salida;
	static int c, tam;
	static ArrayList<String> list;
	 
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		String line;
		
		while(true)
		{
			line = in.readLine();
			
			if(line == null)
				break;
			
			out.println("--");
			int n = new Integer(line);
			
			String cadenas[] = new String[n];
			
			for(int i=0;i<n;++i)
				cadenas[i] = in.readLine();
				
			int r = new Integer(in.readLine());
			list = new ArrayList<String>();
			
			while(r-- > 0)
			{
				c=0;
				regla = in.readLine();
				tam = regla.length();
				salida = new StringBuffer("");
				dfs(0);
			}
			
			for(int i = 0; i<n;++i)
			{
				for(int j = 0; j<list.size(); ++j)
				{
					for(int x =0; x<list.get(j).length();++x)
						if(list.get(j).charAt(x) == '#')
							out.print(cadenas[i]);
						else
							out.print(list.get(j).charAt(x));
					out.println();
				}
			}
			out.flush();
		}
	}
	static void dfs(int i)
	{
		if(regla.charAt(i) == '0')
		{
			int k;
			for(k=0;k<10;++k)
			{
				++c;
				salida.append(k);
				if(c == tam)
				{
					list.add(salida.toString());
				}
				else
				{
					if(i+1 < tam)
						dfs(i+1);
				}
				--c;
				salida.deleteCharAt(salida.length()-1);
			}
		}
		else
		{
			salida.append("#");
			++c;
			if(c == tam)
			{
				list.add(salida.toString());
			}
			if(i+1 < tam)
				dfs(i+1);
			--c;
			salida.deleteCharAt(salida.length()-1);
		}

	}
}
