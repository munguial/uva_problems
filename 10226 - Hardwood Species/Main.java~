import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o=new PrintWriter(new OutputStreamWriter(System.out));
		boolean chido=false;
		int n=new Integer(in.readLine());
		in.readLine();
		
		while(n-->0)
		{
			int count=0;
			TreeMap<String, Integer> map=new TreeMap<String, Integer>();
			
			while(true)
			{
				String line=in.readLine();
				if(line == null || line.isEmpty())
					break;
					
				count++;
				
				Integer x=map.get(line);
				map.put( line, x != null ? x+1 : 1 );
			}
			if(chido)
				o.println();
			chido=true;
			
			for(String a: map.keySet())
			{
				int x=map.get(a);
				o.printf("%s %.4f\n",a, ((float)(x*100) / (float)count) );
			}
		}
		o.flush();
	}
}
