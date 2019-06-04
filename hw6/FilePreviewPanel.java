import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
/**
 * This class represents a panel that holds all the other components,
 * with the list of files to preview on the left and the preview on the right.
 * @author Neha Singh
 * I collaborated with Lanah Marie Jose and Kelcy Newton
 * @version 1.0
 */

public class FilePreviewPanel extends JPanel {

    private PreviewListPanel listPanel;
    private DisplayPanel previewer;
    private ShortTxtFileReader ugaJoke, haiku;
    private LongTxtFileReader almaMater, invictus;
    private PictureViewer buzz, bird;
    /**
     * Constructor: Sets up panel, instantiates objects,
     * adds files to ListPanel, adds smaller panels in
     * proper positions
     */
    public FilePreviewPanel() {
        setPreferredSize(new Dimension(700, 500));
        setLayout(new BorderLayout());

        ugaJoke = new ShortTxtFileReader("ugaJoke.txt");
        haiku = new ShortTxtFileReader("haiku.txt");
        invictus = new LongTxtFileReader("invictus.txt");
        almaMater = new LongTxtFileReader("AlmaMater.txt");
        buzz = new PictureViewer("Buzz.jpg");
        bird = new PictureViewer("birdrights.jpg");
        listPanel = new PreviewListPanel();
        previewer = new DisplayPanel();

        listPanel.addItem(ugaJoke);
        listPanel.addItem(haiku);
        listPanel.addItem(almaMater);
        listPanel.addItem(invictus);
        listPanel.addItem(buzz);
        listPanel.addItem(bird);
        add(listPanel, BorderLayout.WEST);
        add(previewer, BorderLayout.CENTER);

        listPanel.addActionListener(new ListListener());
    }
    /**
     * Handles the clicked object
     * and calls the preview() method for the according object
     * @author Neha Singh
     * I collaborated with Lanah Marie Jose and Kelcy Newton
     * @version 1.0
     */
    private class ListListener implements ActionListener {
        /**
         * Shows a preview of a file depending on which was clicked in the list
         * @param ae, the item clicked by the user
         */
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == ugaJoke) {
                previewer.removeAll();
                ugaJoke.preview(previewer);
            } else if (ae.getSource() == haiku) {
                previewer.removeAll();
                haiku.preview(previewer);
            } else if (ae.getSource() == almaMater) {
                previewer.removeAll();
                almaMater.preview(previewer);
            } else if (ae.getSource() == invictus) {
                previewer.removeAll();
                invictus.preview(previewer);
            } else if (ae.getSource() == buzz) {
                previewer.removeAll();
                buzz.preview(previewer);
            } else if (ae.getSource() == bird) {
                previewer.removeAll();
                bird.preview(previewer);
            }
            previewer.revalidate();
            previewer.repaint();
        }
    }
}