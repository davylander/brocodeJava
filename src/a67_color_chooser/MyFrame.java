/*
 * Classe da aula 67. Color Chooser - MyFrame
 * 09/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a67_color_chooser;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcam Java
 */

public class MyFrame extends JFrame implements ActionListener {

	JButton button;
	JLabel label;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.LIGHT_GRAY);
		label.setText("This is some text");
		label.setFont(new Font("MV Boli", Font.PLAIN, 100));
		label.setForeground(Color.white);
		label.setOpaque(true);
		
		this.add(button);
		this.add(label);
		
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			JColorChooser colorChooser = new JColorChooser();
			
			Color color = JColorChooser.showDialog(null, "Pick a color", Color.black);
			
			label.setForeground(color);
		}
	}

}
