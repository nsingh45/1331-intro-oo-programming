import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;

/**
 * Represents House Stark
 * @author Neha
 * @version 1.0
 */
public class Stark extends NorthHouse {

    private static Image myImage =
            ImageReader.getImageFromFileName("direwolf.png");
    /**
     * Constructor: Creates a new Stark with a maximum age of 40 and an image
     * of a direwolf
     * @param xPos, the Stark's x-position
     * @param yPos, the Stark's y-position
     * @param boundary, the bounding rectangle
     */
    public Stark(int xPos, int yPos, Rectangle boundary) {
        super(xPos, yPos, 40, myImage, boundary);
    }
    /**
     * Indicates whether this House can reproduce with the House it
     * collides with
     * @param otherHouse, the other House
     * @return whether otherHouse is a Tully and Stark can reproduce with it
     */
    public boolean canReproduceWithHouse(House otherHouse) {
        return (otherHouse instanceof Tully);
    }
    /**
     * Indicates whether this House can destroy the House it collides with
     * @param otherHouse, the House this House collides with
     * @return whether otherHouse is a Lannister and Stark can destroy it
     */
    public boolean canDestroyHouse(House otherHouse) {
        return (otherHouse instanceof Lannister);
    }
    /**
     * Creates a baby Stark 1/5 of the time
     * @param otherHouse, the House to reproduce with
     * @return a new Stark 1/5 of the time and null 4/5 of the time
     */
    public House reproduceWithHouse(House otherHouse) {
        Random r = new Random();
        int toReproduce = r.nextInt(10);
        if (toReproduce == 0) {
            return (new Stark(x, y, myBounds));
        } else {
            return null;
        }
    }
    /**
     * Destroys otherHouse 25% of the time
     * @param otherHouse, the House to be destroyed
     */
    public void destroyHouse(House otherHouse) {
        Random r = new Random();
        int toDestroy = r.nextInt(10);
        if (toDestroy <= 3) {
            super.destroyHouse(otherHouse);
        }
    }

}
