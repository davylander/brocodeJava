/*
 * Classe para aula 54. FlowLayout - Main
 * 01/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a54_flow_layout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode BootCamp Java
 */

public class Main {

	public static void main(String[] args) {
		/* Layout Manager = Defines the natural layout for components within a container
		 * 
		 * FlowLayout = places components in a row, sized at their preferred size.
		 * 				If the horizontal space in the container is too small,
		 * 				the FlowLayout class uses the next available row.
		 */
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(100,250));
		panel.setBackground(Color.gray);
		panel.setLayout(new FlowLayout());
		
		panel.add(new JButton("1"));
		panel.add(new JButton("2"));
		panel.add(new JButton("3"));
		panel.add(new JButton("4"));
		panel.add(new JButton("5"));
		panel.add(new JButton("6"));
		panel.add(new JButton("7"));
		panel.add(new JButton("8"));
		panel.add(new JButton("9"));
		
		frame.add(panel);
		
		frame.setVisible(true);
		
	}

}
