/*
 * Classe da aula 57. Open a new GUI window - Main
 * 04/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a57_open_a_new_gui_window;

import java.awt.Font;

import javax.swing.*;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class NewWindow {

	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello!");
	
	NewWindow() {
		
		label.setBounds(0,0,100,50);
		label.setFont(new Font(null,Font.PLAIN,25));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.add(label);
		frame.setVisible(true);
		
	}
	
}
