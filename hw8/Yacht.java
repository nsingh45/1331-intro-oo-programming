import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/**
 * Creates a boat with the characteristics of a yacht
 * @author Neha Singh
 * @version 1.0
 */
public class Yacht extends Boat {
    /**
     * Constructor: creates a yacht, a boat with speed 2
     */
    public Yacht() {
        super(2);
    }
    /**
     * Returns true 15% of the time when the yacht skips 10 units
     * @return rand.nextInt(100) <= 14, whether the yacht skips
     */
    public boolean skip() {
        Random rand = new Random();
        return rand.nextInt(100) <= 14;
    }
    /**
     * Draws a yacht with a white Y on top of the parent's black rectangle
     * @param g, the graphics object
     */
    public void draw(Graphics g) {
        super.draw(g);
        g.setColor(Color.white);
        g.drawString("Y", x + 10, y + 15);
    }
    /**
     * Moves the yacht so it skips 15% of the time
     * @param keyPressed, the key pressed by the user
     */
    public void move(char keyPressed) {
        if (skip()) {
            if (keyPressed == 'a') {
                x -= 10;
            } else if (keyPressed == 'd') {
                x += 10;
            }
        }
        super.move(keyPressed);
    }
}
