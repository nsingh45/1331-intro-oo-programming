/**
 * Defines a NoItemException, an exception thrown when the user tries to
 * access elements of an empty stack
 * @author Neha
 * @version 1.0
 */
public class NoItemException extends Exception {
    /**
     * Constructor: Creates a new NoItemException and passes it a message
     * to display to the user
     * @param reason, what the exception will print in the console
     */
    public NoItemException(String reason) {
        super(reason);
    }
}
