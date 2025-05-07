
import javax.swing.*;
import java.awt.*;

public class loginForm1 extends JFrame {

    public loginForm1() {
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel P1 = new JPanel();
        P1.setLayout(new BoxLayout(P1, BoxLayout.Y_AXIS));
        P1.setBackground(Color.WHITE);

        P1.add(new JLabel("Enter Username"));

        JTextField T1 = new JTextField(3);
        JTextField T2 = new JTextField(3);

        JButton Enter = new JButton("Enter");


        P1.add(T1);
        P1.add(new JLabel("Enter Password"));
        P1.add(T2);
        P1.add(Enter);

        add(P1);
        setVisible(true);

    }

    public static void main(String[] args) {
        new loginForm1();
    }
}
