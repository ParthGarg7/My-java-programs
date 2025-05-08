
import java.awt.*;
import javax.swing.*;

public class BoxLayoutExample extends JFrame {

    public BoxLayoutExample() {
        setSize(400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel P1 = new JPanel();

        P1.setLayout(new BoxLayout(P1,BoxLayout.Y_AXIS));
        P1.setBackground(Color.WHITE);

        JLabel L1 = new JLabel("Enter Username");
        L1.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel L2 = new JLabel("Enter Password");
        L2.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton Enter = new JButton("Enter");
        Enter.setAlignmentX(Component.CENTER_ALIGNMENT);

        JTextField UserName = new JTextField();
        UserName.setMaximumSize(new Dimension(300,30));

        JTextField Pass = new JTextField();
        Pass.setMaximumSize(new Dimension(300,30));

        P1.add(Box.createRigidArea(new Dimension(0,20)));
        P1.add(L1);
        P1.add(UserName);
        P1.add(Box.createRigidArea(new Dimension(0,20)));
        P1.add(L2);
        P1.add(Pass);
        P1.add(Box.createRigidArea(new Dimension(0,20)));
        P1.add(Enter);
        add(P1);

        setVisible(true);

    }

    public static void main(String[] args){
        new BoxLayoutExample();
    }
}
