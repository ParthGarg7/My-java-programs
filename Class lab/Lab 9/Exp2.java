import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Exp2 extends JFrame implements ActionListener {

    private JTextField textField;
    private String currentInput = "";

    public Exp2() {
        // Frame setup
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Display field
        textField = new JTextField();
        textField.setEditable(false);
        textField.setFont(new Font("Arial", Font.BOLD, 24));
        add(textField, BorderLayout.NORTH);

        // Panel for buttons
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));

        // Button labels
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "C", "0", "=", "+"
        };

        // Create and add buttons
        for (String label : buttons) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            panel.add(button);
        }

        add(panel, BorderLayout.CENTER);
        setLocationRelativeTo(null); // Center window
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (command.equals("C")) {
            currentInput = "";
            textField.setText("");
        } else if (command.equals("=")) {
            double result = evaluate(currentInput);
            if (Double.isNaN(result)) {
                textField.setText("Error");
                currentInput = "";
            } else {
                textField.setText(String.valueOf(result));
                currentInput = String.valueOf(result);
            }
        } else {
            currentInput += command;
            textField.setText(currentInput);
        }
    }

    // Safe expression evaluator with error handling
    private double evaluate(String expr) {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
        try {
            Object result = engine.eval(expr);
            return Double.parseDouble(result.toString());
        } catch (ScriptException | NumberFormatException e) {
            return Double.NaN; // return error signal
        }
    }

    public static void main(String[] args) {
        new Exp2();
    }
}
