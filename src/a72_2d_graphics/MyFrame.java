/*
 * Classe para aula 72. 2D Graphics - MyFrame
 * 12/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a72_2d_graphics;

import java.awt.*;

import javax.swing.*;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class MyFrame extends JFrame{

	MyPanel panel;
	
	MyFrame(){
		
		panel = new MyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(panel);
		
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}
