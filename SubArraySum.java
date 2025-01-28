package exercisepgm_1;

//find the sum of subarray which is multiply by two
public class SubArraySum {

	public static int fivemultiply(int[] arr,int start,int end,int count)
	{
		
		if(end==arr.length)
		{
			return count;
		}
		else if(start>end)
		{
			return fivemultiply(arr,0,end+1,count);
		}

		
		else
		{
			int sum=0;
			for(int i=start;i<=end;i++)
			{
				
				sum += arr[i];
			}
				
				if(sum%5==0)
				{
					count++;
				}
			
			return fivemultiply(arr,start+1,end,count);
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,2,3};
		int start=0;
		int end=0;
		int count=0;
		int res=fivemultiply(arr,start,end,count);
		System.out.print(res);

	}

}
