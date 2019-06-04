import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;

/**
 * Represents House Targaryen
 * @author Neha
 *
 */
public class Targaryan extends House {
    private static Image myImage =
            ImageReader.getImageFromFileName("dragon.png");
    /**
     * Constructor: Creates a new Targaryen with speed 6, max health 1,
     * health 1, and an image of a dragon
     * @param x, the Targaryen's x position
     * @param y, the Targaryen's y position
     * @param boundary, the bounding rectangle
     */
    public Targaryan(int x, int y, Rectangle boundary) {
        super(x, y, 6, 1, 1, myImage, boundary);
    }
    /**
     * Ensures the Targaryen's health does not change, then moves normally
     */
    public void move() {
        health++;
        super.move();
    }
    /**
     * Makes sure Targaryens never die of old age
     * @return false
     */
    public boolean isOld() {
        return false;
    }
    /**
     * Indicates whether otherHouse is a Targaryen and whether this House
     * can reproduce with it
     * @param otherHouse, the House being checked
     * @return whether Targaryen can reproduce with otherHouse
     */
    public boolean canReproduceWithHouse(House otherHouse) {
        return (otherHouse instanceof Targaryan);
    }
    /**
     * Indicates whether otherHouse is not a Baratheon or Targaryen and whether
     * Targaryen can destroy it
     * @param otherHouse, the House being checked
     * @return whether Targaryen can destroy otherHouse
     */
    public boolean canDestroyHouse(House otherHouse) {
        return !((otherHouse instanceof Baratheon)
                || (otherHouse instanceof Targaryan));
    }
    /**
     * Creates a baby Targaryen 1/5 of the time
     * @param otherHouse, the House to reproduce with
     * @return a new Targaryen 1/5 of the time and null 4/5 of the time
     */
    public House reproduceWithHouse(House otherHouse) {
        Random r = new Random();
        int toReproduce = r.nextInt(10);
        if (toReproduce == 0) {
            return new Targaryan(x, y, myBounds);
        } else {
            return null;
        }
    }

}
