package day4;

public class sumOfTwoMatrices {
	public static void main(String[] args) {
		int first[][]= {{10,10},{12,16}, {23,78}};
		int second[][]= {{12,14},{132,136}, {233,378}};
		
		int m = first.length;
		int n = first[0].length;
		
		int sum[][] = new int[m][n];
		boolean flag=true;
		int i,j;
		//int i = first.length;
		if ((first.length != second.length) || (first[0].length != second[0].length))
		{
			System.out.println("Cannot add Array length are not same");
			flag =false;
			//exit;
		}
		
		if (flag)
		{
			System.out.println("Proceed");
			for ( i =0;i<first.length; i++)
			{
				for( j=0; j<first[i].length;j++)
				{
					sum[i][j]=first[i][j]+second[i][j];
				}
			}
			
			System.out.println("===Dispalying sum===");
			for (i=0;i<sum.length;i++)
			{
				for(j=0; j<sum[0].length; j++ )
				{
					System.out.println("Sum = " +sum[i][j]);
				}
			}
		}
	}

}
