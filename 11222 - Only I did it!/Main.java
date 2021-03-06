import java.util.*;
import static java.lang.System.*;

public class Main
{
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int count=0;
		
		while(n-->0)
		{
			count++;
			int array[]=new int[10001];
			int n1=sc.nextInt();
			while(n1-->0)
			{
				int x=sc.nextInt();
				if(array[x]>0)
					array[x]=4;
				else
					array[x]=1;
			}
			int n2=sc.nextInt();
			while(n2-->0)
			{
				int x=sc.nextInt();
				if(array[x]>0)
					array[x]=4;
				else
					array[x]=2;
			}
			int n3=sc.nextInt();
			while(n3-->0)
			{
				int x=sc.nextInt();
				if(array[x]>0)
					array[x]=4;
				else
					array[x]=3;
			}

			ArrayList<Integer> putos[]=new ArrayList[3];
			
			for(int i=0;i<3;i++)
				putos[i]=new ArrayList<Integer>();

			for(int i=0;i<10001;i++)
			{
				if(array[i]>0 && array[i]<4)
				{
					if(array[i]==1)
						putos[0].add(i);
					else if(array[i]==2)
						putos[1].add(i);
					else if(array[i]==3)
						putos[2].add(i);						
				}
			}
			
			int max=0;
			
			for(int i=0;i<3;i++)
				if(putos[i].size()>max)
					max=putos[i].size();
					
			
			out.printf("Case #%d:\n",count);
			
			for(int i=0;i<3;i++)
			{
				if(putos[i].size()==max)
				{
					System.out.print((i+1)+" "+putos[i].size());
					for(int a:putos[i])
						System.out.print(" "+a);
					out.printf("\n");
				}
			}
		}
	}
}
