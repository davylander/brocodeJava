/*
 * Classe para aula 78. Multithreading - MyThread
 * 19/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a78_multithreading;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class MyThread extends Thread{

	@Override
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println("Thread #1 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println(1/0);
		}
		System.out.println("Thread #1 is finished :D");
	}
	
}
