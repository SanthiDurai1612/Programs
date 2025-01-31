package exercisepgm_1;

public class IsDigitOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="189032";
		int flg=0;
		for(int i=0;i<s.length();i++)
		{
			if((int)s.charAt(i) >= 48 && (int)s.charAt(i) <= 57)
			{
				System.out.print(s.charAt(i));
			}
			else
			{
				flg=1;
			}
		}
		System.out.println();
		if(flg==1)
		{
			System.out.println("It is Not Digit");
		}
		else
		{
			System.out.println("It is Digit");
		}

	}

}
