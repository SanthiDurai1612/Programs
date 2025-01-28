package exercisepgm_1;

import java.util.Arrays;

//find the triplets which three's sum is equal to target
public class Triplets {
	
	public static void find(int[] arr,int target)
	{
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			if((arr[i]+arr[j]+arr[j-1]) > target)
			{
				j--;
			}
			else if((arr[i]+arr[j]+arr[j-1]) == target)
			{
				System.out.print(arr[i]+" "+arr[j]+" "+arr[j-1]);
				break;
			}
			else
			{
				i++;
			}
			
			
		}
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target=21;
		int[] arr= {1,9,12,0,2,4,6};
	    Arrays.sort(arr);
	    find(arr,target);

	}

}
