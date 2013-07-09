import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o=new PrintWriter(new OutputStreamWriter(System.out));
		
		int n=new Integer(in.readLine());
		
		while(n-->0)
		{
			String line=in.readLine();
			boolean marica=true;
			Stack<Character> pila=new Stack<Character>();
			
			for(int i=0;i<line.length();i++)
			{
				char a=line.charAt(i);
				if(a=='(' || a=='[')
					pila.push(a);
					
				else if(a==')')
				{
					if(pila.isEmpty() || pila.pop()!='(')
					{
						o.println("No");
						marica=false;
						break;
					}
				}
				else if(a==']')
				{
					if(pila.isEmpty() || pila.pop()!='[')
					{
						marica=false;
						o.println("No");
						break;
					}
				}
			}
			if(marica && pila.isEmpty())
				o.println("Yes");
			else if(marica && !pila.isEmpty())
				o.println("No");
			o.flush();
		}
	}
}
