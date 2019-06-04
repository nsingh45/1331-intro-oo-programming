import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;

/**
 * Represents House Lannister
 * @author Neha
 *
 */
public class Lannister extends SouthHouse {

    private static Image myImage = ImageReader.getImageFromFileName("lion.png");
    /**
     * Constructor: Creates a new Lannister with a maximum age of 20
     * and an image
     * of a lion
     * @param x, the Lannister's x-position
     * @param y, the Lannister's y-position
     * @param boundary, the bounding rectangle
     */
    public Lannister(int x, int y, Rectangle boundary) {
        super(x, y, 20, myImage, boundary);
    }
    /**
     * Indicates whether otherHouse is a Baratheon or Lannister and whether
     * this House can reproduce with it
     * @param otherHouse, the House being checked
     * @return whether Lannister can reproduce with otherHouse
     */
    public boolean canReproduceWithHouse(House otherHouse) {
        return (otherHouse instanceof Baratheon)
                || (otherHouse instanceof Lannister);
    }
    /**
     * Indicates whether otherHouse is a Stark or Tully and whether this House
     * can destroy it
     * @param otherHouse, the House being checked
     * @return whether Lannister can destroy otherHouse
     */
    public boolean canDestroyHouse(House otherHouse) {
        return (otherHouse instanceof Stark) || (otherHouse instanceof Tully);
    }
    /**
     * Creates a baby Lannister 1/5 of the time
     * @param otherHouse, the House to reproduce with
     * @return a new Lannister 1/5 of the time and null 4/5 of the time
     */
    public House reproduceWithHouse(House otherHouse) {
        Random r = new Random();
        int toReproduce = r.nextInt(10);
        if (toReproduce == 0) {
            return new Lannister(x, y, myBounds);
        } else {
            return null;
        }
    }
    /**
     * Destroys otherHouse 60% of the time if it is a Stark and 80% of the time
     * if it is a Tully
     * @param otherHouse, the House to be destroyed
     */
    public void destroyHouse(House otherHouse) {
        Random r = new Random();
        int toDestroy = r.nextInt(10);
        if (otherHouse instanceof Stark && toDestroy <= 5) {
            super.destroyHouse(otherHouse);
        } else if (otherHouse instanceof Tully && toDestroy <= 7) {
            super.destroyHouse(otherHouse);
        }
    }

}
