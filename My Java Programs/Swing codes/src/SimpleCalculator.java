import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField display;
    private String current = "", operator = "";
    private double result = 0;

    public SimpleCalculator() {
        // Frame settings
        setTitle("Simple Calculator 🧮");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create display
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        add(display, BorderLayout.NORTH);

        // Create panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 5, 5));

        // Buttons layout
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+",
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 18));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();

        if (input.matches("[0-9]")) {
            current += input;
            display.setText(current);
        } else if (input.matches("[+\\-*/]")) {
            if (!current.isEmpty()) {
                result = Double.parseDouble(current);
                current = "";
                operator = input;
                display.setText("");
            }
        } else if (input.equals("=")) {
            if (!current.isEmpty() && !operator.isEmpty()) {
                double operand = Double.parseDouble(current);
                switch (operator) {
                    case "+": result += operand; break;
                    case "-": result -= operand; break;
                    case "*": result *= operand; break;
                    case "/":
                        if (operand != 0) result /= operand;
                        else {
                            display.setText("Error ❌ /0");
                            current = "";
                            return;
                        }
                        break;
                }
                display.setText(String.valueOf(result));
                current = "";
                operator = "";
            }
        } else if (input.equals("C")) {
            current = "";
            operator = "";
            result = 0;
            display.setText("");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SimpleCalculator());
    }
}
