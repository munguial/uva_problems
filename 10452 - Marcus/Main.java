import java.util.*;
import java.io.*;

public class Main
{
    static String s = "IEHOVA#";
    static ArrayList<String> r;
    static int m, n;
    static boolean first;

    public static void main(String... args)throws Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int cases = new Integer(in.readLine());
        
        while(cases-- > 0)
        {
            String nums = in.readLine();
            r = new ArrayList<String>();
            m = new Integer(nums.split(" ")[0]);
            n = new Integer(nums.split(" ")[1]);
            
            char matrix[][] = new char[m][n];
            
            int a = 0;
            int b = 0;
            
            for(int i = 0; i < m; ++i)
            {
                String line = in.readLine();
                for(int j = 0; j < n; ++j)
                {
                    matrix[i][j] = line.charAt(j);
                    if(matrix[i][j] == '@')
                    {
                        a = i;
                        b = j;
                    }
                }
            }
            first = true;
            dfs(matrix, a, b, 0);
        }
    }
    static void dfs(char[][] matrix, int a, int b, int i)
    {
        if(matrix[a][b] == '#')
        {
            for(String t : r)
            {
                System.out.print(first ? t : " " + t);
                first = false;
            }
            System.out.println();
            return;
        }
        if(b - 1 >= 0 && matrix[a][b - 1] == s.charAt(i))
        {
            r.add("left");
            dfs(matrix, a, b - 1, i + 1);
            r.remove(r.size() - 1);
        }
        if(b + 1 < n && matrix[a][b + 1] == s.charAt(i))
        {
            r.add("right");
            dfs(matrix, a, b + 1, i + 1);
            r.remove(r.size() - 1);
        }
        if(a - 1 >= 0 && matrix[a - 1][b] == s.charAt(i))
        {
            r.add("forth");
            dfs(matrix, a - 1, b, i + 1);
            r.remove(r.size() - 1);
        }
    }
}
