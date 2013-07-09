import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o=new PrintWriter(new OutputStreamWriter(System.out));
		
		String en="";
		Scanner sc;
		
		while(true)
		{
			int n=0;
			
			en=in.readLine();
			if(en == null)
				break;
			
			//n=new Integer(en);
			sc=new Scanner(en);
			n=sc.nextInt();
			
			Queue<Integer> cola=new LinkedList<Integer>();
			PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
			Stack<Integer> pila=new Stack<Integer>();
			
			boolean map[]=new boolean[3];
			StringTokenizer tk;
			
			while(n-->0)
			{
				int op=0, num=0;
				int n1=0, n2=0, n3=0;
				
				//try
				//{
				
				//sc=new Scanner(in.readLine());
				tk=new StringTokenizer(in.readLine());
				op=new Integer(tk.nextToken());
				num=new Integer(tk.nextToken());
				
				//}catch(Exception e){}
				
				if(map[0] && map[1] && map[2])
					break;
				
				if(op==1)
				{
					if(!map[0]) cola.offer(num);
					if(!map[1]) pq.offer(num * -1);
					if(!map[2]) pila.push(num);
				}
				else
				{
					if(!map[0] && !cola.isEmpty())
					{
						n1=cola.remove();
						if(n1 != num)
							map[0]=true;
					}
					if(!map[1] && !pq.isEmpty())
					{
						n2=-1 * pq.poll();
						if(n2 != num) 
							map[1]=true;
					}
					if(!map[2] && !pila.isEmpty())
					{
						n3=pila.pop();
						if(n3 != num)
							map[2]=true;
					}				
				}
			}
			
			int count=0;
			for(int i=0;i<3;i++)
			{
				if(!map[i])
					count++;
			}
			
			if(count==0)
				o.println("impossible");
			else if(count>1)
				o.println("not sure");
			else if(count==1)
			{
				if(!map[0])
					o.println("queue");
				else if(!map[1])
					o.println("priority queue");
				else if(!map[2])
					o.println("stack");
			}
			o.flush();
		}
	}
}
