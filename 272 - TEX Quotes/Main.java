import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		boolean band=true;
		String c_line;
		
		while((c_line=in.readLine())!=null)
		{
			for(int i=0;i < c_line.length() ; ++i)
			{
				if(c_line.charAt(i)=='"')
				{
					if(band)
						out.print("``");
					else
						out.print("''");
						
					band = !band;
				}
				else
					out.print(c_line.charAt(i));
			}
			out.println();
		}
		out.flush();
	}
}