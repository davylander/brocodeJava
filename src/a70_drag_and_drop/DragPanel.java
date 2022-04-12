/*
 * Classe para a aula 70. Drag and Drop - DragPanel
 * 12/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a70_drag_and_drop;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class DragPanel extends JPanel {

	ImageIcon image = new ImageIcon("video-games64.png");
	int WIDTH = image.getIconWidth();
	int HEIGHT = image.getIconHeight();
	Point imageCorner;
	Point previousPoint;
			
	
	DragPanel(){
		
		imageCorner = new Point(0,0);
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		image.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
		
	}
	
	private class ClickListener extends MouseAdapter {
		
		public void mousePressed(MouseEvent e) {
			
			previousPoint = e.getPoint();
			
		}
		
	}
	
	private class DragListener extends MouseMotionAdapter {
		
		public void mouseDragged(MouseEvent e) {
			Point currentPoint = e.getPoint();
			
			imageCorner.translate(
							(int)(currentPoint.getX() - previousPoint.getX()),
							(int)(currentPoint.getY() - previousPoint.getY())
								);
			previousPoint = currentPoint;
			repaint();
		}
		
	}
	
}
