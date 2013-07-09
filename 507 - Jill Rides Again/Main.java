import java.util.*;

public class Main
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		int counter = 0;
		int n = sc.nextInt();
		
		while(n-- >0)
		{
			counter++;
			int x = sc.nextInt();
			int array[] = new int[x-1];
			
			for(int i=0;i<x-1;++i)
				array[i] = sc.nextInt();
			
			int a=0;
			int b=0;
			int maxSum = Integer.MIN_VALUE;
			int curr = 0;
			int maxdiff = 0;
			int currDiff =0;
			int maxa=0;
			int maxb=0;
			
			for(int i=0;i<x-1;++i)
			{
				curr += array[i];
				System.out.println(array[i]+" current sum: "+curr+" b: "+b);
				
				if(curr > maxSum)
				{
					maxSum = curr;
					
					if(b - a > maxdiff)
					{
						maxdiff = b - a;
						maxa = a;
						maxb = b;
					}
				}
				if(curr == maxSum && b > maxb)
					maxb = b;
				if(curr < 0)
				{
					curr = 0;
					if(i < array.length-1)
					{
						a = i + 1;
						b = i + 1;
					}	
				}
				else
					b++;
			}
			System.out.println("max sum: "+maxSum);
			if(maxSum > 0)
				System.out.println("The nicest part of route "+counter+" is between stops "+maxa+" and "+maxb);
			else
				System.out.println("Route "+counter+" has no nice parts");
		}
	}
}
