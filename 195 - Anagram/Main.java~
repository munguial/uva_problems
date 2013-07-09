/*
 * Anagram
 */
import java.util.*;

public class Main 
{
    static char array[];
    static boolean visited[];
    static StringBuilder sb;
    static ArrayList<String> lista;
    
    public static void main(String... agrs)
    {
        Scanner sc=new Scanner(System.in);
        
        int n=new Integer(sc.nextLine());
        String en;
        boolean abc[]=new boolean[256];
        
        while(n-->0)
        {
            en=sc.nextLine();
            Arrays.fill(abc, false);
            array=en.toCharArray();
            visited=new boolean[array.length];
            lista=new ArrayList<String>();
            
            for(int i=0;i<array.length;i++)
            {
                Arrays.fill(visited, false);
                sb=new StringBuilder(String.valueOf(array[i]));
                
                if(!abc[array[i]])
                    dfs(i);
                
                abc[array[i]]=true;
            }
            
            //Collections.sort(lista);
            
            for(String l:lista)
            {
            	for(int i=0;i<l.length();i++)
            	{
            		char c=l.charAt(i);
            		
            		
            	}
            
            }
            
            for(String l:lista)
                System.out.println(l);
            
            //System.out.println("acabo");
            
        }
    }
    
    static void dfs(int i)
    {
        String cadena="";
        visited[i]=true;
        for(int x=0;x<array.length;x++)
        {
            if(!visited[x] && !cadena.contains(String.valueOf(array[x])))
            {
                cadena+=String.valueOf(array[x]);
                visited[x]=true;
                sb.append(array[x]);
                
                if(sb.length()==array.length)
                    lista.add(sb.toString());
                else
                    dfs(x);
                
                visited[x]=false;
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
    
}
