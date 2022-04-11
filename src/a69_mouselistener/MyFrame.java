/*
 * Classe para aula 69. MouseListener - MyFrame
 * 11/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a69_mouselistener;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class MyFrame extends JFrame implements MouseListener{
	
	JLabel label = new JLabel();
	ImageIcon happy;
	ImageIcon vain;
	ImageIcon crying;
	ImageIcon nervous;
	
	
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		/*
		label = new JLabel();
		label.setBounds(0,0,100,100);
		label.setBackground(Color.red);
		label.setOpaque(true);
		//label.addMouseListener(this);
		this.addMouseListener(this);
		*/
		
		label = new JLabel();
		label.addMouseListener(this);
		
		happy = new ImageIcon("happy32.png");
		vain = new ImageIcon("vai32.png");
		crying = new ImageIcon("crying32.png");
		nervous = new ImageIcon("emoji32.png");
		
		label.setIcon(happy);
		
		this.add(label);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// Invoked when the mouse button has been clicked (pressed and realeased) on a component
		// System.out.println("You clicked the mouse");
		//label.setBackground(Color.orange);
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// Invoked when a mouse button has been pressed on a component
		//System.out.println("You pressed the mouse");
		//label.setBackground(Color.yellow);
		label.setIcon(crying);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// Inovked when a mouse button has been realeased on a component
		//System.out.println("You released the mouse");
		//label.setBackground(Color.green);
		label.setIcon(vain);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// Invoked when the mouse enters a component
		//System.out.println("You entered the component with a mouse");
		//label.setBackground(Color.blue);
		label.setIcon(nervous);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// Invoked when the mouse exits a component
		//System.out.println("You exited the component with a mouse");
		//label.setBackground(Color.red);
		label.setIcon(happy);
	}

}
