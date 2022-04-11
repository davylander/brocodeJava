/*
 * Classe da aula 68. KeyListener - MyFrame
 * 09/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a68_keylistener;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class MyFrame  extends JFrame implements KeyListener{

	JLabel label;
	ImageIcon icon;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null); 
		this.addKeyListener(this);
		
		icon = new ImageIcon("rocket.png");
		
		label = new JLabel();
		label.setBounds(0, 0, 100, 100);
		label.setIcon(icon);
		//label.setBackground(Color.orange);
		//label.setOpaque(true);
		
		this.getContentPane().setBackground(Color.black);
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// keyTyped = Invoked when a key is typed. Uses KeyChar, char output
		switch(e.getKeyChar()) {
			case 'a':
				label.setLocation(label.getX()-10, label.getY());
				break;
			case 'd':
				label.setLocation(label.getX()+10, label.getY());
				break;
			case 's':
				label.setLocation(label.getX(), label.getY()+10);
				break;
			case 'w':
				label.setLocation(label.getX(), label.getY()-10);
				break;
			default:
				break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
		switch(e.getKeyCode()) {
		case 37:
			label.setLocation(label.getX()-10, label.getY());
			break;
		case 39:
			label.setLocation(label.getX()+10, label.getY());
			break;
		case 40:
			label.setLocation(label.getX(), label.getY()+10);
			break;
		case 38:
			label.setLocation(label.getX(), label.getY()-10);
			break;
		default:
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// keyReleased = called whenever a button is released
		System.out.println("You released key char: " + e.getKeyChar());
		System.out.println("You released key char: " + e.getKeyCode());
	}
	
}
