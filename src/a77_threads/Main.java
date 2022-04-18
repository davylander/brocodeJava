/*
 * Classe para aula 77. threads - Main
 * 18/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a77_threads;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * thread = A thread of execution in a program (kind of like a virtual CPU)
		 * 			The JVM allows an aplicantion to have multiple threads running concurrently
		 * 			Each thread can execute parts of you code in parallel with the main thread
		 * 			Each thread has a priority.
		 * 			Threads with higher priority are executed in preference compared to threads
		 * 
		 * 			The Java Virtual Machine (JVM) continues to execute threads until either of the following occurs
		 * 				1. The exit method of class Runtime has been called
		 * 				2. Al user threads have died
		 * 			
		 * 			When a JVM stars up, there is thread which calls the main method 
		 * 			This thread is called "main"
		 * 
		 * 			Daemon thread is a low priority thread that runs in background to perform tasks such garbage collection
		 * 			JVM terminates itself when all user threads (non-deamon threads) finish their execution
		 */
		
		 //returnThread();
		 
		 MyThread thread2 = new MyThread();
		 
		 thread2.setDaemon(true);
		 System.out.println(thread2.isDaemon());
		 thread2.start();
		 
		 //System.out.println(thread2.isAlive());
		 
		 //thread2.setName("Second Gear");
		 //System.out.println(thread2.getName());
		 
		 //thread2.setPriority(1);
		 //System.out.println(thread2.getPriority());
		 
		 //System.out.println(Thread.activeCount());

	}
	public static void returnThread() throws InterruptedException {
		//System.out.println(Thread.activeCount());
		
		//Thread.currentThread().setName("MAINOOO");
		
		//System.out.println(Thread.currentThread().getName());
		
		//Thread.currentThread().setPriority(1);
		//Thread.currentThread().setPriority(10);
		//System.out.println(Thread.currentThread().getPriority());
		
		//System.out.println(Thread.currentThread().isAlive());
		/*
		for (int i = 3; i>0 ; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("You're done!");
		*/
		
		
		
	}

}
