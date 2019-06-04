import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;

/**
 * Represents House Tully
 * @author Neha
 * @version 1.0
 */
public class Tully extends NorthHouse {

    private static Image myImage =
            ImageReader.getImageFromFileName("trout.png");
    /**
     * Constructor: Creates a new Tully with a maximum age of 50 and an image
     * of a trout
     * @param xPos, the Tully's x-position
     * @param yPos, the Tully's y-position
     * @param boundary, the bounding rectangle
     */
    public Tully(int xPos, int yPos, Rectangle boundary) {
        super(xPos, yPos, 50, myImage, boundary);
    }
    /**
     * Indicates whether this House can reproduce with the House it
     * collides with
     * @param otherHouse, the other House
     * @return whether otherHouse is a Stark and Tully can reproduce with it
     */
    public boolean canReproduceWithHouse(House otherHouse) {
        return (otherHouse instanceof Stark);
    }
    /**
     * Indicates whether this House can destroy the House it collides with
     * @param otherHouse, the House this House collides with
     * @return whether otherHouse is a Lannister and Tully can destroy it
     */
    public boolean canDestroyHouse(House otherHouse) {
        return (otherHouse instanceof Lannister);
    }
    /**
     * Creates a baby Tully 1/5 of the time
     * @param otherHouse, the House to reproduce with
     * @return a new Tully 1/5 of the time and null 4/5 of the time
     */
    public House reproduceWithHouse(House otherHouse) {
        Random r = new Random();
        int toReproduce = r.nextInt(10);
        if (toReproduce == 0) {
            return (new Tully(x, y, myBounds));
        } else {
            return null;
        }
    }
    /**
     * Destroys otherHouse 20% of the time
     * @param otherHouse, the House to be destroyed
     */
    public void destroyHouse(House otherHouse) {
        Random r = new Random();
        int toDestroy = r.nextInt(10);
        if (toDestroy <= 1) {
            super.destroyHouse(otherHouse);
        }
    }

}
