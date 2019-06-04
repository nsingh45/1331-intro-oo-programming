import java.awt.Graphics;
import java.awt.Image;

/**
 * Implements methods of abstract class Vehicle in accordance with a Car
 * @author Neha Singh
 * @version 1.0
 */
public class Car extends Vehicle {
    protected Image toDraw;
    /**
     * Constructor: Creates a Car at position 150,150 with
     * speed inherited from a subclass
     * @param speed, the speed of the car
     */
    public Car(int speed) {
        super(150, 150, speed);
    }
    /**
     * Draws a graphical representation of the Car
     * @param g, the Graphics object used
     */
    public void draw(Graphics g) {
        g.drawImage(toDraw, x, y, null);
    }
    /**
     * Tells the car how it should change its position depending on which
     * key the user pressed
     * @param keyPressed, a char representing the key the user pressed
     */
    public void move(char keyPressed) {
        if (keyPressed == 'a') {
            x -= speed;
        } else if (keyPressed == 'w') {
            y -= speed;
        } else if (keyPressed == 's') {
            y += speed;
        } else if (keyPressed == 'd') {
            x += speed;
        }
    }
}
