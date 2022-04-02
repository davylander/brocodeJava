/*
 * Classe para aula 55. GridLayout - Main
 * 01/04/2022
 * Direitos reservados para Davi Souto & BroCode
 */

package a55_gridlayout;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {

	public static void main(String[] args) {
		/*
		 * Layout Manager = Defines the natural layout of components within a container
		 * 
		 * GridLayout = places components in a grid of cells.
		 * 				Each component takes all the available space within its cell,
		 * 				and each cell is the same size.
		 */

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLayout(new GridLayout(3,3,10,10));
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		//frame.add(new JButton("10"));
		
		
		frame.setVisible(true);
	}

}
