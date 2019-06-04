import javax.swing.JFrame;
/**
 * Sets up the JFrame window for a random color chooser
 * @author Neha Singh
 * @version 1.0
 */
public class ColorChooser {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Color Chooser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ColorChooserPanel panel = new ColorChooserPanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}