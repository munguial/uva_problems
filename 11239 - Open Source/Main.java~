import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o = new PrintWriter(new OutputStreamWriter(System.out));
		
		String line;
		afuera:
		while(true)
		{
			TreeMap<String,String> projects=new TreeMap<String, String>();
			TreeSet<String> general=new TreeSet<String>();
			ArrayList<Chido> salida = new ArrayList<Chido>(); 
			TreeMap<String,Integer> hits=new TreeMap<String, Integer>();
			TreeSet<String> temporal = new TreeSet<String>(); 
			String titulo="";
			String entrada;
			
			while(true)
			{
				entrada=in.readLine();					
				char first=entrada.charAt(0);
				
				if(first == '1')
					break;
				
				if(first == '0')
					break afuera;
				
				if(first >= 'A' && first<= 'Z')
				{
					hits.put(entrada,0);
					titulo = entrada;
					
					while(temporal.size()>0)
					{
						String a2=temporal.pollFirst();
						
						if(general.contains(a2))
							projects.remove(a2);
						else
							general.add(a2);
					}
				}
				else
				{
					projects.put(entrada, titulo);
					temporal.add(entrada);
				}
			}
			while(temporal.size()>0)
			{
				String a2=temporal.pollFirst();
				
				if(general.contains(a2))
					projects.remove(a2);
				else
					general.add(a2);
			}
			
			for(String a:projects.values())
				hits.put(a, hits.get(a) + 1);
				
			for(String a : hits.keySet())
				salida.add(new Chido(a,hits.get(a)));
				
			Collections.sort(salida, new Comparator<Chido>(){
				public int compare(Chido uno, Chido dos)
				{
					return uno.nombre.compareTo(dos.nombre);
				}
			});
			
			Collections.sort(salida, new Comparator<Chido>(){
				public int compare(Chido uno, Chido dos)
				{
					return dos.hits - uno.hits;
				}
			});
			
			for(Chido c : salida)
				o.println(c.nombre + " " + c.hits);
		
		}
		o.flush();
	}
}

class Chido
{
	public Chido(String name, int i)
	{
		nombre=name;
		hits=i;
	}
	String nombre;
	int hits;
}
