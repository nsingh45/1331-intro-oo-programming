import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JPanel;
/**
 * Creates a panel that holds buttons that create vehicles that the user can
 * test-drive
 * @author Neha
 * @version 1.0
 */
public class TestDrivePanel extends JPanel {

    private JButton makeTruck, makeFerrari, makeYacht, makeSailBoat;
    private Vehicle v;
    /**
     * Constructor: creates buttons and adds listeners to them, as well as
     * the keyboard listener
     */
    public TestDrivePanel() {
        ButtonListener listener = new ButtonListener();
        DriveListener keyThing = new DriveListener();
        this.addKeyListener(keyThing);
        this.setFocusable(true);
        setPreferredSize(new Dimension(500, 500));
        makeTruck = new JButton("Truck");
        makeFerrari = new JButton("Ferrari");
        makeYacht = new JButton("Yacht");
        makeSailBoat = new JButton("Sailboat");
        makeTruck.setFocusable(false);
        makeFerrari.setFocusable(false);
        makeYacht.setFocusable(false);
        makeSailBoat.setFocusable(false);
        this.add(makeTruck);
        this.add(makeFerrari);
        this.add(makeYacht);
        this.add(makeSailBoat);
        makeTruck.addActionListener(listener);
        makeFerrari.addActionListener(listener);
        makeYacht.addActionListener(listener);
        makeSailBoat.addActionListener(listener);
    }
    /**
     * Overrides the paintComponent method to have it draw whichever vehicle
     * is selected by the user
     * @param g, the panel's graphics object
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (v != null) {
            v.draw(g);
        }
    }
    /**
     * Changes the vehicle on the screen corresponding to which button is pushed
     * @author Neha Singh
     * @version 1.0
     */
    private class ButtonListener implements ActionListener {
        /**
         * Takes the button event that occurs and creates a vehicle accordingly
         * @param ae, the action event
         */
        public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == makeTruck) {
                v = new Truck();
            } else if (ae.getSource() == makeFerrari) {
                v = new Ferrari();
            } else if (ae.getSource() == makeYacht) {
                v = new Yacht();
            } else if (ae.getSource() == makeSailBoat) {
                v = new SailBoat();
            }
            repaint();
        }
    }
    /**
     * Takes keyboard input and moves the vehicle on screen accordingly
     * @author Neha Singh
     * @version 1.0
     */
    private class DriveListener implements KeyListener {
        public void keyTyped(KeyEvent ke) {

        }
        /**
         * Takes the key event and moves the vehicle accordingly
         * @param ke, the KeyEvent generated by the pressed key
         */
        public void keyPressed(KeyEvent ke) {
            v.move(ke.getKeyChar());
            repaint();
        }
        public void keyReleased(KeyEvent ke) {

        }
    }
}
