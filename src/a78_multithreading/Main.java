/*
 * Classe para aula 78. Multithreading - Main
 * 19/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a78_multithreading;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {

	public static void main(String[] args) {
		/*
		 *  multithreading = Process of executing multiple threads simultaneously
		 *  				 Helps maximum utilization of CPU
		 *  				 Threads are independent, they don't affect the execution of other threads.
		 *  				 An exception in one thread will not interrupt other threads
		 *  				 useful for saving multiple clients, multiplayer games, or other mutually independent tasks
		 */

		MyThread thread1 = new MyThread();
		
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
			
		thread1.start();
		thread2.start();
		
	}

}
