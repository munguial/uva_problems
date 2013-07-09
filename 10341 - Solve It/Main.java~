import java.io.*;
import java.util.*;

public class Main
{
	static int p, q, r, s, t, u;
	static final double EPS = 1 * Math.pow(Math.E,-20);
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		p=q=r=s=t=u=0;
		
		while(true)
		{
			String line = in.readLine();
			
			if(line==null)
				break;
				
			StringTokenizer tk = new StringTokenizer(line);
			
			p=new Integer(tk.nextToken());
			q=new Integer(tk.nextToken());
			r=new Integer(tk.nextToken());
			s=new Integer(tk.nextToken());
			t=new Integer(tk.nextToken());
			u=new Integer(tk.nextToken());
			
			if(f(0)*f(1) > 0)
				out.println("No solution");
			else
				out.printf("%.4f\n",bisection());
				
			out.flush();
		}
	}
	static double bisection()
	{
		double ini = 0.0;
		double fin = 1.0;
		double m=0.0;
		
		while(ini + EPS < fin)
		{
			m = (ini + fin)/2.0;
			
 			if(f(ini) * f(m) <= 0)
				fin = m;
			else
				ini = m;
		}
		return m;
	}
	static double f(double x)
	{
		return (p*Math.pow(Math.E,-x)) + (q * Math.sin(x)) + (r*Math.cos(x)) + (s * Math.tan(x)) + (t * (x*x)) + u;
	}
}