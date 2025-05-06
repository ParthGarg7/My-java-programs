
import javax.swing.JFrame;

public class FrameCode {

    public static void main(String[] args) {
        JFrame f1 = new JFrame("hi");

        f1.setSize(300, 300);
        f1.setVisible(true);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLocationRelativeTo(null);
    }
}
