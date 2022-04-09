/*
 * Classe para a aula 62. ComboBox - MyFrame
 * 0?/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a62_combobox;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class MyFrame extends JFrame implements ActionListener {

	JButton button;
	JComboBox comboBox;
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("send");
		button.addActionListener(this);
		
		//String[] animals = {"Pizza Grande","Pão Beirute","Pizza Média","Pizza Brotinho"};
		String[] animals = {"dog","cat","bird"};
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		
		//comboBox.setEditable(true);
		//System.out.println(comboBox.getItemCount()); // printa o numero de elementos
		//comboBox.addItem("horse");
		//comboBox.insertItemAt("pig", 0);
		//comboBox.setSelectedIndex(0);
		//comboBox.removeItem("cat");
		//comboBox.removeItemAt(0);
		//comboBox.removeAllItems();
		
		this.add(comboBox);
		//this.add(button);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == comboBox) {
			System.out.println(comboBox.getSelectedItem());
			//System.out.println(comboBox.getSelectedIndex());
		}
		
		//if(e.getSource() == button) {
		//	System.out.println("Produto vendido: " + comboBox.getSelectedItem());
		//}
	}

}
