/*
 * Classe para aula 60. Chebox - MyFrame
 * 05/04/2022
 * Direitos rezervados para Davi Souto Neri & BroCode
 */

package a60_checkbox;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode BootCamp Java
 */

public class MyFrame extends JFrame implements ActionListener {

	JCheckBox checkBox;
	JButton button;
	ImageIcon vIcon;
	ImageIcon bIcon;
	
	MyFrame() {
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		vIcon = new ImageIcon("E:\\Java\\Livro Caixa icons\\check32.PNG");
		bIcon = new ImageIcon("E:\\Java\\Livro Caixa icons\\benefits16.PNG");
		
		button = new JButton();
		button.setText("Submit");
		button.addActionListener(this);
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
		checkBox.setIcon(vIcon);
		checkBox.setSelectedIcon(bIcon);
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			
			boolean response = checkBox.isSelected();
			System.out.println(response);
		}
	}
	
}
