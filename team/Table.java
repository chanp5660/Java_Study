import javax.swing.*;

public class Table {
	public static void main(String[] args)
	{
		JFrame jFrame = new JFrame();

		String columnNames[] =
		{ "Number", "Name", "Age"};

		Object rowData[][] =
		{
		{ 1, "A", 10},
		{ 2, "B", 20},
		{ 3, "C", 30} };

		JTable jTable = new JTable(rowData, columnNames);
		JScrollPane jScollPane = new JScrollPane(jTable);

		jFrame.add(jScollPane);
		jFrame.setSize(400, 300);
		jFrame.setVisible(true);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
