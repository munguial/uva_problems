import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o=new PrintWriter(new OutputStreamWriter(System.out));
		int count=0;
		
		while(true)
		{
			int n=new Integer(in.readLine());
			count++;
			if(n == 0)
				break;
			
			int map[]=new int[999999];
			Scanner sc;
			int index=0;
			
			while(n-->0)
			{
				sc=new Scanner(in.readLine());
				int m=sc.nextInt();
				
				while(m-->0)
				{
					map[sc.nextInt()]=index;
				}
				index++;
			}
			String linea;
			o.println("Scenario #"+count);

			Node first, last;
			first=last=null;
			
			Node chidos[]=new Node[1001];

			while(!(linea=in.readLine()).equals("STOP"))
			{
				if(linea.split(" ")[0].equals("ENQUEUE"))
				{
					int num=new Integer(linea.split(" ")[1]);
					
					Node nuevo=new Node(num);
					
					if(first==null)
					{
						first=nuevo;
						last=nuevo;
						nuevo.next=null;
						chidos[map[num]]=last;
					}
					else if(chidos[map[num]]!=null)
					{
						Node viejo=chidos[map[num]];
						nuevo.next=viejo.next;
						viejo.next=nuevo;
						chidos[map[num]]=nuevo;
					}
					else
					{
						Node viejo=last;
						last=nuevo;
						viejo.next=last;
						last.next=null;
						chidos[map[num]]=last;
					}
					
				}
				else if(linea.split(" ")[0].equals("DEQUEUE"))
				{
					if(first!=null)
					{
						o.println(first.value);
						
						if(chidos[map[first.value]]==first)
							chidos[map[first.value]]=null;
							
						first=first.next;
					}
				}
			}
			o.println();
			o.flush();
		}
	}
}
class Node
{
	public Node(int num)
	{
		value=num;
	}
	int value;
	Node next;
}
