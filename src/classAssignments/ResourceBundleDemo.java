package classAssignments;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {

	public static void main(String[] args) {
		ResourceBundle bundle = ResourceBundle.getBundle("Company", Locale.US);
		System.out.println("bundle="+ bundle.getString("Company"));  
	}

}
