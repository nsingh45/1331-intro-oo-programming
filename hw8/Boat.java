import java.awt.Graphics;
import java.util.Random;

/**
 * Creates a vehicle with the characteristics of a boat (starts at 150,300;
 * drawn with a black rectangle and only takes user input to move sideways)
 * @author Neha Singh
 * @version 1.0
 */
public class Boat extends Vehicle {
    /**
     * Constructor: Creates a Boat object at position 150,300 and speed
     * given from subclass
     * @param speed, the speed of the boat
     */
    public Boat(int speed) {
        super(150, 300, speed);
    }
    /**
     * Implements the parent's draw() method to create a black rectangle
     * @param g, a graphics object
     */
    public void draw(Graphics g) {
        g.fillRect(x, y, 50, 30);
    }
    /**
     * Implements the move() method such that the boat moves in the x direction
     * according to user input and 10% of the time moves up or down
     * @param keyPressed, the key pressed by the user
     */
    public void move(char keyPressed) {
        Random rand = new Random();
        if (keyPressed == 'a') {
            x -= speed;
        } else if (keyPressed == 'd') {
             x += speed;
        }
        if (rand.nextInt(10) == 0) {
            if (rand.nextBoolean()) {
                y++;
            } else {
                y--;
            }
        }
    }
}
