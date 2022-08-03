package apex.assignments;

import java.util.ArrayDeque;
import java.util.Deque;

//2.	Balanced Brackets
public class BalancedBrackets {
	
	static boolean isBalancedBrackets(String expr) {
		Deque<Character> stack = new ArrayDeque();
		System.out.println("Given expression =" + expr);
		boolean status = true;
		//Traversing through the expression
		for (int i=0; i<expr.length();i++) {
			char x = expr.charAt(i);
			//System.out.println("value of i= " + i);
			if (status==false) {
				System.out.println("Status is false " );
				return false;
			}
			if (x=='(' || x=='{' || x=='[') {
				stack.push(x);
				continue;
			}
			
			if(stack.isEmpty())
				return false;
			
			char check;
			switch(x) {
			case ')':
				check = stack.pop();
				if (check == '}' || check ==']') {
					status =false;
					return false;
				}			
				break;
			
			case ']':
				check =stack.pop();
				if (check==')' || check =='}') {
					status =false;
					return false;
				}
				break;
			case '}':
				check = stack.pop();
				if (check==')' || check ==']') {
					status =false;
					return false;
				}	
				break;
			}
		}
		
		return (stack.isEmpty());
	}
	
	public static void main(String[] args) {
		String expr ="([{a+b)}])[]";
		if (isBalancedBrackets(expr))
			System.out.println("Its a balanced brackets");
		else
			System.out.println("Not a balanced bracket");
	}
}


