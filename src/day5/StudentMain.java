package day5;

public class StudentMain {

	public static void main(String[] args) {
		/*
		Student stud1 = new Student();
		//Assigning variables thru reference
		stud1.sid =10;
		stud1.sname = "OSR";
		stud1.grade= 'A';
		
		stud1.display();
		
		System.out.println("=============================\nAssigning values by using methods");
		
		Student stud2 = new Student();
		stud2.getValues(111, "OSAGM", 'A');
		stud2.display();
		*/
		
		Student stud1 = new Student(1111,"AGM", 'A');
		stud1.display();
		
		
		
	}

}
