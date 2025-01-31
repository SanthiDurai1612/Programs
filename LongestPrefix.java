package exercisepgm_1;

import java.util.Arrays;

public class LongestPrefix {

	public static void longpre(String[] arr)
	{
		Arrays.sort(arr);
		int len=0;
		if(arr[0].length()>arr[arr.length-1].length())
		{
			len=arr[arr.length-1].length();
		}
		else
		{
			len=arr[0].length();
		}
		
		for(int i=0;i<len;i++)
		{
			if(arr[0].charAt(i)==arr[arr.length-1].charAt(i))
			{
				System.out.print(arr[0].charAt(i));
			}
			else
			{
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String[] arr= {"a","ab","a"};
     longpre(arr);
	}

}
