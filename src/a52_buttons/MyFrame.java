/*
 * Classe da aula 52. Buttons - Main
 * 31/03/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a52_buttons;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class MyFrame extends JFrame implements ActionListener {

	JButton button;
	JLabel label;
	
	MyFrame() {
		ImageIcon icon = new ImageIcon("E:\\Java\\Livro Caixa icons\\check32.PNG");
		ImageIcon icon2 = new ImageIcon("E:\\\\Java\\\\Livro Caixa icons\\\\benefits16.PNG");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150, 250, 150, 150);
		label.setVisible(false);
		label.setBackground(Color.black);
		label.setOpaque(true);
		
		button = new JButton();
		button.setBounds(200, 100, 200, 100);
		button.addActionListener(this);
		button.setText("I'm a button");
		button.setFocusable(false);
		button.setIcon(icon);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD,25));
		button.setIconTextGap(-15);
		button.setForeground(new Color(240,150,100));
		button.setBackground(new Color(150, 50, 200));
		button.setBorder(BorderFactory.createCompoundBorder());
		//button.setEnabled(false);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		
		this.add(button);
		this.add(label);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button) {
			//System.out.println("Poo");
			//button.setEnabled(false);
			label.setVisible(true);
		}
		
	}
	
}
