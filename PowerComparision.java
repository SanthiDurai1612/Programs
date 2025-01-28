package exercisepgm_1;

public class PowerComparision {
	
	public static void powercomparision(int[] arr,int[] arr1)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				if(Math.pow(arr[i], arr1[j]) > Math.pow(arr1[j], arr[i]))
				{
					count++;
				}
			}			
		}
		System.out.print(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int[] arr= {1,2,3,4};
           int[] arr1= {3,4,5,6};
           powercomparision(arr,arr1);
	}

}
