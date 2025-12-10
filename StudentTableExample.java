import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
class StudentTableExample{
    public static void main(String args[]){
        JFrame frame = new JFrame("Student Table Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        String[] columns = {"RollNo", "Name", "Branch", "Marks"};
        Object[][] data = {
                {"101", "Alice", "CSE", 85},
                {"102", "Bob", "ECE", 90},
        };
        DefaultTableModel model = new DefaultTableModel(data, columns);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setVisible(true);
    }
}