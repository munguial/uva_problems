import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		String f_line = in.readLine();
		
		int n = new Integer(f_line.split(" ")[0]);
		int m = new Integer(f_line.split(" ")[1]);
		
		f_line = in.readLine();
		StringTokenizer tk = new StringTokenizer(f_line);
		
		ArrayList<Long> []matrix =(ArrayList<Long>[]) new ArrayList[1000010];
		
		for(long i=1;i<=n;++i)
		{
			int x = Integer.parseInt(tk.nextToken());
			
			if(matrix[x] == null)
				matrix[x] = new ArrayList<Long>();
				
			matrix[x].add(i);
		}
		
		while(m-- >0)
		{
			String en = in.readLine();
			int k = new Integer(en.split(" ")[0]);
			int v = new Integer(en.split(" ")[1]);
 
 			if((k-1) >= matrix[v].size())
 				out.println(0);
 			else
				out.println(matrix[v].get(k-1));
		}
		out.flush();
	}
}
