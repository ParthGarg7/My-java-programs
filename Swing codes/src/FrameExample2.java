
import javax.swing.*;
import java.awt.*;

public class FrameExample2 extends JFrame {

    public static void main(String[] args) {
        new FrameExample2();
    }

    public FrameExample2() {

        setSize(600, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout());

        add(new JButton("HI"));
        add(new JLabel("Hello"));
        add(new JTextField(10));

        setVisible(true);

    }

}
