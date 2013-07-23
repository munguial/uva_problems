import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String... args)throws Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(in);
        boolean nice = false;
        long n = sc.nextLong();
        
        while(n-- >0)
        {
            long num = sc.nextLong();
            long denominator = 1;
            
            if(nice)
                out.println();
            nice = true;
            
            while(true)
            {
                long numerator = num * denominator;
                //System.out.println(numerator);
                if(numerator > 9876543210l)
                {
                    break;
                }
                
                if(check(numerator) && check(denominator))
                {
                    out.println(numerator+" / "+denominator+" = "+num);
                }
                
                denominator++;
            }
        }
        out.flush();
    }
    static boolean check(long num)
    {
        String n = num + "";
        boolean d[] = new boolean[10];
        
        for(int i = 0; i < n.length(); ++i)
        {
            if(d[n.charAt(i) - '0'])
                return false;
            else
                d[n.charAt(i) - '0'] = true;
        }
        return true;
    }
}
