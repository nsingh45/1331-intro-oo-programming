import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

/**
 * Gets the first 20 lines of a long text file and previews them in a JPanel
 * @author Neha Singh
 * @version 1.0
 */
public class LongTxtFileReader implements Previewable {

    private String filename;
    private FileScanner scan;
    private static int lineNum;
    private JLabel previewLabel;
    /**
     * Constructor: Creates an object of this class
     * and declares instance variables
     * @param file, the name of the file to preview
     */
    public LongTxtFileReader(String file) {
        filename = file;
        scan = new FileScanner(filename);
        lineNum = 0;
    }
    /**
     * Reads the next line of the text file
     * @return out, the next line of the file
     */
    public String readLine() {
        String out = "";
        if (scan.hasNext()) {
            out = scan.nextLine();
            lineNum++;
        }
        if (scan.hasNext() && lineNum == 20) {
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
     * @param panel, the panel showing the preview
     */
    public void preview(JPanel panel) {
        previewLabel = new JLabel("");
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        Font theFont = previewLabel.getFont();
        float pointSize = theFont.getSize2D();
        theFont = theFont.deriveFont(pointSize - 2);
        while (scan.hasNext() && lineNum < 20) {
            previewLabel = new JLabel(this.readLine());
            previewLabel.setFont(theFont);
            panel.add(previewLabel);
        }
        scan = new FileScanner(filename);
        lineNum = 0;
    }

}