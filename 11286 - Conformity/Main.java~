import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o = new PrintWriter(new OutputStreamWriter(System.out));
		
		while(true)
		{
			int n=new Integer(in.readLine());
			
			if(n == 0)
				break;
				
			TreeMap<String, Integer> map=new TreeMap<String, Integer>();
			
			while(n-->0)
			{
				String linea[]=in.readLine().split(" ");
				String number="";
				Arrays.sort(linea);
				
				for(int i=0;i<5;i++)
					number += linea[i];
					
				Integer temp = map.get(number);
				map.put(number, temp != null ? temp+1 : 1);
			}
			
			int max=0;
			for(Integer a: map.values())
				if(a > max)
					max=a;

			int cuenta=0;
			for(Integer a: map.values())
				if( a == max)
					cuenta++;

			o.println(max * cuenta);
		}
		o.flush();
	}
}
