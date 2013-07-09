import java.util.*;

public class Main
{
	static int []dp;
	public static void main(String... agrs)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		while(n-->0)
		{
			int tam = sc.nextInt();
			
			int array[] = new int[tam];
			dp = new int[500001];
			for(int i=0;i<dp.length;++i)
				dp[i]=-1;
			int total = 0;
			
			for(int i=0;i<tam;++i)
			{
				array[i] = sc.nextInt();
				total += array[i];
			}
			
			System.out.println(getMin(array,0, 0, total));
		}
	}
	static int getMin(int array[], int i, int sum, int total)
	{
		System.out.println("i:"+i+" sum:"+sum+" total:"+total);
		if(dp[sum] != -1)
			return dp[sum];
		if(i == array.length)
		{
			System.out.println("llega el final");
			return Integer.MAX_VALUE;
		}
			
		int min = Integer.MAX_VALUE;
		int temp = 0;
			
		for(int x=i;x<array.length;++x)
		{
			int currentSum =sum + array[x];
			int resto = total - currentSum;
			if(resto - currentSum == currentSum)
			{	
				System.out.println("exacto");
				min = 0;
			}
			
			if(currentSum < resto)
			{
				 //System.out.println(currentSum+" < "+resto);
				 temp = Math.min(resto - currentSum,getMin(array, x+1, currentSum, total));
				 System.out.println("temp:"+temp);
				 if(temp < min)
				 	min = temp;
			}
		
		}
		//System.out.println(min);
		return dp[sum] = min;
	}
}
