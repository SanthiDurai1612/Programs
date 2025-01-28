package exercisepgm_1;

import java.util.Arrays;

//print first,last in array 

public class AlternateSwap {
	
	public static void alternate(int[] arr)
	{
		int i=0;
		int j=arr.length-1;
		int[] res=new int[arr.length];
		int k=0;
		while(i<j)
		{
			res[k++]=arr[i];
			res[k++]=arr[j];
			i++;
			j--;
		}
		
		if(arr.length%2 != 0)
		{
		res[k++]=arr[i];
		}		
		System.out.print(Arrays.toString(res));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		alternate(arr);

	}

}
