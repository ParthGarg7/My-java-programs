import javax.swing.JFrame;

public class MultiWindowExample {
    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Main Window 😎");
        mainFrame.setSize(300, 200);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);

        JFrame secondaryFrame = new JFrame("Second Window 🤓");
        secondaryFrame.setSize(200, 150);
        secondaryFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // ✅ safer!
        secondaryFrame.setVisible(true);
    }
}
