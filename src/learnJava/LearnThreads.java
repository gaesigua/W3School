package learnJava;

                   //What are threads in java?
                   //Threads allow java programs to run more efficiently by doing multiple things at the same time

                   //How do we create threads

                   //We create threads by extending thread to the main class, create an instance of the main class and then override its run() class

//public class LearnThreads extends Thread {
//			
//	LearnThreads myThread = new LearnThreads();
//		
//	public void run() {
//		System.out.println("This code is inside the thread");
//	}
		
	//If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method:
	

public class LearnThreads extends Thread {
	
	public static void main(String[] args) {
	
		    LearnThreads myThread2 = new LearnThreads();
		    
		    myThread2.start();
	
		    System.out.println("This code is outside of the thread");}
	
		  public void run() {
		    System.out.println("This code is running in a thread");
		  }
		}




	
