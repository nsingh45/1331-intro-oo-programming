import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
/**
 * Displays the preview of a picture
 * @author Neha Singh
 * I collaborated with Lanah Marie Jose and Kelcy Newton
 * @version 1.0
 */
public class PictureViewer implements Previewable {
    private String filename;
    private ImageIcon image;
    /**
     * Constructor: Creates an object of this class
     * and instantiates variables
     * @param file, the name of the file
     */
    public PictureViewer(String file) {
        filename = file;
        image = new ImageIcon(filename);
    }
    /**
     * Creates the preview of the object and passes it to the JPanel
     * @param panel, the panel displaying the preview
     */
    public void preview(JPanel panel) {
        JLabel previewLabel = new JLabel(image);
        panel.add(previewLabel);
    }
    /**
     * Makes the string representation of this object the filename
     * @return filename, the name of the file
     */
    public String toString() {
        return filename;
    }
}