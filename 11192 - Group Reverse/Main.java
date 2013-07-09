import java.util.*;

public class Main
{
	public static void main(String... args)
	{
		Scanner sc=new Scanner(System.in);

		StringTokenizer tk;

		String en;

		while(!(en=sc.nextLine()).equals("0"))
		{
			tk=new StringTokenizer(en);
			
			int n=new Integer(tk.nextToken());

			char cadena[]=tk.nextToken().toCharArray();

			String salida="";	
			int k=cadena.length / n;

			char []temp=new char[k];

			int count=0;

			for(int i=0;i<cadena.length;i++)
			{
				temp[count++]=cadena[i];

				if(count==k)
				{
					salida+=vacia(temp,salida);
					count=0;
				}
			}

			System.out.println(salida);
		}
	}
	static String vacia(char temp[], String salida)
	{
		salida="";
		for(int i=temp.length-1;i>=0;i--)
			salida+=temp[i];

		return salida;
	}
}
