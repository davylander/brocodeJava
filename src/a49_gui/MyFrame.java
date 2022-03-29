/*
 * Classe da aula 49. GUI - MyFrame
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

public class MyFrame extends JFrame {

	MyFrame(){

		this.setTitle("Davylander JFrame title here"); // sets title of this
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
		this.setResizable(false); // prevent this from being resized
		this.setSize(420,420); // sets the x-dimension and y-dimension of this
		this.setVisible(true); // make this visible
		
		ImageIcon image = new ImageIcon("Homoes.PNG"); // create a image Icon
		this.setIconImage(image.getImage()); // change icon of this
		
		this.getContentPane().setBackground(new Color(100,50,150)); // change color of background / 100,50,150: RED 0-255, GREEN 0-255, BLUE 0-255  / 0xFFFFFF
	}
	
}
