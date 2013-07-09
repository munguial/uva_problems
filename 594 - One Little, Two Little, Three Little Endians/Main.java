import java.util.*;
import static java.lang.System.*;

public class Main
{
	public static void main(String... args)
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			String en;
			
			while((en=sc.nextLine())!=null)
			{
				int n=new Integer(en);
				
				out.println(Integer.toBinaryString(n));
				
				int nuevo=0;
				int temp=0;
				
				int uno=0;
				int dos=0;
				int tres=0;
				int cuatro=0;

				nuevo = nuevo | (n & (int)(Math.pow(2,8)-1.0) - (int)(Math.pow(2,0)-1.0) );
				out.println(Integer.toBinaryString(nuevo));
				nuevo = nuevo << 8;
				out.println(Integer.toBinaryString(nuevo));
				nuevo = nuevo | ( n & (int)(Math.pow(2,16)-1.0) - (int)(Math.pow(2,8)-1.0));
				out.println(Integer.toBinaryString(nuevo));
				nuevo = nuevo << 8;
				out.println(Integer.toBinaryString(nuevo));
				nuevo = nuevo | (n & (int)(Math.pow(2,32)-1.0) - (int)(Math.pow(2,16)-1.0));
				out.println(Integer.toBinaryString(nuevo));
				nuevo = nuevo << 8;
				out.println(Integer.toBinaryString(nuevo));
				nuevo = nuevo | (n & (int)(Math.pow(2,64)-1.0) - (int)(Math.pow(2,32)-1.0));
				out.println(Integer.toBinaryString(nuevo) + " "+nuevo);
			}
		}catch(Exception e){}
	}
}
