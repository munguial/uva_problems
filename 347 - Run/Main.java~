import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String... args)throws Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int cases = 0;
        boolean array[] = new boolean[9876544];
        
        for(int i = 12; i <= 9876543; ++i)
        {
            boolean d[] = new boolean[10];
            String n = i + "";
            int c = 0;
            int count = n.length();
            
            for(; count-- > 0;)
            {
                c = (c +  (n.charAt(c) - '0')) % n.length();
                if(d[n.charAt(c) - '0'])
                {
                    c = 1;
                    break;
                }
                else
                    d[n.charAt(c) - '0'] = true;
            }
            
            if(c == 0)
                array[i] = true;
        }
        
        while(true)
        {
            cases++;
            String line = in.readLine();
            if(line.equals("0"))
                break;
                
            int v = new Integer(line);
            
            for(int i = v; i < 9876544;++i)
                if(array[i])
                {
                    out.println("Case "+cases+": "+i);
                    break;
                }
        }
        out.flush();
    }
}
