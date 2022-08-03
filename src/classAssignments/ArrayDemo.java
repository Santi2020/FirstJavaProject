package classAssignments;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] arrayInt = new int[10];
		
		System.out.println("Size of array = " +arrayInt.length);
		for (int i=0;i<arrayInt.length;i++)
		{
			arrayInt[i]=(i+100);
		}
		
		System.out.println("Values of an array");
		for (int i=0;i<arrayInt.length;i++)
		{
			System.out.println(arrayInt[i]);
		}
	}

}
