import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o = new PrintWriter(new OutputStreamWriter(System.out));
		String line;
		TreeSet<String> set=new TreeSet<String>();
		Scanner sc;
		
		while((line=in.readLine())!=null)
		{
			char []linea=line.toLowerCase().toCharArray();
			String chida="";
			for(char a:linea)
			{
				if( a < 'a' || a > 'z' )
					chida+=" ";
				else
					chida+=a;
			}
			sc=new Scanner(chida);
			String word;
			
			while(sc.hasNext())
				set.add(sc.next());
		}
		for(String a:set)
			o.println(a);
		o.flush();
	}
}
