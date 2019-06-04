/**
 * This class represents a shopping cart that holds all the user's items
 * and calculates their total cost
 * @author Neha Singh
 * @version 1.0
 */
public class ShoppingCart {
    private Purchasable[] items;
    private static int numItems;
    /**
     * Constructor: Creates a new shopping cart with a certain capacity
     * @param max, the maximum capacity of the cart
     */
    public ShoppingCart(int max) {
        items = new Purchasable[max];
        numItems = 0;
    }
    /**
     * Adds an item to the cart
     * @param foodItem, the item to be added to the cart
     * @return true if the item was added successfully and false if it was not
     */
    public boolean addItem(Purchasable foodItem) {
        if (numItems < items.length) {
            items[numItems] = foodItem;
            numItems++;
            return true;
        } else {
            return false;
        }
    }
    /**
     * Removes all items from the cart and returns it to its original state
     * upon creation
     */
    public void emptyCart() {
        items = new Purchasable[items.length];
        numItems = 0;
    }
    /**
     * Gets the capacity of the cart
     * @return the capacity of the cart
     */
    public int getMaxItems() {
        return items.length;
    }
    /**
     * Calculates and returns the subtotal (without tax) of
     * all the items in the cart
     * @return cost, the total pre-tax cost of all the items in the cart
     */
    public double subtotal() {
        double cost = 0;
        for (int i = 0; i < numItems; i++) {
            cost = cost + items[i].getPrice();
        }
        return cost;
    }
    /**
     * Calculates and returns the total (after-tax) cost of all the items
     * in the cart
     * @return cost, the total after-tax cost of all the items in the cart
     */
    public double total() {
        double cost = 0;
        for (int i = 0; i < numItems; i++) {
            cost = cost + items[i].getAfterTaxPrice();
        }
        return cost;
    }
    /**
     * Checks if the cart is full
     * @return true if the cart is full and false if it is not
     */
    public boolean isFull() {
        return (numItems == items.length);
    }
    /**
     * Checks if the cart is empty
     * @return true if the cart is empty and false if it is not
     */
    public boolean isEmpty() {
        return (numItems == 0);
    }
    /**
     * Creates a list of names and prices of items in the cart
     * @return list, the list of names and prices of items in the cart
     */
    public String toString() {
        String list = new String("");
        for (int i = 0; i < numItems; i++) {
            list = list + items[i].toString() + " \n";
        }
        return list;
    }
    /**
     * Gets the number of items in the cart
     * @return numItems, the number of items in the cart
     */
    public int getItemsInCart() {
        return numItems;
    }
}