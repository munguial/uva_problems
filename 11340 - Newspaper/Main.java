import java.util.*;
import java.io.*;
import static java.lang.System.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader en = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(en.readLine());
		
		while(n-->0)
		{
			int letras=Integer.parseInt(en.readLine());
			int abc[]=new int[70000];
			
			while(letras-->0)
			{
				String tk[] = en.readLine().split(" ");
				char letra=tk[0].charAt(0);
				int valor= Integer.parseInt(tk[1]);

				abc[letra]=valor;
			}
			
			int marica=Integer.parseInt(en.readLine());
			int value=0, len=0;
			long baro=0;
			String linea;
			
			while(marica-->0)
			{
				linea=en.readLine();
				len = linea.length();
				
				for(int i=0;i<len;i++)
				{
					baro += abc[linea.charAt(i)];
/*					try {
					baro+=abc[value];
					} catch (Exception e) {}*/
				}
			}
			out.printf("%.2f$\n",((double)baro/100.0));
		}
	}
}
