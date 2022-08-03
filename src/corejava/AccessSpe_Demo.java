package corejava;

public class AccessSpe_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifiers as = new AccessSpecifiers();
		System.out.println("value of as = "+as);
		//as.private_method();
		as.default_method();
		as.protected_method();
		System.out.println("value of num =" + as.num);
	}

}
