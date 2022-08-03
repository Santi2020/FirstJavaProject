package corejava;



public class TestSuperThisDemo{  
	TestSuperThisDemo()  
     {  
         //super();   
         this(5);  
         System.out.println("Test class object is created");  
     }
	
	TestSuperThisDemo(int i)  
    {  
        //super();
        //this(5);  
        System.out.println("Constructor with one parameter");  
    }
	
	public void testMethod(int i)  
    {  
        System.out.println("TestMethod is invoked. Val of i =" + i);  
    }
     public static void main(String []args){  
    	 TestSuperThisDemo t ;//= new TestSuperThisDemo();  
    	 t = new TestSuperThisDemo();
    	 t.testMethod(5);
     }  
     
     
     
}  
