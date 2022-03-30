/*
 * Classe da aula 50. Labels - Main
 * 30/03/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a50_labels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {
	
	public static void main(String[] args) {
		// JLabel = a GUI display area for a string of text, an image, or both
		
		ImageIcon image = new ImageIcon("E:\\Imagens\\Amigos memes\\Logos\\512.PNG");
		Border border = BorderFactory.createLineBorder(Color.yellow,2);
		
		JLabel label = new JLabel(); // create a label
		label.setText("OS EGÍPCIOS"); // set text of label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGHT of imageicon
		label.setVerticalTextPosition(JLabel.TOP); // set text TOP, CENTERM BOTTOM of imageicon
		label.setForeground(Color.yellow); // set color of text / new Color(200,50,150)
		label.setFont(new Font("Arial", Font.PLAIN,50)); // set font of text
		label.setIconTextGap(1); // set gap of text to image
		label.setBackground(Color.black); // set background color
		label.setOpaque(true); // display background color
		label.setBorder(border); //display border to label
		label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text within label
		label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
		//label.setBounds(140,130,700,700); // set x,y position within frame as well as dimensions
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(1000,1000);
		//frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack();
		
	}
}
