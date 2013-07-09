import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String... agrs)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		String entrada;
		
		while( (entrada = in.readLine()) != null)
		{
			int n = new Integer(entrada.split(" ")[0]);
			int m = new Integer(entrada.split(" ")[1]);
			
			Vector<Vector<Pair>> list;
			list = new Vector<Vector<Pair>>(m);
				
			for(int a=0;a<m;a++)
				list.add(new Vector<Pair>());
			
			for(int i=0;i<n;++i)
			{
				String line1 = in.readLine();
				String line2 = in.readLine();
				
				Scanner sc = new Scanner(line1);
				Scanner sc2=new Scanner(line2);
				
				int nums = sc.nextInt();
				//out.println(list.size());
				
				for(int x=0;x<nums;++x)
				{
					int pos = sc.nextInt();
					
					list.elementAt(pos-1).add(new Pair(x+1, new Integer(sc2.nextInt())));
				}
			}
			out.println(m+" "+n);
			
			for(int i=0;i<list.size();++i)
			{
				out.print(list.elementAt(i).size()+" ");
				for(int temp=0;temp<list.elementAt(i).size();temp++)
				{
					out.print((list.elementAt(i).elementAt(temp).pos+1)+" ");
				}
				out.println();
				
				for(int temp=0;temp<list.elementAt(i).size();temp++)
				{
					out.print((list.elementAt(i).elementAt(temp).elem)+" ");
				}
				out.println();
			}
		}
		out.flush();
	}
}

class Pair
{
	public Pair(int pos, int element)
	{
		this.elem=element;
		this.pos=pos;
	}
	int pos;
	int elem;
}
