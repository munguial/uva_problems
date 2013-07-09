import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o=new PrintWriter(new OutputStreamWriter(System.out));

		String line;
		TreeMap<String, String> dic=new TreeMap<String, String>();

		while(true)
		{
			line=in.readLine();
			
			if(line.isEmpty())
				break;
				
			dic.put(line.split(" ")[1], line.split(" ")[0]);
		}
		
		while(true)
		{
			line=in.readLine();
			
			if(line == null)
				break;
				
			String x=dic.get(line);
			o.println(x != null ? x : "eh" );
		}
		o.flush();
	}
}
