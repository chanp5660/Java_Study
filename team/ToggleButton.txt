import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class ToggleButton {
	public static void main(String args[]) {
	    JFrame frame = new JFrame();
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JToggleButton toggleButton = new JToggleButton("ON");
	    
	    ActionListener actionListener = new ActionListener() {
	      public void actionPerformed(ActionEvent actionEvent) {
	        
	        if(toggleButton.isSelected())
	        	toggleButton.setText("OFF");
	        else
	        	toggleButton.setText("ON");
	      }
	    };
	    
	    toggleButton.addActionListener(actionListener);
	    frame.add(toggleButton, BorderLayout.NORTH);
	    frame.setSize(300, 125);
	    frame.setVisible(true);
	  }
}
