
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Exp4 extends JFrame {

    private JTextField idField, nameField, deptField, salaryField;
    private JButton insertButton, loadButton;
    private JTable table;
    private DefaultTableModel tableModel;

    // SQLite DB connection URL
    final String URL = "jdbc:sqlite:employee.db";

    public Exp4() {
        setTitle("Employee Management (SQLite)");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);

        // Setup input form
        JPanel inputPanel = new JPanel(new GridLayout(5, 2, 5, 5));
        inputPanel.add(new JLabel("ID:"));
        idField = new JTextField();
        inputPanel.add(idField);

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Department:"));
        deptField = new JTextField();
        inputPanel.add(deptField);

        inputPanel.add(new JLabel("Salary:"));
        salaryField = new JTextField();
        inputPanel.add(salaryField);

        insertButton = new JButton("Insert");
        loadButton = new JButton("Load Records");

        inputPanel.add(insertButton);
        inputPanel.add(loadButton);

        add(inputPanel, BorderLayout.NORTH);

        // Setup JTable
        tableModel = new DefaultTableModel(new String[]{"ID", "Name", "Department", "Salary"}, 0);
        table = new JTable(tableModel);
        add(new JScrollPane(table), BorderLayout.CENTER);

        // Create table if not exists
        createTable();

        // Button actions
        insertButton.addActionListener(e -> insertEmployee());
        loadButton.addActionListener(e -> loadEmployees());

        setVisible(true);
    }

    // Create table if it doesn't exist
    private void createTable() {
        try (Connection conn = DriverManager.getConnection(URL); Statement stmt = conn.createStatement()) {
            String sql = "CREATE TABLE IF NOT EXISTS employee ("
                    + "id INTEGER PRIMARY KEY, "
                    + "name TEXT NOT NULL, "
                    + "department TEXT NOT NULL, "
                    + "salary REAL NOT NULL)";
            stmt.execute(sql);
        } catch (SQLException e) {
            showError("Error creating table: " + e.getMessage());
        }
    }

    private void insertEmployee() {
        try (Connection conn = DriverManager.getConnection(URL)) {
            String sql = "INSERT INTO employee (id, name, department, salary) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, Integer.parseInt(idField.getText()));
            stmt.setString(2, nameField.getText());
            stmt.setString(3, deptField.getText());
            stmt.setDouble(4, Double.parseDouble(salaryField.getText()));

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Employee inserted successfully!");
            clearFields();
        } catch (SQLException | NumberFormatException ex) {
            showError("Insert Error: " + ex.getMessage());
        }
    }

    private void loadEmployees() {
        try (Connection conn = DriverManager.getConnection(URL); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT * FROM employee")) {

            tableModel.setRowCount(0);
            while (rs.next()) {
                tableModel.addRow(new Object[]{
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("department"),
                    rs.getDouble("salary")
                });
            }
        } catch (SQLException e) {
            showError("Load Error: " + e.getMessage());
        }
    }

    private void clearFields() {
        idField.setText("");
        nameField.setText("");
        deptField.setText("");
        salaryField.setText("");
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Exp4());
    }
}
