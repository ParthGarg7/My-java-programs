
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login_FormWAL extends JFrame implements ActionListener {


    public JTextField f1;
    public JPasswordField f2;
    public JButton b1;
    public JLabel l3;

    public Login_FormWAL() {
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Login Form");

        JPanel P1 = new JPanel();
        P1.setLayout(new BoxLayout(P1, BoxLayout.Y_AXIS));
        P1.setBackground(Color.LIGHT_GRAY);

        JLabel l1 = new JLabel("Username");
        JLabel l2 = new JLabel("Password");

        l1.setAlignmentX(Component.CENTER_ALIGNMENT);
        l2.setAlignmentX(Component.CENTER_ALIGNMENT);

        f1 = new JTextField();
        f2 = new JPasswordField();

        f1.setMaximumSize(new Dimension(200, 30));
        f2.setMaximumSize(new Dimension(200, 30));

        b1 = new JButton("Enter");
        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b1.addActionListener(this);


        l3 = new JLabel();
        l3.setAlignmentX(Component.CENTER_ALIGNMENT);

        P1.add(Box.createRigidArea(new Dimension(0, 20)));
        P1.add(l1);
        P1.add(f1);
        P1.add(Box.createRigidArea(new Dimension(0, 20)));
        P1.add(l2);
        P1.add(f2);
        P1.add(Box.createRigidArea(new Dimension(0, 20)));
        P1.add(b1);
        P1.add(l3);

        add(P1);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = f1.getText();
        String password = new String(f2.getPassword());

        if (username.equals("parth") && password.equals("shubhi")) {
            l3.setText("Login Successful");

        } else {
            l3.setText("Invalid Username or Password");

        }
    }

    public static void main(String[] args) {
        new Login_FormWAL();
    }

  
}
