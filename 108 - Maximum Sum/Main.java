import java.util.*;

public class Main
{
	public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		int matrix[][];
		
		while(sc.hasNextInt())
		{
			int n = sc.nextInt();
			matrix = new int[n][n];
			
			for(int i=0;i<n;++i) for(int j=0;j<n;j++)
			{
				matrix[i][j] = sc.nextInt();
				if(j > 0)
					matrix[i][j] += matrix[i][j -1];
			}
		
			int currentSum = -127 * 100 * 100;		
			
			for(int start=0;start<n;++start) 
			{
				for(int end=start;end<n;end++)
				{
					int maxSum = 0;
					for(int row=0;row<n;++row)
					{
						if(start > 0)
							maxSum += matrix[row][end] - matrix[row][start - 1];
						else
							maxSum += matrix[row][end];
							
						if(maxSum < 0)
							maxSum = 0;
							
						if(maxSum > currentSum)
							currentSum = maxSum;
					}
				}
			}
			System.out.println(currentSum);
		}
	}
}
