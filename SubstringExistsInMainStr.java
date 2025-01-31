package exercisepgm_1;

public class SubstringExistsInMainStr {
	
	public static int check(String m,String s)
	{
		
		int l=0;
		int flg=0;
		for(int i=0;i<m.length();i++)
		{
			
			if(s.charAt(0)==m.charAt(i))
			{
				l=i;
				int n=m.length();
				int k=n-l;
				if((k) < s.length())
				{
					return -1;
				}
				for(int j=0;j<s.length();j++)
				{
					
					if(s.charAt(j)==m.charAt(l))
					{
						l++;
						
						flg=1;
					}
					else
					{
						flg=0;
						break;
					}
				}
				
			}
		
		}
		
		if(flg==0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String m="santhi";
        String s="nthis";
        int res=check(m,s);
        if(res==1)
        System.out.print("true");
        else
        	System.out.print("false");
	}

}
