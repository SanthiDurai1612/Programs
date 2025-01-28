package exercisepgm_1;

import java.util.Arrays;
import java.util.Comparator;

//form the largest number from a give array

public class FormLargestNum {

	public static void formnum(int[] arr)
	{
		String[] arr1=new String[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr1[i] = String.valueOf(arr[i]);
		}
		
		//override because we have to find out 330 > 303 then we can print 3 before 30 
		
		Arrays.sort(arr1, new Comparator<String>() {
		    @Override
		    public int compare(String a, String b) {
		        // Compare based on concatenated results
		        String order1 = a + b;
		        String order2 = b + a;
		        return order2.compareTo(order1); 
		    }
		});

		
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr1[j]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,30,34,5,9};
		formnum(arr);

	}

}
