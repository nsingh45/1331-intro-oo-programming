import javax.swing.JFrame;

/**
 * Creates a frame to hold the panel that displays the program
 * @author Neha Singh
 * @version 1.0
 */
public class TestDriveFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("File Previewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setFocusable(false);
        TestDrivePanel panel = new TestDrivePanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
