import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader en = new BufferedReader(new InputStreamReader(System.in));
		int n=new Integer(en.readLine());
		
		while(n-->0)
		{
			int letras=new Integer(en.readLine());
			//int abc[]=new int[10000];
			HashMap<String,Integer> dir=new HashMap<String,Integer>();
			
			while(letras-->0)
			{
				StringTokenizer tk=new StringTokenizer(en.readLine());
				String letra=tk.nextToken();
				int valor=new Integer(tk.nextToken());
				
				//abc[letra]=valor;
				
				dir.put(letra,valor);
			}
			
			int marica=new Integer(en.readLine());
			int baro=0;
			
			while(marica-->0)
			{
				String linea=en.readLine();
				//char putote[]=linea.toCharArray();
				
				for(int i=0;i<linea.length();i++)
					if(dir.get(String.valueOf(linea.charAt(i)))!=null)
						baro+=dir.get(String.valueOf(linea.charAt(i)));
			}
			out.printf("%.2f$\n",((float)baro/100.0));
		}
	}
}
