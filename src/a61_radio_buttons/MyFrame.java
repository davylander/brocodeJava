/*
 * Classe para a aula 61. Radion Buttons - Main
 * 05/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a61_radio_buttons;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode BootCamp Java
 */

public class MyFrame extends JFrame implements ActionListener {

	JRadioButton pizzaButton;
	JRadioButton hamburgerButton;
	JRadioButton hotdogButton;
	ButtonGroup group;
	
	ImageIcon pizzaIcon;
	ImageIcon hamburgerIcon;
	ImageIcon hotdogIcon;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		pizzaIcon = new ImageIcon("pizza24.PNG");
		hamburgerIcon = new ImageIcon("hamburger24.PNG");
		hotdogIcon = new ImageIcon("hotdog24.PNG");
		
		pizzaButton = new JRadioButton("Pizza");
		hamburgerButton = new JRadioButton("Hamburger");
		hotdogButton = new JRadioButton("Hot-Dog");
		
		group = new ButtonGroup();
		group.add(pizzaButton);
		group.add(hamburgerButton);
		group.add(hotdogButton);
		
		pizzaButton.addActionListener(this);
		hamburgerButton.addActionListener(this);
		hotdogButton.addActionListener(this);
		
		pizzaButton.setIcon(pizzaIcon);
		hamburgerButton.setIcon(hamburgerIcon);
		hotdogButton.setIcon(hotdogIcon);
		
		this.add(pizzaButton);
		this.add(hamburgerButton);
		this.add(hotdogButton);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == pizzaButton) {
			System.out.println("You order a pizza!");
		}
		else if(e.getSource() == hamburgerButton) {
			System.out.println("You order a hamburger!");
		}
		else if(e.getSource() == hotdogButton) {
			System.out.println("You order a hot-dog!");
		}
	}

}
