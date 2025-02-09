package exercisepgm_1;

public class RomanToInt {

	public static int convert(char s)
	{
		if(s=='I')
		{
			return 1;
		}
		else if(s=='V')
		{
			return 5;
		}
		else if(s=='X')
		{
			return 10;
		}
		else if(s=='L')
		{
			return 50;
		}
		else if(s=='C')
		{
			return 100;
		}
		else if(s=='D')
		{
			return 500;
		}
		else if(s=='M')
		{
			return 1000;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="MCMXCIV";
		int res=0;
		for(int i=0;i<str.length()-1;i++)
		{
			int a=convert(str.charAt(i));
			int b=convert(str.charAt(i+1));
			
			
			if(a>=b)
			{
				res += a;
			}
			else 
			{
				res += (b-a);
				i++;
			}
			
		}
		
		System.out.print(res);

	}

}
