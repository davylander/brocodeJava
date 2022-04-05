/*
 * Classe para a aula 59. textfield - Main
 * 04/04/2022 : 21h - 05/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a59_textfield;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class MyFrame extends JFrame implements ActionListener {

	JButton button;
	JTextField textField;
	
	MyFrame() {
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font("Consolas", Font.PLAIN,35));
		textField.setForeground(new Color(0x00ff00));
		textField.setBackground(Color.black);
		textField.setCaretColor(new Color(0x00ff00));
		textField.setText("username");
		
		
		button = new JButton("Send");
		button.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		this.add(textField);
		this.add(button);
		
		this.pack(); // size of the frame will ajust to fit the components that I add
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println("Welcome " + textField.getText());
			button.setEnabled(false);
			textField.setEditable(false);
		}
		
	}
	
}
