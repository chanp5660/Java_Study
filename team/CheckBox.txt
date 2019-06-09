import java.awt.*;
import javax.swing.*;

public class CheckBox {
	public static void main(String args[]){
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
        
        JCheckBox a=new JCheckBox("A");
        JCheckBox b=new JCheckBox("B");
        JCheckBox c=new JCheckBox("C");
        
        a.setSelected(true);
        
        frame.add(a);
        frame.add(b);
        frame.add(c);
        
        frame.setSize(300,200);
        frame.setVisible(true);
 
  }
}
