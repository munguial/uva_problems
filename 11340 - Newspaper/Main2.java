import java.io.BufferedReader;
02
import java.io.IOException;
03
import java.io.InputStreamReader;
04
import java.util.HashMap;
05
 
06
public class Newspaper {
07
 
08
    public static void main(String[] args) throws NumberFormatException, IOException {
09
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
10
 
11
        int x=Integer.parseInt(reader.readLine());
12
        while(x-->0)
13
        {
14
            double []ff=new double [100000];
15
            int m=Integer.parseInt(reader.readLine());
16
            for(int i=0;i<m;i++)
17
            {
18
                String st[]=reader.readLine().split(" ");
19
                ff[st[0].charAt(0)]=Double.parseDouble(st[1]);
20
 
21
            }
22
            int l=Integer.parseInt(reader.readLine());
23
            double f=0;
24
 
25
            for(int i=0;i<l;i++)
26
            {
27
                String st=reader.readLine();
28
 
29
                for(int j=0;j<st.length();j++)
30
                {
31
                    char c=st.charAt(j);
32
 
33
                        f+=ff[c];
34
 
35
                }
36
            }
37
            f=f/100;
38
            System.out.printf("%.2f$\n",f);
39
        }
40
 
41
    }
42
 
43
}

