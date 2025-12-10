import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

class StudentTableDynamic {
    public static void main(String args[]) {
        JFrame frame = new JFrame("Student Table Dynamic");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 400);

        String[] columns = {"RollNo", "Name", "Branch", "Marks"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);
        JTable table = new JTable(model);
        JScrollPane scrollPane = new JScrollPane(table);

        // Input fields
        JTextField rollNoField = new JTextField(5);
        JTextField nameField = new JTextField(10);
        JTextField branchField = new JTextField(10);
        JTextField marksField = new JTextField(5);
        JButton addButton = new JButton("Add Student");

        // Panel for inputs with better layout
        JPanel inputPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        inputPanel.add(new JLabel("RollNo:"));
        inputPanel.add(rollNoField);
        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Branch:"));
        inputPanel.add(branchField);
        inputPanel.add(new JLabel("Marks:"));
        inputPanel.add(marksField);
        inputPanel.add(addButton);

        // Add action listener to button
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String rollNo = rollNoField.getText().trim();
                String name = nameField.getText().trim();
                String branch = branchField.getText().trim();
                String marksStr = marksField.getText().trim();
                if (rollNo.isEmpty() || name.isEmpty() || branch.isEmpty() || marksStr.isEmpty()) {
                    JOptionPane.showMessageDialog(frame,
                        "Please fill all fields.",
                        "Input Error",
                        JOptionPane.WARNING_MESSAGE);
                    return;
                }
                try {
                    int marks = Integer.parseInt(marksStr);
                    model.addRow(new Object[]{rollNo, name, branch, marks});
                    rollNoField.setText("");
                    nameField.setText("");
                    branchField.setText("");
                    marksField.setText("");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame,
                        "Marks must be a valid integer.",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(inputPanel, BorderLayout.SOUTH);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}