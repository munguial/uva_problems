import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o=new PrintWriter(new OutputStreamWriter(System.out));
		boolean chido=false;
		int n=new Integer(in.readLine());
		int array[]=new int[256];
		array['A']=2;
		array['B']=2;
		array['C']=2;
		array['D']=3;
		array['E']=3;
		array['F']=3;
		array['G']=4;
		array['H']=4;
		array['I']=4;
		array['J']=5;
		array['K']=5;
		array['L']=5;
		array['M']=6;
		array['N']=6;
		array['O']=6;
		array['P']=7;
		array['R']=7;
		array['S']=7;
		array['T']=8;
		array['U']=8;
		array['V']=8;
		array['W']=9;
		array['X']=9;
		array['Y']=9;
		
		while(n-->0)
		{
			in.readLine();
			
			if(chido)
				o.println();
			chido=true;
			
			int m=new Integer(in.readLine());
			TreeMap<Integer, Integer> tree=new TreeMap<Integer, Integer>();
			
			while(m-->0)
			{
				String temp=in.readLine();
				String arma="";
				int count=0;
				
				for(int i=0;i<temp.length();i++)
				{
					if(temp.charAt(i)>='A' && temp.charAt(i)<='Z')
					{
						arma+=array[temp.charAt(i)];
						count++;
					}
					else if(temp.charAt(i)>='0' && temp.charAt(i)<='9')
					{
						arma+=temp.charAt(i);
						count++;
					}
					if(count == 7)
						break;
				}
				
				int perro=new Integer(arma);
				
				Integer x=tree.get(perro);
				
				if(x != null)
					tree.put(perro, ++x);
				else
					tree.put(perro, 1);
				
			}
			boolean pedorro=false;
			
			for(int t:tree.keySet())
			{
				int tempo=tree.get(t);
				
				if(tempo>1)
				{
					o.printf("%03d-%04d %d\n",t/10000,t-((t/10000)*10000),tempo);
					pedorro=true;
				}
			}
			if(!pedorro)
				o.println("No duplicates.");
		}
		o.flush();
	}
}
