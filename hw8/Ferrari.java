import java.util.Random;

/**
 * Creates a Ferrari, a special kind of Car object
 * @author Neha
 * @version 1.0
 */
public class Ferrari extends Car {
    /**
     * Constructor: creates a Ferrari with a default speed of 3 and
     * provides an image for the parent's draw() method
     */
    public Ferrari() {
        super(3);
        toDraw = ImageReader.getImageFromFileName("ferrari.jpg");
    }
    /**
     * A boolean that returns true 5% of the time, representing the 5%
     * chance the Ferrari will increase its speed by 1
     * @return num == 0, true if the Ferrari increases its speed
     */
    public boolean increaseSpeed() {
        Random rand = new Random();
        int num = rand.nextInt(20);
        return num == 0;
    }
    /**
     * Overrides the parent's move() behavior to allow the Ferrari
     * to increase its speed
     * @param keyPressed, the key the user pressed
     */
    public void move(char keyPressed) {
        if (increaseSpeed()) {
            speed++;
        }
        super.move(keyPressed);
    }

}
