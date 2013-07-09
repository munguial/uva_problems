import java.io.*;
import java.util.*;

public class Main2
{
	static Stack<Integer> pila;
	static BufferedReader in;
	static PrintWriter o;	
	static ArrayList<String> array;
	static ArrayList<Integer> factors;
	
	public static void main(String... args)throws Exception
	{
		in=new BufferedReader(new InputStreamReader(System.in));
		o=new PrintWriter(new OutputStreamWriter(System.out));
		
		while(true)
		{
			int n=new Integer(in.readLine());
			
			if(n==0)
				break;
			
			/*for(int x:factors)
				o.print(x+" ");
			o.println();*/
			
			array=new ArrayList<String>();	
			pila=new Stack<Integer>();
			generate(n,2);
			
			o.println(array.size());
			for(String a:array)
			{
				o.println(a);
			}
				
			o.flush();
		}
	}
	static void generate(int n, int last_div)
	{
		if(n==1)
		{
			if(pila.size()>1)
			{
				String temp="";
				boolean chido=false;
				for(int i:pila)
				{
					if(chido)
						temp+=" ";
					chido=true;
				
					temp+=i;
				}
				if(!temp.isEmpty())
					array.add(temp);
			}
		}
		else
		{
			for(int i=last_div; i <= n; i++)
			{
				if(n % i==0)
				{
					pila.push(i);
					generate(n/i,i);
					pila.pop();
				}
			}
		}
	}
}
