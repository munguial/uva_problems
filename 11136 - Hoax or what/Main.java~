import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o = new PrintWriter(new OutputStreamWriter(System.out));
		
		while(true)
		{
			int n=new Integer(in.readLine());
			
			if(n==0)
				break;
			
			StringTokenizer st;
			long suma=0;
			TreeMap<Integer,Integer> set=new TreeMap<Integer,Integer>();
			
			
			while(n-->0)
			{
				st=new StringTokenizer(in.readLine());
				int x=new Integer(st.nextToken());
				
				while(x-->0)
				{
					int num=new Integer(st.nextToken());
					Integer temp=set.get(num);
					set.put(num, temp != null ? temp +1 : 1);
				}
				
				Integer menor;
				Integer mayor;
				
				
				Integer f_key=set.firstKey();
				Integer temp = set.get(f_key);
				menor = f_key;
				
				if(temp > 1)
					set.put(f_key,temp-1);
				else
					set.pollFirstEntry();
				
				Integer l_key = set.lastKey();
				temp = set.get(l_key);
				mayor = l_key;
				
				if(temp > 1)
					set.put(l_key,temp-1);
				else
					set.pollLastEntry();
				
				suma += (mayor != null ? mayor : 0) - (menor != null ? menor : 0);
			}
			o.println(suma);
		}
		o.flush();
	}
}
