package day5;

public class StudentAssign {
	int sid ;
	String sname;
	int sub1;
	int sub2;
	int sub3;
	
	
	void getStuData(int id, String stName) {
		sid = id;
		sname = stName;
	}
	
	void getStuMarks(int subj1 , int subj2, int subj3)
	{
		sub1 =subj1;
		sub2 =subj2;
		sub3 =subj3;
	}
	
	void totalMarks() {
		System.out.println("ID : " + sid);
		System.out.println("Name : " + sname);
		System.out.println("Total Marks : " + (sub1 + sub2 + sub3));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentAssign student = new StudentAssign();
		student.getStuData(11, "Aaroodha");
		student.getStuMarks(99, 87, 56);
		student.totalMarks();
	}

}
