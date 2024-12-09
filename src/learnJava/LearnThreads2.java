package learnJava;

  //In our previous session (LearnThread) we use extended the thread, created the instance of main class and we overrode its run()
  //Now Let's use Threads but by implementing the runnable instead of extending the Thread class

public class LearnThreads2 implements Runnable {
	
	public void run() {
		System.out.println("this code is also inside the thread like what we did in our previous session using the extends Thread");
	}
	

}
