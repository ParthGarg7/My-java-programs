import javax.swing.*;
import java.awt.*;


public class Cal1 extends JFrame{
    public Cal1(){
        setSize(400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setTitle("Cal C");
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JPanel P1 = new JPanel();
        P1.setBackground(Color.WHITE);
        P1.setLayout(new FlowLayout());

        JTextField Display = new JTextField(10);
        Display.setHorizontalAlignment(JTextField.RIGHT);
        P1.add(Display);

        
        JPanel P2 = new JPanel();
        P2.setBackground(Color.WHITE);
        P2.setLayout(new GridLayout(4,4,10,10));

        P2.add(new JButton("7"));
        P2.add(new JButton("8"));
        P2.add(new JButton("9"));
        P2.add(new JButton("/"));

        P2.add(new JButton("4"));
        P2.add(new JButton("5"));
        P2.add(new JButton("6"));
        P2.add(new JButton("*"));

        P2.add(new JButton("1"));
        P2.add(new JButton("2"));
        P2.add(new JButton("3"));
        P2.add(new JButton("-"));

        P2.add(new JButton("0"));
        P2.add(new JButton("C"));
        P2.add(new JButton("="));
        P2.add(new JButton("+"));

        P1.setAlignmentX(Component.CENTER_ALIGNMENT);
        P2.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(P1);
        add(P2);
     


    
        setVisible(true);
    }

    public static void main(String[] args){
        new Cal1();
    }
}