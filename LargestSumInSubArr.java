package exercisepgm_1;

public class LargestSumInSubArr {
	
	public static void largesum(int[] arr)
	{
		int  curmax=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			curmax=Math.max(arr[i]+curmax, arr[i]);
			
		}
		System.out.print(curmax);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,-8,7,-1,2,3};
		largesum(arr);

	}

}
