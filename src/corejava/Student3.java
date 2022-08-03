package corejava;

class Student3{  
	int id;  
	String name;  
	static String college="Altamont";
	
	//method to display the value of id and name  
	void display(){
		System.out.println(id+" "+name +"   " +  college);
	}  
	
	Student3(){
		System.out.println("Inside default constructor");
	}
	
	Student3(int i, String val){
		System.out.println("Inside 2 parameter constructor val=" + val);
		id=i;
		name= val;
	}
	
	static void staticMethod(String val) {
		college=val;
	}
	Student3(Student3 obj){
		System.out.println("Passing obj to constructor " );
		id=obj.id;
		name= obj.name;
	}
	public void Student3( String val , int i){
		System.out.println("Inside 2 parameter constructor val=" + val);
	}
	
	public static void main(String args[]){  
		Student3 s1=new Student3();  
		Student3 s2=new Student3();  
		//displaying values of the object  
		s1.display();  
		s2.display();
		System.out.println(s1.name);
		
		System.out.println("==============================");
		Student3 s3=new Student3(10,"New Student");
		Student3 s4=new Student3();
		s4.Student3("test", 50);
		
		Student3 s5=new Student3(s3);
		s3.display();
		staticMethod("New College");
		
		s1.display();  
		s2.display();
		
		
		
		System.out.println("==============================");
		}  
}  