import java.awt.Image;
import java.awt.Rectangle;

/**
 * Represents a House from the North
 * @author Neha
 * @version 1.0
 */
public abstract class NorthHouse extends House {

    /**
     * Constructor: Creates a new NorthHouse with speed 6 and health 50
     * @param x, the NorthHouse's x-position
     * @param y, the NorthHouse's y-position
     * @param maxAge, the maximum age the NorthHouse can reach before dying
     * @param image, the image representation of this NorthHouse
     * @param myBounds, the bounding Rectangle for this NorthHouse
     */
    public NorthHouse(int x, int y, int maxAge, Image image,
            Rectangle myBounds) {
        super(x, y, 6, maxAge, 50, image, myBounds);
    }
    /**
     * Applies health boost if this NorthHouse is in the north section of the
     * GUI, then moves normally
     */
    public void move() {
        if (inNorth()) {
            health++;
        }
        super.move();
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
    /**
     * Indicates whether this NorthHouse is in the north half of the GUI
     * @return whether the y-position is in the north half of the GUI
     */
    public boolean inNorth() {
        return (y <= 300);
    }
}
