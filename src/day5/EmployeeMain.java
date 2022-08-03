package day5;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee();
		emp1.eid =1;
		emp1.ename="Santoshi";
		emp1.job ="Developer";
		emp1.deptno = 10;
		emp1.sal= 123456;
		
		emp1.display();
		
		System.out.println("\n\n====================================================");
		Employee emp2 = new Employee();
		emp2.eid =123;
		emp2.ename="Raghu B";
		emp2.job ="Data Engineer";
		emp2.deptno = 100;
		emp2.sal= 2500006;
		
		emp2.display();
	}
}
