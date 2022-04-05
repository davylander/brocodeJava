/*
 * Classe da aula 58. JOptionPane - Main
 * 04/04/2022
 * Direitos reservados para Davi Souto & BroCode
 */

package a58_joptionpane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {
	
	public static void main(String[] args) {
		
		//  JOptionPane = pop up a standard dialog box that prompts users for a value or informs them of something.
		
		//JOptionPane.showMessageDialog(null, "This is some useless info", "title", JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Here is more useless info", "title", JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "really?", "title", JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null, "VIRUS ALERT!!", "title", JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null, "Call tech support NOW!!", "title", JOptionPane.ERROR_MESSAGE);
		
		//JOptionPane.showConfirmDialog(null, "Code, David, Code!!", "My Title", JOptionPane.YES_NO_CANCEL_OPTION);
		//System.out.println(JOptionPane.showConfirmDialog(null, "Code, David, Code!!", "My Title", JOptionPane.YES_NO_CANCEL_OPTION));
		//int answer = JOptionPane.showConfirmDialog(null, "Code, David, Code!!", "My Title", JOptionPane.YES_NO_CANCEL_OPTION);
		//System.out.println(answer);
		
		//String name = JOptionPane.showInputDialog("What is your name?: ");
		//System.out.println("Hello " + name);
		
		String[] responses = {"No, you're awesome!", "thank you!", "*blush*"};
		ImageIcon icon = new ImageIcon("E:\\Java\\Livro Caixa icons\\check32.PNG");
		
		JOptionPane.showOptionDialog(null, "You are awesome!", "secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
		
	}
}
