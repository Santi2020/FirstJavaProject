package day4;

public class StringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"Santoshi", "Raghu", "Tisha" , "Anika"};
		String searchFor = "Anika1";
		boolean flag = false;
		for(String val : arr)
		{
			if (val==searchFor)
			{
				System.out.println("Search string found");
				flag = true;
				break;
			}
		}
		
		if (flag == false)
		{
			System.out.println("Search string NOT found");
		}
	}

}
