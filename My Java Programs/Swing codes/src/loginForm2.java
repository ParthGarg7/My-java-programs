import javax.swing.*;
import java.awt.*;

public class loginForm2 extends JFrame {

    public loginForm2() {
        setTitle("Login Form");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel P1 = new JPanel();
        P1.setLayout(new BoxLayout(P1, BoxLayout.Y_AXIS));
        P1.setBackground(Color.WHITE);
        P1.setBorder(BorderFactory.createEmptyBorder(20, 50, 20, 50)); // padding

        JLabel userLabel = new JLabel("Enter Username");
        userLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField T1 = new JTextField();
        T1.setMaximumSize(new Dimension(300, 30));

        JLabel passLabel = new JLabel("Enter Password");
        passLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        JTextField T2 = new JTextField();
        T2.setMaximumSize(new Dimension(300, 30));

        JButton Enter = new JButton("Enter");
        Enter.setAlignmentX(Component.CENTER_ALIGNMENT);

        P1.add(userLabel);
        P1.add(T1);
        P1.add(Box.createRigidArea(new Dimension(0, 10)));
        P1.add(passLabel);
        P1.add(T2);
        P1.add(Box.createRigidArea(new Dimension(0, 20)));
        P1.add(Enter);

        add(P1);
        setVisible(true);
    }

    public static void main(String[] args) {
        new loginForm2();
    }
}
