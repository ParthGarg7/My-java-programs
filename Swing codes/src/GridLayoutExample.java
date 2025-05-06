
import javax.swing.*;
import java.awt.*;

public class GridLayoutExample {

    public static void main(String[] args) {
        JFrame F1 = new JFrame("Testing");
        F1.setSize(500,500);
        F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F1.setLocationRelativeTo(null);

        JPanel P1 = new JPanel();
        P1.setLayout(new GridLayout(3,3,10,10));
        P1.setBackground(Color.WHITE);

        for(int i = 1 ; i < 10 ; i++)
            P1.add(new JButton("" + i));
        
        F1.add(P1);
        F1.setVisible(true);

    }
}
