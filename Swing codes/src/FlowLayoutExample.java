
import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {

    public static void main(String[] args) {

        JFrame F1 = new JFrame("Testing");

        F1.setSize(1000, 800);
        F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F1.setLocationRelativeTo(null);
        F1.setTitle("hi");

        JPanel P1 = new JPanel();

        P1.setLayout(new FlowLayout());
        P1.setBackground(Color.CYAN);


        JLabel L1 = new JLabel("Hello");
        JButton B1 = new JButton("Click here");
        JTextField T1 = new JTextField(10);

        P1.add(L1);
        P1.add(B1);
        P1.add(T1);

        F1.add(P1);
        F1.setVisible(true);

    }
}
