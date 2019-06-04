import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
/**
 * Gets the first 5 lines of a short text file and previews them in a JPanel
 * @author Neha Singh
 * I collaborated with Lanah Marie Jose and Kelcy Newton
 * @version 1.0
 */
public class ShortTxtFileReader implements Previewable {

    private FileScanner scan;
    private String filename;
    private static int lineNum;
    /**
     * Constructor: Creates an object of this class
     * and instantiates variables
     * @param file, the name of the file to be previewed
     */
    public ShortTxtFileReader(String file) {
        filename = file;
        scan = new FileScanner(filename);
        lineNum = 0;
    }
    /**
     * Reads the next line of the text file
     * @return out, the next line of the text file
     */
    public String readLine() {
        String out = "";
        if (scan.hasNext()) {
            out = scan.nextLine();
            lineNum++;
        }
        if (scan.hasNext() && lineNum == 5) {
            out = out + "...";
        }
        return out;
    }
    /**
     * Makes the string representation of this object the filename
     * @return filename, the name of the file
     */
    public String toString() {
        return filename;
    }
    /**
     * Creates the preview of the file and passes it to the JPanel
     * @param panel, the panel displaying the preview
     */
    public void preview(JPanel panel) {
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        while (scan.hasNext() && lineNum < 5) {
            JLabel previewLabel = new JLabel(this.readLine());
            panel.add(previewLabel);
        }
        scan = new FileScanner(filename);
        lineNum = 0;
    }
}