package exercisepgm_1;

public class SubstringExistsMainStr {
	
	public static boolean substr(String str1,String str2)
	{
		int flg=0;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)==str2.charAt(0) )
			{
				
				int j=i;
				int k=0;
				
				int l=str1.length()-j;
			
				if(str2.length() > l)
				{
					
					flg=0;
					break;
				}
				
				while(k<str2.length())
				{
					if(str1.charAt(j)==str2.charAt(k))
					{

						flg=1;
					}
					else
					{
						flg=0;
						break;
					}
					j++;
					k++;
				}
			
			}
			
			
		}
	
		if(flg==0)
		{
			return false;
		}
		else
		{
		return true;
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="priyanka";
		String str2="priya";
		boolean res=substr(str1,str2);
		System.out.print(res);

	}

}
