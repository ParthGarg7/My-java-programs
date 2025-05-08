
import java.awt.*;
import javax.swing.*;

public class PracticeQ1 extends JFrame {

    public PracticeQ1() {
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Login Form");

        JPanel P1 = new JPanel();

        P1.setLayout(new BoxLayout(P1, BoxLayout.Y_AXIS));
        P1.setBackground(Color.WHITE);

        JLabel L1 = new JLabel("Enter Username");
        JLabel L2 = new JLabel("Enter Password");

        L1.setAlignmentX(Component.CENTER_ALIGNMENT);
        L2.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField F1 = new JTextField();
        JPasswordField F2 = new JPasswordField();

        F1.setMaximumSize(new Dimension(300,30));
        F2.setMaximumSize(new Dimension(300,30));

        JButton B1 = new JButton("Enter");
        B1.setAlignmentX(Component.CENTER_ALIGNMENT);

        P1.add(Box.createRigidArea(new Dimension(0,20)));
        P1.add(L1);
        P1.add(F1);
        P1.add(Box.createRigidArea(new Dimension(0,20)));
        P1.add(L2);
        P1.add(F2);
        P1.add(Box.createRigidArea(new Dimension(0,20)));
        P1.add(B1);

        add(P1);

        setVisible(true); 
    }

    public static void main(String[] args){
        new PracticeQ1();
    }
}
