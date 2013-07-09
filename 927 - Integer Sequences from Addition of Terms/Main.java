import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String... args)throws Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(in);       
        int cases = sc.nextInt();
        
        while(cases-- >0)
        {
            int tam = sc.nextInt();
            long a[] = new long[tam + 1];
            
            for(int i = 0; i <= tam; ++i)
                a[i] = sc.nextLong();
                
            long d = sc.nextLong();
            long k = sc.nextLong();           
            int iter = 0;
            int n = 1;
            
            while(iter < k)
            {
                iter += n * d;
                
                if(iter >= k)
                {
                    long value = 0;
                    long val = 0;
                
                    for(int x = 0; x <= tam; ++x)
                        value += a[x] * Math.pow(n, x);
                        
                    out.println(value);
                    break;
                }
                n++;
            }
            out.flush();
        }
    }
}
