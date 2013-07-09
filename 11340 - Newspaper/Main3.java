import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
 
public class Newspaper {
 
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
        int x=Integer.parseInt(reader.readLine());
        while(x-->0)
        {
            double []ff=new double [100000];
            int m=Integer.parseInt(reader.readLine());
            for(int i=0;i<m;i++)
            {
                String st[]=reader.readLine().split(" ");
                ff[st[0].charAt(0)]=Double.parseDouble(st[1]);
 
            }
            int l=Integer.parseInt(reader.readLine());
            double f=0;
 
            for(int i=0;i<l;i++)
            {
                String st=reader.readLine();
 
                for(int j=0;j<st.length();j++)
                {
                    char c=st.charAt(j);
 
                        f+=ff[c];
 
                }
            }
            f=f/100;
            System.out.printf("%.2f$\n",f);
        }
 
    }
 
}

