package corejava;

public class AccessSpecifiers {
	int num;
	private int num1;
	protected void protected_method() {
		num1=10;
		System.out.println("inside protected_method access is protected. Value of num1 = " + num1);
		
	}
	
	private void private_method() {
		System.out.println("inside private_method access is private ");
	}
	
	void default_method() {
		System.out.println("inside default_method access is default ");
	}
	
	public static void main(String[] args) {
		AccessSpecifiers as = new AccessSpecifiers();
		as.private_method();
		as.default_method();
		as.protected_method();

	}

}
