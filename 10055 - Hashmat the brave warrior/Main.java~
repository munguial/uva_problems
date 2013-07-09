import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String en;
		StringTokenizer tk;
		
		while((en=in.readLine())!=null)
		{
			tk = new StringTokenizer(en);
			long x = new Long(tk.nextToken());
			long y = new Long(tk.nextToken());
			long result = y-x;
			if(result < 0) result *= -1;
			out.println(result);
		}
		out.flush();
	}
}
