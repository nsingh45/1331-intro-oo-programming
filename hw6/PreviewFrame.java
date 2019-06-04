import javax.swing.JFrame;


/**
 * Creates a window to house this lovely program
 * @author Neha Singh
 * I collaborated with Lanah Marie Jose and Kelcy Newton
 * @version 1.0
 */
public class PreviewFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame("File Previewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FilePreviewPanel panel = new FilePreviewPanel();
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}