/*
 * Classe para aula 73. 2D Animation - MyFrame
 * 13/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a73_2D_animation;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class MyPanel extends JPanel implements ActionListener {

	final int PANEL_WIDTH = 500;
	final int PANEL_HIGHT = 500;
	Image image;
	Image backgroundImage;
	Timer timer;
	int xVelocity = 1;
	int yVelocity = 1;
	int x = 0;
	int y = 0;
	
	MyPanel(){
		
		this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HIGHT));
		this.setBackground(Color.black);
		image = new ImageIcon("video-games64.png").getImage();
		backgroundImage = new ImageIcon("gaming-back.jpg").getImage();
		timer = new Timer(1, this);
		timer.start();
		
	}

	public void paint(Graphics g) {
		
		super.paint(g); // paint background
		
		Graphics2D g2D = (Graphics2D) g;
		g2D.drawImage(backgroundImage , 0, 0, null);
		g2D.drawImage(image , x, y, null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(x >= PANEL_WIDTH - image.getWidth(null) || x < 0) {
			xVelocity = xVelocity * -1;
		}
		x = x + xVelocity;	
		
		if(y >= PANEL_HIGHT - image.getHeight(null) || y < 0) {
			yVelocity = yVelocity * -1;
		}
		y = y + yVelocity;	
		
		repaint();
	}
	
}
