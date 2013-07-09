import java.io.*;
import java.util.*;

public class Main
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
			
			factors=new ArrayList<Integer>();
			
			boolean agregados[]=new boolean[100000000];
			for(int i=2;i<=(int)Math.sqrt(n);i++)
			{
				if(n%i==0)
				{
					factors.add(i);
					agregados[i]=true;
					if(!agregados[n/i])
						factors.add(n/i);
				}
			}
			
			/*for(int x:factors)
				o.print(x+" ");
			o.println();*/
			
			array=new ArrayList<String>();	
			pila=new Stack<Integer>();
			generate(n,0);
			
			o.println(array.size());
			for(String a:array)
				o.println(a);
				
			o.flush();
		}
	}
	static void generate(int n, int last_div)
	{
		if(n==1)
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
		else
		{
			for(int i=last_div; i < factors.size(); i++)
			{
				if(n % factors.get(i)==0)
				{
					pila.push(factors.get(i));
					generate(n/factors.get(i),i);
					pila.pop();
				}
			}
		}
	}
}
