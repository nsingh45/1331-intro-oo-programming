import java.text.NumberFormat;
/**
 * This class represents a custom grocery item
 * @author Neha Singh
 * @version 1.0
 */
public class GroceryItem implements Purchasable {
    private static final double FOOD_TAX = 0.0;
    private String name;
    private double price;
    /**
     * Constructor: Creates a new GroceryItem object with a name and price
     * @param itemName, the name of the item
     * @param itemPrice, the price of the item
     */
    public GroceryItem(String itemName, double itemPrice) {
        name = new String(itemName);
        price = itemPrice;
    }
    /**
     * Gets the name of the item
     * @return name, the name of the item
     */
    public String getName() {
        return name;
    }
    /**
     * Gets the price of the item
     * @return price, the price of the item
     */
    public double getPrice() {
        return price;
    }
    /**
     * Calculates and returns the price of the item plus food tax
     * @return the price of the item after tax
     */
    public double getAfterTaxPrice() {
        return (price + (price * FOOD_TAX));
    }
    /**
     * Returns a string containing the name and formatted cost of the item
     * @return a string of the format "[item name] costs $[price]"
     */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name + " costs " + fmt.format(price));
    }
}
