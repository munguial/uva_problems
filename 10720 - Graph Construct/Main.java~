import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String... args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		while(true)
		{
			String line = in.readLine();
			
			if(line.equals("0"))
				break;
				
			boolean chido = true;
			
			Scanner sc=new Scanner(line);
			
			int n = sc.nextInt();
			ArrayList<Integer> array = new ArrayList<Integer>();
			
			for(int i=0;i<n;++i)
				array.add(sc.nextInt());
			
			int ods=0;	
				
			for(int i=0;i<array.size();++i)
			{
				if(array.get(i) > (n-1))
				{
					chido = false;
					break;
				}
				if(array.get(i) %2 != 0)
					++ods;
			}	
			if(ods %2 != 0)
				chido=false;
				
				
			if(chido)
			while(true)
			{
				/*for(int a:array)
					out.print(a+" ");
				out.println();
				*/
				boolean zeroes=true;
				for(int i=0;i<array.size();++i)
				{
					if(array.get(i) < 0)
					{
						chido = false;
						break;
					}
					if(array.get(i) != 0)
						zeroes=false;
				}
				if(zeroes)
				{
					chido=true;
					break;
				}
				
				Collections.sort(array, new Comparator<Integer>(){
					public int compare(Integer uno, Integer dos)
					{
						return dos - uno;
					}
				});	
				
				int first=array.remove(0);
				
				for(int i=0;i<first;++i)
					array.set(i, array.get(i) -1);
			}
			
			if(chido)
				out.println("Possible");
			else
				out.println("Not possible");
		}
		out.flush();
	}
}
