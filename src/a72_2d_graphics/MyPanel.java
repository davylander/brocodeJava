/*
 * Classe para aula 72. 2D Graphics - MyFrame
 * 12/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a72_2d_graphics;

import java.awt.*;

import javax.swing.*;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class MyPanel extends JPanel{

	MyPanel(){
		this.setPreferredSize(new Dimension(500,500));
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.setPaint(Color.blue);
		g2D.setStroke(new BasicStroke(5));
		//g2D.drawLine(0, 0, 500, 500);
		
		g2D.setPaint(Color.pink);
		g2D.drawRect(0, 0, 100, 200);
		
	}
	
}
