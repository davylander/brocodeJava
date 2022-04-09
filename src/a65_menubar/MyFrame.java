/*
 * Classe da aula 65. Menubar - MyFrame
 * 09/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a65_menubar;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/*
 * @version 1;0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class MyFrame extends JFrame implements ActionListener{

	JMenuBar menuBar;
	
	JMenu fileMenu;
	JMenu editMenu;
	JMenu helpMenu;
	
	JMenuItem loadItem;
	JMenuItem saveItem;
	JMenuItem exitItem;
	
	ImageIcon load;
	ImageIcon save;
	ImageIcon exit;
	
	MyFrame(){
		//_____________________FRAME_____________________
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(new FlowLayout());
		
		load = new ImageIcon("save.PNG");
		save = new ImageIcon("load.PNG");
		exit = new ImageIcon("exit.PNG");
		
		//_____________________MENU_____________________
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		editMenu = new JMenu("Edit");
		helpMenu = new JMenu("Help");
		
		loadItem = new JMenuItem("Load");
		saveItem = new JMenuItem("Save");
		exitItem = new JMenuItem("Exit");
		
		//_____________________ADD SECTION_____________________
		loadItem.addActionListener(this);
		saveItem.addActionListener(this);
		exitItem.addActionListener(this);
		
		loadItem.setIcon(load);
		saveItem.setIcon(save);
		exitItem.setIcon(exit);
		
		loadItem.setMnemonic(KeyEvent.VK_L); // L for load
		saveItem.setMnemonic(KeyEvent.VK_S); // S for save
		exitItem.setMnemonic(KeyEvent.VK_E); // E for load
		
		fileMenu.setMnemonic(KeyEvent.VK_F); // L for load
		editMenu.setMnemonic(KeyEvent.VK_E); // S for save
		helpMenu.setMnemonic(KeyEvent.VK_H); // E for load
		
		fileMenu.add(loadItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(helpMenu);
		
		this.setJMenuBar(menuBar);
		//_____________________________________________________
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == loadItem) {
			System.out.println("*Beep boop * You loaded a file");
		}
		else if(e.getSource() == saveItem) {
			System.out.println("*Beep boop * You saved a file");
		}
		else if(e.getSource() == exitItem) {
			System.exit(0);
		}
		
	}

}
