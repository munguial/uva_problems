import java.util.*;
import java.io.*;

public class Main
{
    public static void main(String... args)throws Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        int cases = new Integer(in.readLine());
        boolean chido = false;
        
        while(cases-->0)
        {
            in.readLine();
            String first = in.readLine();
            int n = first.length();
            int a[][] = new int[n][n];
            
            for(int i = 0; i < n; ++i)
                a[0][i] = first.charAt(i) == '0' ? -1000 : 1;
                
            for(int i = 1; i < n ; ++i)
            {
                String temp = in.readLine();
                for(int j = 0; j < n ; ++j)
                    a[i][j] = temp.charAt(j) == '0' ? -1000 : 1;
            }
            
            for(int i = 0; i < n ; ++i)
            {
                for(int j = 0; j < n ; ++j)
                {
                    if(i > 0)
                        a[i][j] += a[i - 1][j];
                    
                    if(j > 0)
                        a[i][j] += a[i][j - 1];
                    
                    if(i > 0 && j > 0)
                        a[i][j] -= a[i - 1][j - 1];
                }
            }
            
            int max = Integer.MIN_VALUE;
            int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
            
            for(int i = 0; i < n ; ++i)
                for(int j = 0; j < n ; ++j)
                    for(int x = i; x < n ; ++x)
                        for(int y = j; y < n ; ++y)
                        {
                            int value = a[x][y];
                            
                            if(i > 0)
                                value -= a[i - 1][y];
                                
                            if(j > 0)
                                value -= a[x][j - 1];
                                
                            if(i > 0 && j > 0)
                                value += a[i - 1][j - 1];    
                            
                            if(value > max)
                                max = value;
                        }
            
            if(chido) out.println();
                chido = true;
            out.println(max >= 0 ? max : 0);
            out.flush();
        }
        
    }
}
