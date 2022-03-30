/*
 * Classe para a aula 51. Panels - Main
 * 30/03/2022
 * Direitos reservados para Davi Souto & BroCode
 */

package a51_panels;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {

	public static void main(String[] args) {
		// JPanel = a GUI component that functions as a container to hold other components
		
		ImageIcon icon = new ImageIcon("E:\\Java\\Livro Caixa icons\\check32.PNG");
		
		JLabel label = new JLabel();
		label.setText("Hi!");
		label.setIcon(icon);
		//label.setVerticalAlignment(JLabel.BOTTOM);
		//label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(100, 100, 75, 75);
				
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.red);
		redPanel.setBounds(0, 0, 250, 250);
		redPanel.setLayout(null);
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250, 0, 250, 250);
		bluePanel.setLayout(null);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0, 250, 500, 250);
		greenPanel.setLayout(null);
				
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		
		greenPanel.add(label);
		
		frame.add(redPanel); // aqui se adiciona o que quiser ao frame, neste caso, um painel
		frame.add(bluePanel);
		frame.add(greenPanel);
		
		
	}
}
