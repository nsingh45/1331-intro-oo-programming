import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;

/**
 * Represents House Baratheon
 * @author Neha
 * @version 1.0
 */
public class Baratheon extends SouthHouse {

    private static Image myImage = ImageReader.getImageFromFileName("stag.png");
    /**
     * Constructor: Creates a new Baratheon with a maximum age of 30
     * and an image
     * of a stag
     * @param x, the Baratheon's x-position
     * @param y, the Baratheon's y-position
     * @param boundary, the bounding rectangle
     */
    public Baratheon(int x, int y, Rectangle boundary) {
        super(x, y, 30, myImage, boundary);
    }
    /**
     * Indicates whether otherHouse is a Lannister and whether this House
     * can reproduce with it
     * @param otherHouse, the House being checked
     * @return whether Baratheon can reproduce with otherHouse
     */
    public boolean canReproduceWithHouse(House otherHouse) {
        return (otherHouse instanceof Lannister);
    }
    /**
     * Indicates whether otherHouse is a Targaryen and whether this House
     * can destroy it
     * @param otherHouse, the House being checked
     * @return whether Baratheon can destroy otherHouse
     */
    public boolean canDestroyHouse(House otherHouse) {
        return (otherHouse instanceof Targaryan)
                || (otherHouse instanceof Greyjoy);
    }
    /**
     * Creates a baby Baratheon 1/5 of the time
     * @param otherHouse, the House to reproduce with
     * @return a new Baratheon 1/5 of the time and null 4/5 of the time
     */
    public House reproduceWithHouse(House otherHouse) {
        Random r = new Random();
        int toReproduce = r.nextInt(10);
        if (toReproduce == 0) {
            return new Baratheon(x, y, myBounds);
        } else {
            return null;
        }
    }

}
