import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TableWithComboBoxExample {

    // Sample data
    static String[][] studentData = {
        { "1", "Parth", "Cyber Security" },
        { "2", "Shubhi", "Design" },
        { "3", "Aman", "Cyber Security" },
        { "4", "Riya", "Design" },
        { "5", "Rohan", "Engineering" }
    };

    static String[] columnNames = { "ID", "Name", "Department" };

    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable + JComboBox + JScrollPane Example");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // === JComboBox ===
        String[] departments = { "All", "Cyber Security", "Design", "Engineering" };
        JComboBox<String> deptComboBox = new JComboBox<>(departments);
        frame.add(deptComboBox, BorderLayout.NORTH);

        // === JTable with default data ===
        JTable table = new JTable(studentData, columnNames);
        JScrollPane scrollPane = new JScrollPane(table); // Make it scrollable
        frame.add(scrollPane, BorderLayout.CENTER);

        // === ComboBox Action Listener ===
        deptComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedDept = (String) deptComboBox.getSelectedItem();
                if (selectedDept.equals("All")) {
                    table.setModel(new javax.swing.table.DefaultTableModel(studentData, columnNames));
                } else {
                    // Filter rows by selected department
                    java.util.List<String[]> filtered = new java.util.ArrayList<>();
                    for (String[] row : studentData) {
                        if (row[2].equals(selectedDept)) {
                            filtered.add(row);
                        }
                    }
                    // Convert List back to array
                    String[][] filteredData = filtered.toArray(new String[0][]);
                    table.setModel(new javax.swing.table.DefaultTableModel(filteredData, columnNames));
                }
            }
        });

        frame.setVisible(true);
    }
}
