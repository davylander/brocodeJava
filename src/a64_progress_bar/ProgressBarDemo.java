/*
 * Classe da aula 63. Slider - Main
 * 09/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a64_progress_bar;

import java.awt.*;

import javax.swing.*;

/*
 * @version 1;0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class ProgressBarDemo {

	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,500);
	
	ProgressBarDemo(){
		
		bar.setValue(0);
		bar.setBounds(0,0,420,50);
		bar.setStringPainted(true);
		bar.setFont(new Font("MV Boli",Font.BOLD,25));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.setSize(420,420);
		frame.setLayout(null);
		
		frame.add(bar);
		
		frame.setVisible(true);
		
		fill();
	}
	
	public void fill() {
		//bar.setValue(10);
		int counter = 0;
		
		 while(counter <= 100) {
			 
			 bar.setValue(counter);
			 try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			counter += 1;
		 }
		 bar.setString("Done! :D");
	}
	
}
