package exercisepgm_1;

import java.util.Arrays;

//if any of the orange is 2 it is rotten orange so it changed the upper,lower,next,previous fresh oranges (1) as rotten oranges

public class RottenOranges {
	public static void rotten(int[][] arr)
	{
		int num=0;
		boolean change=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]==2 )
				{
					if(j>0 && arr[i][j-1]==1)
					{
						arr[i][j-1]=2;
						change=true;
						
					}
					if(j<arr[0].length-1 && arr[i][j+1]==1)
					{
						arr[i][j+1]=2;
						change=true;
					}
					if(i>0 && arr[i-1][j]==1)
					{
						arr[i-1][j]=2;
						change=true;
					}
					if(i<arr.length-1 && arr[i+1][j]==1)
					{
						arr[i+1][j]=2;
						change=true;
					}
				}
			}
			if(change==true)
			num++;
			change=false;
		}
		int fl=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]==1)
				{
					System.out.print("-1");
					fl=-1;
					break;
				}
				else
				{
					fl=1;
				}
			}
			if(fl==-1)
			{
				break;
			}
		
		}
		
		if(fl==1)
		{
			System.out.print(num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= { {2,1,0,2,1},{1,0,1,2,1},{1,0,0,2,1} };
		rotten(arr);

	}

}
