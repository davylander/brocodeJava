/*
 * Classe da aula 39.GUI - Main
 * 29/03/2022
 * Direitos reservados para Davi Souto & BroCode
 */

package a49_gui;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {

	public static void main(String[] args) {
		// JFrame = a GUI window to add componentes to
		/*
		JFrame frame = new JFrame(); //creates a frame
		frame.setTitle("Davylander JFrame title here"); // sets title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		frame.setResizable(false); // prevent frame from being resized
		frame.setSize(420,420); // sets the x-dimension and y-dimension of frame
		frame.setVisible(true); // make frame visible
		
		ImageIcon image = new ImageIcon("Homoes.PNG"); // create a image Icon
		frame.setIconImage(image.getImage()); // change icon of frame
		
		frame.getContentPane().setBackground(new Color(100,50,150)); // change color of background / 100,50,150: RED 0-255, GREEN 0-255, BLUE 0-255  / 0xFFFFFF
		*/
		
		MyFrame myFrame = new MyFrame();
		
	}
}
