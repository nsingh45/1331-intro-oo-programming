/**
 * Represents a stack, a certain kind of dynamic data structure
 * @author Neha Singh
 * @version 1.0
 * @param <E>, the abstract data type the stack holds
 */
public class MyStack<E> {
    private Node head;
    private static int nodeCounter = 0;
    /**
     * Constructor: Creates a new MyStack and creates the first node to hold
     * the data in the parameter
     * @param initialData, the first value passed in to the stack
     */
    public MyStack(E initialData) {
        head = new Node(initialData, null);
    }
    /**
     * Puts a new element on to the stack, wrapping it in a node
     * which points back to the last value passed to the stack
     * @param data, the data the new node contains
     */
    public void push(E data) {
        Node n = new Node(data, head);
        head = n;
    }
    /**
     * Takes the last node added and removes it from the stack, returning
     * the data stored in that node
     * @return E, the data stored in the node popped off the stack
     * @throws NoItemException, an exception indicating if there are
     * no items left on the stack
     */
    public E pop() throws NoItemException {
        if (isEmpty()) {
            throw new NoItemException("No items left on the stack");
        } else {
            Node n = head;
            head = head.getNext();
            return n.getInfo();
        }
    }
    /**
     * Checks whether the stack is empty
     * @return whether the stack has a first node
     */
    public boolean isEmpty() {
        return (head == null);
    }
    /**
     * Prints a top-down view of the stack for debugging purposes
     * @return a String representation of the stack
     */
    public String viewStack() {
        return head.toString();
    }
    /**
     * Wraps the data given to the stack
     * @author Neha
     * @version 1.0
     */
    private class Node {
        private E info;
        private Node next;
        private int number = 0;
        /**
         * Constructor: Creates a new Node and numbers it
         * @param info, the data to be stored in the Node
         * @param next, the Node this Node links to
         */
        public Node(E info, Node next) {
            this.info = info;
            this.next = next;
            nodeCounter++;
            this.number = nodeCounter;
        }
        /**
         * Returns the Node below this Node
         * @return this.next, the Node this Node links to
         */
        public Node getNext() {
            return this.next;
        }
        /**
         * Returns the information stored in this Node
         * @return info, the information stored in this node
         */
        public E getInfo() {
            return info;
        }
        /**
         * Returns a String representation of all linked nodes
         * @return the String
         */
        public String toString() {
            return ("Node number: " + this.number + "\n"
                    + "Info: " + this.info + "\n"
                    + "Points to: " + this.next);
        }
    }
}