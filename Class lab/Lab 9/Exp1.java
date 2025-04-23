import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exp1 extends JFrame {

    // Constructor to set up the GUI
    public Exp1() {
        // Set title and layout
        setTitle("Login Form");
        setLayout(new GridLayout(4, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the frame

        // Components
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        JLabel messageLabel = new JLabel("");

        // Add components to the frame
        add(userLabel);
        add(userField);
        add(passLabel);
        add(passField);
        add(new JLabel()); // Empty cell
        add(loginButton);
        add(messageLabel);

        // Button action
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = userField.getText();
                String password = new String(passField.getPassword());

                if (username.equals("admin") && password.equals("password")) {
                    messageLabel.setText("Login successful!");
                } else {
                    messageLabel.setText("Invalid credentials.");
                }
            }
        });

        // Make the frame visible
        setVisible(true);
    }

    // Main method
    public static void main(String[] args) {
        new Exp1();
    }
}
