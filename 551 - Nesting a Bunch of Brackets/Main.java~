import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o=new PrintWriter(new OutputStreamWriter(System.out));
		
		String linea;
		while((linea=in.readLine())!=null)
		{
			Stack<String> pila=new Stack<String>();
			int count=0;
			int i=0;
			boolean chido=true;
			for(i=0;i<linea.length();i++)
			{
				char a=linea.charAt(i);
				if(a=='(' || a=='<' || a=='{' || a=='[')
				{
					if(linea.charAt(i+1)=='*')
					{
						pila.push(String.valueOf(a+""+linea.charAt(i+1)));
						i++;
						count++;
					}
					else
					{
						pila.push(String.valueOf(a));
					}
				}
				else if(a=='>' || a=='}' || a==']' || a==')')
				{
					String elem="";
					if(!pila.isEmpty())
						elem=pila.pop();
					
					if(a=='>' && !elem.equals("<"))
						chido=false;
					if(a=='}' && !elem.equals("{"))
						chido=false;
					if(a==']' && !elem.equals("]"))
						chido=false;
					if(a==')' && !elem.equals("("))
						chido=false;
					
					if(!chido)
						break;
				}
				else if(a=='*' && i < linea.length()-1 && linea.charAt(i+1)==')')
				{
					String elem="";
					if(!pila.isEmpty())
						elem=pila.pop();
					if(!elem.equals("(*"))
					{
						chido=false;
						break;
					}
					i++;
					count++;
				}
			}
			if(chido && pila.isEmpty())
				o.println("YES");
			else if(!chido && !pila.isEmpty())
				o.println("NO"+" "+(i+1-count));
			else
				o.println("NO"+" "+(i+1-count));
			o.flush();
		}
	}
}
