import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		int n = new Integer(in.readLine());
		
		while(n-- > 0)
		{
			boolean array[] = new boolean[26];
			int v=0;
			int e=0;
			int acorns=0;
			
			while(true)
			{
				String line = in.readLine();
				
				if(line.charAt(0)=='*')
					break;
					
				e++;
				
				array[line.charAt(1)-'A']=true;
				array[line.charAt(3)-'A']=true;	
			
			}
		
			String vertex[] = in.readLine().split(",");
			v = vertex.length;
			
			for(String a:vertex)
			{
				char x = a.charAt(0);
				if(!array[x - 'A'])
					++acorns;
			}
			
			out.println("There are "+((v-e)-acorns)+" tree(s) and "+acorns+" acorn(s).");
		}
		out.flush();
	}
}
