import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o=new PrintWriter(new OutputStreamWriter(System.out));
		
		while(true)
		{
			int n=new Integer(in.readLine());
			
			if(n==0)
				break;
				
			PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
			
			Scanner sc=new Scanner(in.readLine());
			while(n-->0)
				pq.offer(new Integer(sc.nextInt()));
						
			int sumatotal=0;
			
			while(!pq.isEmpty())
			{
				int n1=pq.poll();
				int n2=pq.poll();

				int suma= n1 + n2;
				sumatotal+=suma;
					
				if(pq.isEmpty())
					break;
					
				pq.offer(suma);
			}
			o.println(sumatotal);
			o.flush();
		}
	}
}
