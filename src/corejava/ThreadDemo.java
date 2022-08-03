package corejava;


public class ThreadDemo extends Thread {
	  public static int amount = 0;

	  public static void main(String[] args) {
		ThreadDemo thread = new ThreadDemo();
	    thread.start();
	    // Wait for the thread to finish
	   
	    while(thread.isAlive()) {
	    System.out.println("Waiting...");
	  }
	  
	  // Update amount and print its value
	  
	  System.out.println("Main: " + amount);
	  amount++;
	  System.out.println("Main: " + amount);
	  }
	  public void run() {
		  System.out.println("incrementing the amount in run() " + amount);
		  amount++;
		  System.out.println("ending the run() run() " + amount);
	  }
	}