import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String... args)throws Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        boolean first = false;
        int cases = new Integer(in.readLine());
        
        while(cases-->0)
        {
            int n = new Integer(in.readLine());
            Maker array[] = new Maker[n];
            
            for(int i=0; i< n ; ++i)
            {
                String line = in.readLine();
                array[i] = new Maker(line.split(" ")[0], new Integer(line.split(" ")[1]), new Integer(line.split(" ")[2]));
            }
            
            int n2 = new Integer(in.readLine());
            
            if(first) out.println();
            first = true;
            
            for(int i=0; i< n2 ; ++i)
            {
                int num = new Integer(in.readLine());
                String result = "UNDETERMINED";
                boolean empty = false;
                
                for(Maker m : array)
                {
                    if(num >= m.low && num <= m.hi)
                    {
                        if(empty)
                        {
                            result = "UNDETERMINED";
                            break;
                        }
                        result = m.name;
                        empty = true;
                    }
                }
                out.println(result);
            }
            out.flush();
        }        
    }
}
class Maker
{
    String name;
    int low;
    int hi;
    public Maker(String n, int l, int h)
    {
        name = n;
        low = l;
        hi = h;
    }
}
