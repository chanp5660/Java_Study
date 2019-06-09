import javax.swing.*;

public class List {
	public static void main(String[] args) {   
	JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setLocationRelativeTo(null);
    
            
    DefaultListModel<String> m = new DefaultListModel<>();
    m.addElement("Apple");
    m.addElement("Banana");
    m.addElement("Peach");      
    m.addElement("Melon");
    JList<String> list = new JList<>(m);
    
    f.add(list);
    f.setSize(300,300);
    f.setVisible(true);
    
	}
}
