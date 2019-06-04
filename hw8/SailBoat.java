import java.awt.Color;
import java.awt.Graphics;

/**
 * Creates a boat with the characteristics of a sailbost
 * @author Neha Singh
 * @version 1.0
 */
public class SailBoat extends Boat {
    /**
     * Constructor: Creates a sailboat as a boat with speed 1
     */
    public SailBoat() {
        super(1);
    }
    /**
     * Draws the sailboat with a red rectangle on top of the black rectangle
     * given by the parent
     * @param g, the graphics object
     */
    public void draw(Graphics g) {
        super.draw(g);
        g.setColor(Color.red);
        g.fillRect(x + 5, y - 10, 20, 10);
    }
}
