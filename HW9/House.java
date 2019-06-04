import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;

/**
 * Represents a House
 * @author Neha
 * @version 1.0
 */
public abstract class House {
    protected int x, y , speed, age, health;
    protected Image toDraw;
    protected final int maxAge;
    protected Rectangle myBounds;
    /**
     * Constructor: Initializes a House with the given data values
     * and sets the age to 0
     * @param x, the House's x-position in the panel
     * @param y, the House's y-position in the panel
     * @param speed, the House's speed
     * @param maxAge, the maximum age a House can reach before dying
     * @param health, the amount of health a House has
     * @param image, the image drawn to the GUI for a House
     * @param myBounds, the bounding rectangle for this HOuse
     */
    public House(int x, int y, int speed, int maxAge, int health,
            Image image, Rectangle myBounds) {
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.maxAge = maxAge;
        this.health = health;
        this.toDraw = image;
        this.myBounds = myBounds;
        this.age = 0;
    }
    /**
     * Moves the House around the GUI, choosing directions randomly. Does not
     * move if the move will take the House beyond the bounds of the GUI.
     */
    public void move() {
        Random r = new Random();
        int dir = r.nextInt(100);
        //there's gotta be a better way to handle this
        if (dir <= 24 && ((x - speed) > 0)) {
            x -= speed;
        } else if (dir <= 49 && ((y - speed) > 0)) {
            y -= speed;
        } else if (dir <= 74 && ((y + speed) < Westeros.HEIGHT)) {
            y += speed;
        } else if (dir <= 99 && ((x + speed) < Westeros.WIDTH)) {
            x += speed;
        }
        health--;
        age++;
    }
    /**
     * Draws the House's image representation to the GUI
     * @param g, the GUI's Graphics object
     */
    public void draw(Graphics g) {
        g.drawImage(toDraw, x, y, null);
    }
    /**
     * Detects whether this House is colliding with another House
     * @param otherHouse, the other House
     * @return whether this House is overlapping with the other House
     */
    public boolean collidesWithHouse(House otherHouse) {
        Rectangle myRect = this.getRect();
        Rectangle otherRect = otherHouse.getRect();
        return (myRect.intersects(otherRect));
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
     * Destroys a House that this House collides with
     * @param otherHouse, the House this House collides with
     */
    public void destroyHouse(House otherHouse) {
        otherHouse.die();
    }
    /**
     * Indicates whether this House is old and should die
     * @return whether this House's current age has surpassed its maximum age
     */
    public boolean isOld() {
        return (age >= maxAge);
    }
    /**
     * Kills this House
     */
    public void die() {
        health = 0;
    }
    /**
     * Indicates whether this House is dead or not
     * @return whether this House's health equals 0 or not
     */
    public boolean isDead() {
        return (health == 0);
    }
    /**
     * Gets the current Rectangle for this House's image
     * @return the Rectangle this House's image occupies
     */
    public Rectangle getRect() {
        return (new Rectangle(x, y, 90, 60));
    }
}