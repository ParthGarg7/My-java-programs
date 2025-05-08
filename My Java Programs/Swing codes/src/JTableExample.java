import javax.swing.*;
import java.awt.*;

public class JTableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTable Example");
        String[][] data = {
            { "1", "Parth", "Cyber Security" },
            { "2", "Shubhi", "Design" }
        };
        String[] columns = { "ID", "Name", "Course" };
        JTable table = new JTable(data, columns);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
