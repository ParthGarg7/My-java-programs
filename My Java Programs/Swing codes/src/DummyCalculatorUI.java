import javax.swing.*;
import java.awt.*;

public class DummyCalculatorUI extends JFrame {
    public DummyCalculatorUI() {
        setTitle("Dummy Calculator UI");

        // Set layout
        setLayout(new GridLayout(5, 2, 10, 10));

        // Create text fields
        JTextField text1 = new JTextField();
        JTextField text2 = new JTextField();

        // Create buttons
        JButton addBtn = new JButton("Add");
        JButton subBtn = new JButton("Subtract");
        JButton mulBtn = new JButton("Multiply");
        JButton divBtn = new JButton("Divide");

        // Create label
        JLabel resultLabel = new JLabel("Result: ");

        // Add components to frame
        add(new JLabel("Enter first number:"));
        add(text1);

        add(new JLabel("Enter second number:"));
        add(text2);

        add(addBtn);
        add(subBtn);
        add(mulBtn);
        add(divBtn);

        add(resultLabel);

        // Frame settings
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DummyCalculatorUI();
    }
}
