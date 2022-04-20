/*
 * Classe para aula 78. Multithreading - MyRunnable
 * 19/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a78_multithreading;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Thread #2 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread #2 is finished :)");
	}
	
}
