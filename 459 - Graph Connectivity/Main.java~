import java.io.*;
import java.util.*;

public class Main
{
	static int []array;
	static int []count;
	static boolean []checked;

	public static void main(String... arhs)throws Exception
	{
		BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

		int n = new Integer(in.readLine());
		in.readLine();
		boolean chido=false;

		while(n-- >0)
		{
			char c = in.readLine().charAt(0);
			init_array(c);
			int count2=0;

			while(true)
			{
				String en=in.readLine();
				if(en == null || en.isEmpty())
					break;
			
				int a = en.charAt(0) - 'A';
				int b = en.charAt(1) - 'A';

				if(count[find(a)] > count[find(b)] )
				{
					array[find(b)] = find(a);
					count[find(a)]++;
				}
				else
				{
					array[find(a)] = find(b);
					count[find(b)]++;
				}
			}
			for(int i=0; i<array.length; ++i)
			{
				int x = find(array[i]);
				if(!checked[x])
				{
					count2++;
					checked[x]=true;
				}
			}
			if(chido)
				out.println();
			chido=true;
			out.println(count2);
		}
		out.flush();
	}

	static int find(int i)
	{
		if(array[i] == i) return i;
		else
		{
			int r = find(array[i]);
			array[i]=r;
			return r;
		}
	}

	static void init_array(char c)
	{
		count = new int[c - 'A' + 1];
		array = new int[c - 'A' + 1];
		checked = new boolean[c - 'A' + 1];
		for(int i=0;i<array.length;++i)
			array[i]=i;
	}
}
