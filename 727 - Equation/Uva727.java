import java.io.*;
import java.util.*;

public class Uva727
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter o=new PrintWriter(new OutputStreamWriter(System.out));
		
		int n=new Integer(in.readLine());
		in.readLine();
		int prior[]=new int[300];
		prior['+']=1;
		prior['-']=1;
		prior['*']=2;
		prior['/']=2;
		prior['(']=0;
		boolean chido=false;
		
		while(n-->0)
		{
			String line;
			Stack<Character> pila=new Stack<Character>();
			String postfija="";
			
			while((line=in.readLine())!=null)
			{
				if(line.equals(""))
					break;
					
				char c=line.charAt(0);
				
				if("(+*/-".contains(String.valueOf(c)))
				{
					if( pila.isEmpty() || prior[c] > prior[pila.peek()] || c=='(')
						pila.push(c);
						
					else if(prior[c] <= prior[pila.peek()])
					{
						while(!pila.isEmpty() && pila.peek()!='(' && prior[c] <= prior[pila.peek()])
							postfija+=pila.pop();
						pila.push(c);
					}
				}
				else if(c==')')
				{
					char a;
					while(!pila.isEmpty() && (a=pila.pop())!='(')
						postfija+=a;
				}
				else if("1234567890".contains(String.valueOf(c)))
					postfija+=c;
			}
			while(!pila.isEmpty())
				postfija+=pila.pop();
			
			if(chido)
				o.println();
			chido=true;
			o.println(postfija);
			o.flush();
		}
	}
}	
