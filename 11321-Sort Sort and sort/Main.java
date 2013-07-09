import java.io.*;
import java.util.*;

public class Main
{
	static int m;
	public static void main(String... erg)throws Exception
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(new OutputStreamWriter(System.out));

		while(true)
		{
			String entrada=in.readLine();
			int n=new Integer(entrada.split(" ")[0]);
			m=new Integer(entrada.split(" ")[1]);

			if(n==0 && m==0)
			{
				out.println(n+" "+m);
				out.flush();
				break;
			}

			ArrayList<Integer> array=new ArrayList<Integer>();

			for(int i=0;i<n;i++)
				array.add(new Integer(in.readLine()));

			Collections.sort(array,new Comparator<Integer>()
			{
				public int compare(Integer uno, Integer dos)
				{
					if(dos%m == uno%m)
					{
						if(uno%2==0 && dos%2!=0)
						{
							return -1;
						}
						else if(uno%2!=0 && dos%2==0)
						{
							return 1;
						}

						else if(uno%2==0 && dos%2==0)
						{
							if(uno > dos)
								return -1;
							else
								return 1;
						}
						else if(uno%2!=0 && dos%2!=0)
						{
							if(uno > dos)
								return 1;
							else
								return -1;
						}
						else
							return 0;
					}
					return dos%m - uno%m;
				}
			});

			out.println(n+" "+m);
			for(int i=n-1;i>=0;i--)
				out.println(array.get(i));

			out.flush();
		}
	}
}
