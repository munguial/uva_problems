import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o = new PrintWriter(new OutputStreamWriter(System.out));
		
		int n=new Integer(in.readLine());
		
		while(n-->0)
		{
			int m=new Integer(in.readLine());
			TreeMap<String, Integer> vecesN = new TreeMap<String, Integer>();
			TreeMap<String, String> map_words = new TreeMap<String, String>();
			TreeMap<String, Integer> cuentaWords = new TreeMap<String, Integer>();
			ArrayList<String> lista = new ArrayList<String>();
			
			Scanner sc;
			while(m-->0)
			{
				sc=new Scanner(in.readLine());
				
				String name=sc.next();
				lista.add(name);
				int x=sc.nextInt();
				int veces=sc.nextInt();
				
				vecesN.put(name, veces);
				
				while(x-->0)
					map_words.put(in.readLine(), name);
			}
			String linea;
			
			while(true)
			{
				linea=in.readLine();
				
				if(linea==null || linea.isEmpty())
					break;
					
				sc=new Scanner(linea);
				
				while(sc.hasNext())
				{
					String word=sc.next();
					String category=map_words.get(word);
					
					if(category != null)
					{
						Integer temp=cuentaWords.get(category);
						cuentaWords.put(category, temp!=null ? temp+1 : 1);
					}
				}
			}
			
			boolean chido=false;
			boolean chidoX=false;
			for(String a:lista)
			{
				Integer reales = cuentaWords.get(a);
				
				if(reales == null)
					reales=0;
				
				int needed = vecesN.get(a);
				
				if(reales >= needed)
				{
					o.print((chido==true ? "," : "")+a);
					chido=true;
					chidoX=true;
				}
			}
			
			if(chidoX) o.println();
			else 	 o.println("SQF Problem.");
		}
		o.flush();
	}
}
