import javax.swing.*;
import java.awt.*;

public class BoxLayoutFrame extends JFrame {

    public BoxLayoutFrame() {
        // Set the title and default close operation
        setTitle("BoxLayout Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Set the layout for the frame to BoxLayout
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        // Add components to the frame (buttons, labels, etc.)
        JLabel label = new JLabel("Welcome to the Calculator!");
        label.setAlignmentX(Component.CENTER_ALIGNMENT);  // Center-align the label
        JButton button1 = new JButton("Button 1");
        button1.setAlignmentX(Component.CENTER_ALIGNMENT); // Center-align the button

        // Add components to the frame's content pane
        add(label);
        add(Box.createRigidArea(new Dimension(0, 20)));  // Add some space
        add(button1);

        // Set the size of the frame and make it visible
        setSize(400, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BoxLayoutFrame();  // Create an instance of the frame
    }
}
