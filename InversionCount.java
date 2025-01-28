package exercisepgm_1;


public class InversionCount {
	
	public static void inversioncount(int[] arr)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					System.out.print("("+arr[i]+","+arr[j]+")"+",");
					count++;
				}
			}
		}
		System.out.println("Inversion Count:"+" "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8,4,2,1};
		inversioncount(arr);

	}

}
