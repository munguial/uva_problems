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
		String carry="";
		
		while((line=in.readLine())!=null)
		{
			if(!carry.isEmpty())
				line=carry+line;
			carry="";
			char []linea=line.toLowerCase().toCharArray();
			String chida="";
			for(char a:linea)
			{
				if( (a < 'a' || a > 'z') && a != '-' )
					chida+=" ";
				else
					chida+=a;
			}
			sc=new Scanner(chida);
			String word;
			
			while(sc.hasNext())
			{
				String temp=sc.next();
				if(temp.endsWith("-") && !sc.hasNext())
				{
					carry=temp.substring(0,temp.length()-1);
					break;
				}
				set.add(temp);
			}
		}
		for(String a:set)
			o.println(a);
		o.flush();
	}
}
