import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o=new PrintWriter(new OutputStreamWriter(System.out));
		String entrada=in.readLine();
		int n=new Integer(entrada.split(" ")[0]);
		int m=new Integer(entrada.split(" ")[1]);
		TreeMap<String, Integer> map=new TreeMap<String, Integer>();
		
		while(n-->0)
		{
			String line=in.readLine();
			map.put( line.split(" ")[0] , new Integer(line.split(" ")[1]) );
		}
		
		while(m-->0)
		{
			String line;
			int suma=0;
			Scanner sc;
			while(true)
			{
				line=in.readLine();
				
				if(line.equals("."))
					break;
					
				sc=new Scanner(line);
				
				while(sc.hasNext())
				{
					Integer x= map.get(sc.next());
					suma += x != null ? x : 0;
				}
			}
			o.println(suma);
		}
		o.flush();
	}
}
