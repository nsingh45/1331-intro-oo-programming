import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.util.Random;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * Creates a panel that generates random colors, puts their RGB values
 * in text boxes, and also accepts user input to those text boxes
 * and displays those colors.
 * @author Neha Singh
 * @version 1.0
 */
public class ColorChooserPanel extends JPanel {
    private int r, g, b;
    private JTextField redField, greenField, blueField;
    private JButton randomizer;
    /**
     * Constructor: sets up buttons and text fields and puts them in
     * the panel
     * @param
     * @return
     */
    public ColorChooserPanel() {
        r = 0;
        g = 0;
        b = 0;
        setPreferredSize(new Dimension(600, 300));
        JLabel redLabel = new JLabel("Red: ");
        this.add(redLabel);

        redField = new JTextField(10);
        redField.setText(Integer.toString(r));
        this.add(redField);
        redField.addActionListener(new RandListener());

        JLabel greenLabel = new JLabel("Green: ");
        this.add(greenLabel);

        greenField = new JTextField(10);
        greenField.setText(Integer.toString(g));
        this.add(greenField);
        greenField.addActionListener(new RandListener());

        JLabel blueLabel = new JLabel("Blue: ");
        this.add(blueLabel);

        blueField = new JTextField(10);
        blueField.setText(Integer.toString(b));
        this.add(blueField);
        blueField.addActionListener(new RandListener());

        randomizer = new JButton("Random Color");
        this.add(randomizer);
        randomizer.addActionListener(new RandListener());
    }
    /**
     * Paints the rectangle with the given color
     * @param page, a Graphics object
     * @return
     */
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        Color c = new Color(r, g, b);
        page.setColor(c);
        page.fillRect(200, 50, 200, 200);
    }
    /**
     * Accepts user input to the text boxes and button, and
     * passes those values to the paintComponent accordingly
     * @author Neha Singh
     * @version 1.0
     */
    private class RandListener implements ActionListener {
        /**
         * Receives an action from a text box or button and manipulates
         * the color displayed
         * @param e, the action performed by the user
         * @return
         */
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == randomizer) {
                Random rand = new Random();
                r = rand.nextInt(256);
                g = rand.nextInt(256);
                b = rand.nextInt(256);
                redField.setText(Integer.toString(r));
                greenField.setText(Integer.toString(g));
                blueField.setText(Integer.toString(b));
            }
            if (e.getSource() == redField) {
                int checkr = Integer.parseInt(redField.getText());
                if (checkr <= 255) {
                    r = checkr;
                }
            }
            if (e.getSource() == greenField) {
                int checkg = Integer.parseInt(greenField.getText());
                if (checkg <= 255) {
                    g = checkg;
                }
            }
            if (e.getSource() == blueField) {
            int checkb = Integer.parseInt(blueField.getText());
            if (checkb <= 255) {
                b = checkb;
                }
            }
            repaint();
        }
    }
}