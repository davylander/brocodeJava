/*
 * Classe da aula 57. Open a new GUI window - Main
 * 04/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a57_open_a_new_gui_window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class LaunchPage implements ActionListener{

	JFrame frame = new JFrame();
	JButton myButton = new JButton("New Window");
	
	LaunchPage(){
		
		myButton.setBounds(100,160,200,40);
		myButton.setFocusable(false);
		myButton.addActionListener(this);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.add(myButton);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==myButton) {          //se o botão for apertado, cria uma nova instância de NewWindow
			frame.dispose(); // fecha a janela do botão
			NewWindow myWindow = new NewWindow();
		}
		
	}
	
}
