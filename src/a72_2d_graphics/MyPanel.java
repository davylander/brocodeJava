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

	Image image;
	
	MyPanel(){
		image = new ImageIcon("video-games64.png").getImage();
		this.setPreferredSize(new Dimension(500,500));
	}
	
	public void paint(Graphics g) {
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(image, 0,0,null);
		g2D.setPaint(Color.blue);
		//g2D.setStroke(new BasicStroke(5));
		//g2D.drawLine(0, 0, 500, 500);
		
		//g2D.setPaint(Color.pink);
		//g2D.drawRect(0, 0, 100, 200);
		//g2D.fillRect(0, 0, 100, 200);
		
		//g2D.setPaint(Color.orange);
		//g2D.drawOval(0, 0, 100, 100);
		//g2D.fillOval(0, 0, 100, 100);
		
		//g2D.setPaint(Color.red);
		//g2D.fillArc(0, 0, 100, 100, 0, 180);
		//g2D.setPaint(Color.white);
		//g2D.fillArc(0, 0, 100, 100, 180, 180);
		
		int[] xPoints = {150,250,350};
		int[] yPoints = {300,150,300};
		g2D.setPaint(Color.yellow);
		g2D.drawPolygon(xPoints,yPoints,3);
		g2D.fillPolygon(xPoints,yPoints,3);
		
		//g2D.setPaint(Color.magenta);
		//g2D.setFont(new Font("Ink Free", Font.BOLD, 50));
		//g2D.drawString("You are a WINNER", 50, 50);
		
		
		
	}
	
}
