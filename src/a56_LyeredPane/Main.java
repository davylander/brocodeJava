/*
 * Classe da aula 56. LayeredPane - Main
 * 02/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a56_LyeredPane;

import java.awt.*;

import javax.swing.*;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {

	public static void main(String[] args) {
		/* 
		 * JLayeredPane = Swing container that provides a third dimension of positioning components
		 * 				  ex. depth, Z-index
		 */
		
		JLabel label1 = new JLabel();
		label1.setBackground(new Color(100,10,200));
		label1.setOpaque(true);
		label1.setBounds(50, 50, 200, 200);
		
		JLabel label2 = new JLabel();
		label2.setBackground(new Color(130,25,150));
		label2.setOpaque(true);
		label2.setBounds(100, 100, 200, 200);
		
		JLabel label3 = new JLabel();
		label3.setBackground(new Color(130,25,200));
		label3.setOpaque(true);
		label3.setBounds(150, 150, 200, 200);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0,0,500,500);
		
		layeredPane.add(label1, Integer.valueOf(0) /*JLayeredPane.DEFAULT_LAYER*/);
		layeredPane.add(label2, Integer.valueOf(0)/*JLayeredPane.DEFAULT_LAYER*/);
		layeredPane.add(label3, Integer.valueOf(4)/*JLayeredPane.DRAG_LAYER*/);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(500,500));
		frame.setLayout(null);
		
		frame.add(layeredPane);
		
		frame.setVisible(true);
	}

}
