package day7;

class Teacher
{
	String designation ="Teacher";
	String collegeName ="BeginnersBook";
	
	void does()
	{
		System.out.println("designation = " + designation);
		System.out.println("collegeName" + collegeName);
		System.out.println("Does Teaching");
	}
}

class ComputerTeacher extends Teacher
{
	String subject ="Graphics";
}

public class TeacherDemo {

	public static void main(String[] args) {
		ComputerTeacher ct = new ComputerTeacher();
		ct.does();

	}

}
