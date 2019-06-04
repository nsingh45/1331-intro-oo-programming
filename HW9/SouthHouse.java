import java.awt.Image;
import java.awt.Rectangle;

/**
 * Represents a House from the South
 * @author Neha
 *
 */
public abstract class SouthHouse extends House {
    /**
     * Constructor: Creates a new SouthHouse with speed 6 and health 50
     * @param x, the SouthHouse's x-position
     * @param y, the SouthHouse's y-position
     * @param maxAge, the maximum age the SouthHouse can reach before dying
     * @param image, the image representation of this SouthHouse
     * @param myBounds, the bounding Rectangle for this SouthHouse
     */
    public SouthHouse(int x, int y, int maxAge, Image image,
            Rectangle myBounds) {
        super(x, y, 6, maxAge, 50, image, myBounds);
    }
    /**
     * Doubles this SouthHouse's speed if it is in the South, then
     * moves normally
     */
    public void move() {
        if (inSouth()) {
            speed = 12;
        } else {
            speed = 6;
        }
        super.move();
    }
    /**
     * Determines whether this SouthHouse is in the south
     * @return whether the y-position is in the south half of the GUI
     */
    public boolean inSouth() {
        return (y >= 300);
    }
    /**
     * Indicates whether this House can reproduce with the House it collides
     * with
     * This is an abstract method that must be overridden
     * @param otherHouse, the House this House collides with
     * @return whether this House and otherHouse can reproduce
     */
    public abstract boolean canReproduceWithHouse(House otherHouse);
    /**
     * Indicates whether this House can destroy the House it collides with
     * This is an abstract method that must be overridden
     * @param otherHouse, the other House
     * @return whether this House can destroy otherHouse
     */
    public abstract boolean canDestroyHouse(House otherHouse);
    /**
     * Returns the child of this House and otherHouse
     * This is an abstract method that must be overridden
     * @param otherHouse, the other House
     * @return a House of the same class as the calling class
     */
    public abstract House reproduceWithHouse(House otherHouse);
}
