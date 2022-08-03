package one;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=10;
		int num2 =102;
		int res;
		
		//System.out.println();
		System.out.println("Arithematic operators");
		res= num1+num2;
		System.out.println("Demostrating  +");
		System.out.println("num1 + num2 = " + res);
		
		System.out.println("Sum of " +num1 +" and "+num2 + " is " + (num1+num2));
		
		res= num2-num1;
		System.out.println("Demostrating  - " +res );
		
		res= num1*num2;
		System.out.println("Demostrating  * " + res);
		
		res= num1/num2;
		System.out.println("Demostrating  / " + res);
		
		res= num1%num2;
		System.out.println("Demostrating  % " +res);
		
		
		//Relational operator
		
		System.out.println("======================================\nRelational Operator \n=============================");
		System.out.println("Is "+num1 +" == " +num2 + " "+ (num1==num2));
		
		System.out.println("Is "+num1 +" > " +num2 + " "+ (num1>num2));
		System.out.println("Is "+num1 +" < " +num2 + " "+ (num1<num2));
		
		System.out.println("Is "+num1 +" >= " +num2 + " "+ (num1>=num2));
		System.out.println("Is "+num1 +" <= " +num2 + " "+ (num1<=num2));
		
		System.out.println("Is "+num1 +" != " +num2 + " "+ (num1!=num2));
		
		
		System.out.println("======================================\nBoolean Operator \n=============================");
		boolean x = true;
		boolean y = false;
		System.out.println(x&&y);
		System.out.println(x||y);
		System.out.println(!x);
		
		System.out.println("======================================\nincremental Operator \n=============================");
		num1++;
		System.out.println(num1++);
		System.out.println(num1);
		
		num1--;
		System.out.println(num1--);
		System.out.println(num1);
		
		System.out.println("======================================\nSwap two numbers \n=============================");
		System.out.println("num1 = " +num1);
		System.out.println("num2 = " +num2);
		
		int temp ;
		temp= num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping");
		System.out.println("num1 = " +num1);
		System.out.println("num2 = " +num2);
		
		String user_name="Santoshi";
		System.out.println("Hello " +user_name)	;	
	}

}
