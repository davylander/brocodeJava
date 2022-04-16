/*
 * Classe da aula 76. TimerTask - Main
 * 16/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a76_timertask;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {
	public static void main(String[] args) {
		
		/*
		 * Timer = 			A facility for threads to schedule tasks for future execution in a background thread
		 * 
		 * TimerTask =		A task that can be scheduled for one-time or repeated execution by a Timer
		 */
		
		Timer timer = new Timer();
	
		TimerTask task = new TimerTask() {
			int counter = 10;
			@Override
			public void run() {
				if(counter > 0) {
					System.out.println(counter + " seconds");
					counter--;
				}
				else {
					System.out.println("Happy new year!");
					timer.cancel();
				}
			}
		};
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2022);
		date.set(Calendar.MONTH, Calendar.APRIL);
		date.set(Calendar.DAY_OF_MONTH, 16);
		date.set(Calendar.HOUR_OF_DAY, 20);
		date.set(Calendar.MINUTE, 25);
		date.set(Calendar.SECOND, 50);
		date.set(Calendar.MILLISECOND, 0);
	
		//timer.schedule(task, 3000);
		//timer.schedule(task,  date.getTime());
		//timer.scheduleAtFixedRate(task, 0, 1000);
		timer.scheduleAtFixedRate(task, date.getTime(), 1000);
		
	}
}
