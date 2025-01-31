package exercisepgm_1;

public class LongestSubstrWithNonRepeatChar {
	
	public static void longest(String str)
	{
		StringBuilder str1=new StringBuilder();
		int count=0;
		int maxlen=0;
		int flg=0;
		int s=0;
		int e=0;
		for(int i=0;i<str.length();i++)
		{
			if(str1.indexOf(String.valueOf(str.charAt(i)))==-1)
			{
				str1.append(str.charAt(i));
				count++;
				flg=1;
			}
			else
			{
				if(maxlen<=count)
				{
					e=i-1;
				}
			   	maxlen=Math.max(maxlen, count);
			    str1.delete(0, i);
			    str1.append(str.charAt(i));
			    count=1;
			   	flg=0;
			}
		}
		
		if(flg==1)
		{
			maxlen=Math.max(maxlen, count);
			if(maxlen<=count)
			{
			e=str.length()-1;
			}
		}
		System.out.println("Maximum Length:"+" "+maxlen);
		int starting=e-maxlen+1;
		while(starting<=e)
		{
			System.out.print(str.charAt(starting));
			starting++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aaaaa";
		longest(str);
       
	}

}
