import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String... args)throws Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(in);
        
        while(sc.hasNextInt())
        {
            ArrayList<String> r = new ArrayList<String>();
            
            int k = sc.nextInt();
            
            for(int y = k + 1; y <= k * 2; y++)
            {
                //double sub = (1.0 / (double)k) - (1.0 / (double)y);
                //double x = Math.pow(sub, -1);
                
                //double x1 = Math.round(x * 10000.0) / 10000.0;

                //System.out.println("y: "+y+" sub: "+sub+" x:"+x + "  "+ x1 +" "+x2);

                if((y*k) % (y-k) == 0)
                    r.add("1/"+k+" = 1/"+((int) ((y*k) / (y-k)))+" + 1/"+y);

                /*
                if(x % 1 == 0)
                {
                    r.add("1/"+k+" = 1/"+((int) x)+" + 1/"+y);
                }
                else if(x1 % 1 == 0)
                {
                    r.add("1/"+k+" = 1/"+((int) x1)+" + 1/"+y);
                }*/
            }
            if(r.size() > 0)
                out.println(r.size());
            for(String t : r)
            {
                out.println(t);
            }
            out.flush();
        }
    }
}
