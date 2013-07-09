import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String... args)
	{
		try
		{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			Scanner sc=new Scanner(System.in);

			String en;
			while(true)
			{
				en=in.readLine();
				if(en==null)
					break;
				if(en.trim().equals(""))
					break;

				int n=new Integer(en.trim());

				int a[]=new int[n];

				String linea=in.readLine();

				Scanner sc1=new Scanner(linea);

				for(int i=0;i<n;i++)
					a[i]=sc1.nextInt();

				int count=0;
				for(int i=0;i<n;i++)
					for(int j=n-1;j>i;j--)
						if(a[j-1] > a[j])
						{
							a[j-1]+=a[j];
							a[j]=a[j-1] - a[j];
							a[j-1]=a[j-1] - a[j];
							count++;
						}
				System.out.println("Minimum exchange operations : "+count);
			}
		}catch(Exception e){}		
	}	
}
