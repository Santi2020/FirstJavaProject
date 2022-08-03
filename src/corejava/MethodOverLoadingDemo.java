package corejava;

public class MethodOverLoadingDemo {
	float num1 , num2;
	
	public double add(double a, double b) {
		return (a+b);
	}
	
	public String add(String a, int b) {
		return (a+b);
	}
	
	public String display() {
		return ("Hello from display");
	}
	
	public String display1(String s) {
		return ("May i know your name");
	}
	
	public static void main(String[] args) {
		double ans;
		String str ;
		int a =10;
		int b= 12;
		Integer num;
	
		MethodOverLoadingDemo ml = new MethodOverLoadingDemo();
		ans = ml.add(a, b);
		str = ml.add("3", 10);
		System.out.println("adding two int numbers = " + ans);
		System.out.println("=======================");
		ml.display();
		
		System.out.println();
	}
	
	public static void main1(String[] args){
		System.out.println("main with String[]");
	}  
	
	public static void main(String args){
		System.out.println("main with String");
	}
	
	public static void main(){
		System.out.println("main without args");
	}  

}
