package exercisepgm_1;

public class StrReverseByDot {
	
	public static void strreverse(String str)
	{
		int k=str.length();
		StringBuilder res=new StringBuilder();
		for(int i=str.length()-1;i>=0;i--)
		{
			if(str.charAt(i)=='.')
			{
				int j=i;
				res.append(str.substring(j+1, k));
				k=j;
				res.append('.');
				
			}
			
		}
		
		res.append(str.substring(0,k));
		System.out.print(res.toString());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i.love.selvam";
		strreverse(str);

	}

}
