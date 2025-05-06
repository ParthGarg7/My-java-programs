import javax.swing.*;
import java.awt.*;

public class PanelCode{
    public static void main(String[] args){
     JFrame F1 = new JFrame("JPanel");
     
     F1.setSize(300,400);
     F1.setVisible(true);
     F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     F1.setLocationRelativeTo(null);

     JPanel P1 = new JPanel();
     P1.setBackground(Color.BLUE);

     F1.add(P1);

    }
}