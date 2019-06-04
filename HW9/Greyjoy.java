import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;

/**
 * Represents House Greyjoy
 * @author Neha
 * @version 1.0
 */
public class Greyjoy extends House {
    private static Image myImage =
            ImageReader.getImageFromFileName("kraken.jpg");
    /**
     * Constructor: Creates a new Greyjoy with speed 3, max age 25,
     * health 30, and an image of a kraken
     * @param x, the Greyjoy's x position
     * @param y, the Greyjoy's y position
     * @param boundary, the bounding rectangle
     */
    public Greyjoy(int x, int y, Rectangle boundary) {
        super(x, y, 3, 25, 30, myImage, boundary);
    }
    /**
     * Indicates whether otherHouse is a Greyjoy and whether this House
     * can reproduce with it
     * @param otherHouse, the House being checked
     * @return whether Greyjoy can reproduce with otherHouse
     */
    public boolean canReproduceWithHouse(House otherHouse) {
        return (otherHouse instanceof Greyjoy);
    }
    /**
     * Indicates whether otherHouse is a Stark or Greyjoy and whether
     * Greyjoy can destroy it
     * @param otherHouse, the House being checked
     * @return whether Greyjoy can destroy otherHouse
     */
    public boolean canDestroyHouse(House otherHouse) {
        return (otherHouse instanceof Stark)
                || (otherHouse instanceof Greyjoy);
    }
    /**
     * Creates a baby Greyjoy 60% of the time
     * @param otherHouse, the House to reproduce with
     * @return a new Greyjoy 60% of the time and null 40% of the time
     */
    public House reproduceWithHouse(House otherHouse) {
        Random r = new Random();
        int toReproduce = r.nextInt(10);
        if (toReproduce <= 5) {
            return new Greyjoy(x, y, myBounds);
        } else {
            return null;
        }
    }
    /**
     * Destroys otherHouse 20% of the time if it is a Stark and 10%
     * of the time if it is a Greyjoy
     * @param otherHouse, the House to be destroyed
     */
    public void destroyHouse(House otherHouse) {
        Random r = new Random();
        int toDestroy = r.nextInt(10);
        if (otherHouse instanceof Stark && toDestroy <= 1) {
            super.destroyHouse(otherHouse);
        } else if (otherHouse instanceof Greyjoy && toDestroy == 0) {
            super.destroyHouse(otherHouse);
        }
    }
}
