import java.util.Random;

/**
 * Creates a Truck, a special kind of Car object that moves slowly and breaks
 * down 1% of the time
 * @author Neha
 * @version 1.0
 */
public class Truck extends Car {
    /**
     * Constructor: creates a Truck object with a speed of 1 and passes
     * the parent's draw() method the correct image
     */
    public Truck() {
        super(1);
        toDraw = ImageReader.getImageFromFileName("truck.jpg");
    }
    /**
     * Boolean representing whether the truck is broken and cannot move
     * @return chance == 0, the 1% chance the truck breaks down
     */
    public boolean isBroken() {
        Random rand = new Random();
        int chance = rand.nextInt(100);
        return (chance == 0);
    }
    /**
     * Overrides the parent's move() method to allow the truck to be broken
     */
    public void move(char keyPressed) {
        if (!isBroken()) {
            super.move(keyPressed);
        } else {
            speed = 0;
        }
    }
}
