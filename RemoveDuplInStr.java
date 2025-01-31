package exercisepgm_1;

public class RemoveDuplInStr {

	//one way to remove duplicate 
	public static void remove(String s) {
		
		System.out.print(s.charAt(0));
          for(int i=1;i<s.length();i++)
          {
        	  int j=i-1;
        	  int flg=0;
        	  while(j>=0)
        	  {
        		  if(s.charAt(i)==s.charAt(j))
        		  {
        			  flg=1;
        		  }
        		  j--;
        	  }
        	  
        	  if(flg==0)
        	  {
        		  System.out.print(s.charAt(i));
        	  }
          }
	}
	
	//another way to remove duplicate
	public static void remove1(String s)
	{
		StringBuilder res=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(res.indexOf(String.valueOf(s.charAt(i)))==-1)
			{
				res.append(s.charAt(i));
			}
		}
		System.out.println();
		
		System.out.print(res.toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="santhiselvam";
		remove(s);
		remove1(s);

	}

}
