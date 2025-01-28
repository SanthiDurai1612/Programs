package exercisepgm_1;

//find the element which has increasing order in left side and decreasing order in right side

public class LeftIncreseRightDecrease {
	
	public static void findele(int[] arr)
	{
	
		for(int i=0;i<arr.length;i++)
		{
			int cur=i;
			int start=0;
			int end=arr.length-1;
			int sflg=0;
			int eflg=0;
			
		
			while(start<cur)
			{
				if(arr[start]<arr[start+1])
				{
					start++;
					sflg=1;
				}
				else
				{
					sflg=0;
					break;
				}
			}
			
			while(end>cur)
			{
				if(arr[end]<arr[end-1])
				{
					end--;
					eflg=1;
				}
				else
				{
					eflg=0;
					break;
				}
			}
			
			if(sflg==1 && eflg==1)
			{
				System.out.print(arr[cur]);
				break;
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,2,1};
		findele(arr);

	}
	

}
