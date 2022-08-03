package day4;

public class MultiDinArray {

	public static void main(String[] args) {
		int mdimArray[][] = new int [3][2];
		mdimArray[0][0]=100;
		mdimArray[0][1]=200;
		
		mdimArray[1][0]=300;
		mdimArray[1][1]=400;
		
		mdimArray[2][0]=500;
		mdimArray[2][1]=600;
		
	
		int mdimensional[][]= {{100,200}, {300,400}, {500,600} };
		
		System.out.println("No of rows = " +mdimensional.length );
		System.out.println("No of columns = "+ mdimensional[0].length );
	
		
		for (int i =0;i<mdimensional.length;i++)
		{
			for (int j=0;j<mdimensional[i].length; j++)
			{
				System.out.print(" " +mdimensional[i][j]);
			}
			System.out.println(" ");
				
		}
		
		
		//Enhanced for loop
		System.out.println("---Enhanced for loop--- ");
		for(int i[] :mdimensional )
		{
			//System.out.println(" "+i);
			for(int j : i)
			{
				System.out.print(" " + j);
			}
			System.out.println(" ");
		}
	
	//-----end
	}

}
