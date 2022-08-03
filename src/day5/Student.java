package day5;

public class Student {
	int sid ;
	String sname;
	char grade;
	
	Student(int id, String name, char grades)
	{
		sid=id;
		sname=name;
		grade= grades;
	}
	
	void getValues(int id, String name, char grades)
	{
		sid=id;
		sname=name;
		grade= grades;
	}
	
	
	void display()
	{
		System.out.println(sid);
		System.out.println(sname);
		System.out.println(grade);
		
	}
	
}
