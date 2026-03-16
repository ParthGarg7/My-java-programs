import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
    JTextField text;
    String num1 = "", num2 = "", operator = "";

    Calculator() {
        setTitle("Calculator 🧮");
        text = new JTextField();
        text.setEditable(false);
        add(text, BorderLayout.NORTH);

        JPanel panel = new JPanel(new GridLayout(4, 4));
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "=", "C", "+"
        };

        for (String b : buttons) {
            JButton btn = new JButton(b);
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel);
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.charAt(0) >= '0' && s.charAt(0) <= '9') 
        {
            if (operator.equals("")) num1 += s;
            else num2 += s;
            text.setText(num1 + operator + num2);

        } 
        else 
        if (s.equals("C")) 
        {
            num1 = num2 = operator = "";
            text.setText("");
        } 
        else 
        if (s.equals("=")) {
            int result = 0;
            int n1 = Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);

            switch (operator) {
                case "+": result = n1 + n2; break;
                case "-": result = n1 - n2; break;
                case "*": result = n1 * n2; break;
                case "/": result = (n2 != 0) ? n1 / n2 : 0; break;
            }

            text.setText(num1 + operator + num2 + "=" + result);
            num1 = String.valueOf(result);
            num2 = "";
            operator = "";
        } 
        else {
            if (!num1.equals("")) operator = s;
            text.setText(num1 + operator);
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
