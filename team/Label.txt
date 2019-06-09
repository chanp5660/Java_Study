import javax.swing.*;

public class Label {
	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setSize(400,200);
		frame.setVisible(true);
		
		JLabel label = new JLabel();
		label.setText("Label Example");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		frame.add(label);
		
		}
}
