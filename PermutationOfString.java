package exercisepgm_1;

import java.util.*;
import java.util.Map.Entry;

public class PermutationOfString {
	
	public static void permutation(String str)
	{
		Map<Character,Integer> m=new HashMap<Character,Integer>();
		int count=1;
		for(int i=0;i<str.length();i++)
		{
			
			
			
			if(!m.containsKey(str.charAt(i)))
			{
			m.put(str.charAt(i),1);
			}
			else
			{
				count=m.get(str.charAt(i))+1;
				m.put(str.charAt(i), count);
			}
		}
		
		int dfact=1;
		
	     int j=0;
	  for(Entry<Character, Integer> map:m.entrySet())
	  {
		  
		  j=map.getValue();
		 while(j>0)
		 {
			
			 dfact = dfact*j;
			j--;
		 }
	  }
	  int fact=1;
	  int n=str.length();
	  while(n>0)
	  {
		  fact=fact*n;
		  n--;
	  }
	  int res=fact / dfact;
	  System.out.print(res);
	 
	 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aaacd";
		permutation(str);

	}

}
