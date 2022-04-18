/*
 * Classe para aula 77. threads - MyThread
 * 18/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a77_threads;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class MyThread extends Thread {
	
	@Override
	public void run() {
		if(this.isDaemon()) {
			System.out.println("This is a daemon thread that is running");
		}else {
			System.out.println("This is a user thread that is running");
		}
		
	}
	
}
