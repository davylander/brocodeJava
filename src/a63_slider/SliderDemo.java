/*
 * Classe da aula 63. Slider - SliderDemo
 * 09/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a63_slider;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

/*
 * @version 1;0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class SliderDemo implements ChangeListener {

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	SliderDemo() {
		
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,50); // (inicio, fim, *opcional*:Número de início fixo)
		
		//____________________________________________________SLIDER____________________________________________________
		slider.setPreferredSize(new Dimension(400,200));
		slider.setOrientation(SwingConstants.VERTICAL); // Mudar para vertical
		//
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		//
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(25);
		//
		slider.setPaintLabels(true); // faz aparecer os números de cada ponto/Paint
		slider.setFont(new Font("MV Boli", Font.PLAIN,15));
		
		slider.addChangeListener(this);
		//____________________________________________________LABEL_____________________________________________________
		label.setFont(new Font("MV Boli", Font.PLAIN,25));
		label.setText("ºC = " + slider.getValue());
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
		
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("ºC = " + slider.getValue());
	}
}
