import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class radioex {
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		JRadioButton button1 = new JRadioButton("100");
		JRadioButton button2 = new JRadioButton("50");
		JRadioButton button3 = new JRadioButton("0");
		
		button1.setSelected(true);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(button1);
		bg.add(button2);
		bg.add(button3);
		
		frame.add(new JLabel("����"));
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		
		frame.setSize(400,100);
		frame.setVisible(true);
		
	}


}
