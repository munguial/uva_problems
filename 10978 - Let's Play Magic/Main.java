import java.util.*;
import static java.lang.System.*;

public class Main
{
	public static void main(String... agrs)
	{
		Scanner sc=new Scanner(System.in);

		int n=new Integer(sc.nextLine());
		String array[]=new String[n];
		Arrays.fill(array,"");
		int i=0;
		int m=n;

		while(n-->0)
		{
			if(n<=0)
				break;
		
			String x=sc.nextLine();
			
			String clave=x.split(" ")[0];
			String valor=x.split(" ")[1];

			int pos=valor.length();
			int count=0;

			for(;;i=(i+1)%(m-1))
			{
				if(array[i].equals(""))
					count++;

				if(count==pos)
				{
					array[i]=clave;
					break;
				}
			}
		}
		for(int x=0;x<m;x++)
			out.printf("%s ",array[x]);
		out.printf("\n");
	}
}
