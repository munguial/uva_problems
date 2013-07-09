import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		Scanner sc=new Scanner(System.in);
		PrintWriter o = new PrintWriter(new OutputStreamWriter(System.out));
		
		int n=sc.nextInt();
		boolean chido=false;
		
		while(n-->0)
		{
			if(chido)
				o.println();
			chido=true;
		
			int n1=sc.nextInt();
			int m=sc.nextInt();
			
			int []adds=new int[n1];
			int []gets=new int[m];
			
			PriorityQueue<Integer> q_max=new PriorityQueue<Integer>();
			PriorityQueue<Integer> q_min=new PriorityQueue<Integer>();
			
			for(int i=0;i<n1;i++)
				adds[i]=sc.nextInt();
			
			for(int i=0;i<m;i++)
				gets[i]=sc.nextInt();
			
			int size=1;
			q_min.offer(adds[0]);
			int index=1;
			int count=1;
			
			for(int i=0;i<m;i++)
			{
				int x=gets[i];
				
				while(size < x)
				{
					if(adds[index] < q_min.peek())
					{
						q_max.offer(-1 * adds[index++]);
						q_min.offer(q_max.poll() * -1);
					}
					else
						q_min.offer(adds[index++]);
						
					++size;
				}
				if(q_min.size() > 1 && count > 1)
					q_max.offer(q_min.poll() * -1);
					
				count++;
				o.println(q_min.peek());
			}
		}
		o.flush();
	}
}
