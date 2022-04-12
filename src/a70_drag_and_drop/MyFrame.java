/*
 * Classe para a aula 70. Drag and Drop - MyFrame
 * 12/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a70_drag_and_drop;

import javax.swing.JFrame;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class MyFrame extends JFrame {

	DragPanel dragPanel = new DragPanel();
	
	MyFrame(){
		
		this.add(dragPanel);
		
		this.setTitle("Drag and Drop demo");
		this.setSize(600,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		this.setVisible(true);
	}
	
}
