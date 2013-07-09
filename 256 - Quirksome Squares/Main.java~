import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String... args)throws Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(in);
        String r[] = new String[9];
        
        r[2] = "00\n01\n81";
        r[4] = "0000\n0001\n2025\n3025\n9801";
        r[6] = "000000\n000001\n088209\n494209\n998001";
        r[8] = "00000000\n00000001\n04941729\n07441984\n24502500\n25502500\n52881984\n60481729\n99980001";
        
        while(sc.hasNextInt())
        {
            int n = sc.nextInt();
            out.println(r[n]);
            
            /*
            ArrayList<String> res = new ArrayList<String>();
            
            for(int i = 0; ; ++i)
            {
                StringBuilder s = new StringBuilder(i+"");
                if(s.length() > n)
                    break;
                    
                buildString(s, n);
                
                long r = new Long(s.toString());
                long a = new Long(s.substring(0,n/2));
                long b = new Long(s.substring(n/2));
                
                if(Math.pow(a + b, 2) == r)
                    res.add(s.toString());
            }
            map.put(n, res);
            
            for(String t : res)
                out.println(t);
            */
        }
        out.flush();
    }
    static void buildString(StringBuilder s, int n)
    {
        while(s.length() < n)
            s.insert(0,"0");
    }
}
