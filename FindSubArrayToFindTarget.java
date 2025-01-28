package exercisepgm_1;

public class FindSubArrayToFindTarget {
	
	public static void find(int[] arr,int target)
	{
		int start=0;
		int end=0;
		int cur=0;
		for(int i=0;i<arr.length;i++)
		{
			cur += arr[i];
			if(cur>=target)
			{
				end=i;
				while(cur>target && start<end)
				{
					cur -= arr[start];
					start++;
				}
				if(cur==target)
				{
				  break;
				}
				
			}
		}
		
		while(start<end)
		{
			System.out.print(arr[start]);
			System.out.print(arr[end]);
			start++;
			end--;
		}
		System.out.print(arr[end]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,6,6,1,3};
		int target=14;
		find(arr,target);

	}

}
