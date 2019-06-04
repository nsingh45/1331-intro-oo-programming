import java.text.NumberFormat;
/**
 * This class represents a premade deli item in the grocery store
 * @author Neha Singh
 * @version 1.0
 */
public class DeliFood implements Purchasable {
    private String name;
    private double price;
    /**
     * Constructor: Creates a new DeliFood object with a name and price
     * @param itemName, the name of the item
     * @param itemPrice, the price of the item
     */
    private DeliFood(String itemName, double itemPrice) {
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
     * Calculates and returns the price of the item with sales tax
     * @return the price of the item after tax
     */
    public double getAfterTaxPrice() {
        return (price + (price * SALES_TAX));
    }
    /**
     * A string containing the name and formatted cost of the item
     * @return a string of the format "Premade [item name] costs $[price]"
     */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return ("Premade " + name + " costs " + fmt.format(price));
    }
    /**
     * Creates a turkey sandwich, a DeliFood object with a preset name and price
     * @return the DeliFood object representing the sandwich
     */
    static DeliFood createTurkeySandwich() {
        return new DeliFood("Turkey Sandwich", 5.00);
    }
    /**
     * Creates fancy cheese, a DeliFood object with a preset name and price
     * @return the DeliFood object representing the cheese
     */
    static DeliFood createFancyCheese() {
        return new DeliFood("Fancy Cheese", 10.50);
    }
    /**
     * Creates chicken wings, a DeliFood object with a preset name and price
     * @return the DeliFood object representing the wings
     */
    static DeliFood createChickenWings() {
        return new DeliFood("Chicken Wings", 7.25);
    }
}
