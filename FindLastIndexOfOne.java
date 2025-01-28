package exercisepgm_1;

public class FindLastIndexOfOne {

	public static void findlast(String s)
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			if((int)(s.charAt(i)) == 49 )
			{
				System.out.print("The Last Index Of:" +s.charAt(i)+" "+ "Is: "+i);
				break;
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="00010";
		findlast(s);

	}

}
