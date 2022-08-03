/*
 * Create a class Employee.java with attributes 
 * empNo, empName, address, State, zipCode, phone, designation (manager, lead, analyst) , 
 * experienceinYears, emailAddress, basic, hra, bonus (% of basic). 
 * Choose appropriate data types and create a constructer, getters & setters for the attributes. 
 * Also create a method to return the total salary (basic + hra + (bonus/100)*basic)

 */
package classAssignments;

public class EmployeeDemo {
	int empNo;
	String empName;
	String address;
	String State, zipCode, phone ;
	String designation; //(manager, lead, analyst) , 
	float experienceinYears; 
	String emailAddress; 
	float basic;
	float hra;
	float bonus; //(% of basic).
	
	public EmployeeDemo(String name, String designation,float basic , float hra, float bonus)
	{
		this.empName=name;
		this.designation=designation;
		this.basic=basic;
		this.hra=hra;
		this.bonus=bonus;				
	}
	
	public float totalSalary() {
		return (basic + hra + (basic * bonus));
	}
	
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}



	public String getState() {
		return State;
	}



	public void setState(String state) {
		State = state;
	}



	public String getZipCode() {
		return zipCode;
	}



	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public float getExperienceinYears() {
		return experienceinYears;
	}



	public void setExperienceinYears(float experienceinYears) {
		this.experienceinYears = experienceinYears;
	}



	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}



	public float getBasic() {
		return basic;
	}



	public void setBasic(float basic) {
		this.basic = basic;
	}



	public float getHra() {
		return hra;
	}



	public void setHra(float hra) {
		this.hra = hra;
	}



	public float getBonus() {
		return bonus;
	}



	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	

	public static void main(String[] args) {
		EmployeeDemo emp =new EmployeeDemo("Simba" , "lead" , 100000,6000,(float) 0.10);
		//String name, String designation,float basic , float hra, float bonus)
		
		System.out.println("Name = " + emp.empName);
		System.out.println("Designation = " + emp.designation);
		System.out.println("Basic = " + emp.basic);
		System.out.println("HRA = " + emp.hra);
		System.out.println("Bonus = " + emp.bonus);
		
		System.out.println("Total Salary  = " + emp.totalSalary());
	}

}
