import java.text.NumberFormat;
import java.util.Scanner;
/**
 * Allows users to interact with a virtual grocery store via command-line input
 * @author Neha
 * @version 1.0
 */
public class GroceryStore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        System.out.println("Welcome to the grocery store!");
        ShoppingCart cart = new ShoppingCart(10);
        String toContinue = new String("");
        String whichItem = new String("");
        do {
            System.out.println("You have " + cart.getItemsInCart()
                    + "/" + cart.getMaxItems() + " items in your cart");
            System.out.println("Subtotal: " + fmt.format(cart.subtotal())
                    + " and " + fmt.format(cart.total()) + " with tax");
            System.out.println(cart);
            if (!cart.isFull()) {
                System.out.println("Press [1] for the Deli, [2] for a custom "
                        + "item, 'c' to clear cart, or 'q' to quit");
                toContinue = s.nextLine();
                if (toContinue.equals("1")) {
                    while (!whichItem.equals("1") && !whichItem.equals("2")
                            && !whichItem.equals("3")) {
                        System.out.println("What item would you like to buy?");
                        System.out.println("[1] Turkey sandwich \t "
                                + "[2] Fancy cheese \t [3] Chicken wings");
                        whichItem = s.nextLine();
                        if (whichItem.equals("1")) {
                            cart.addItem(DeliFood.createTurkeySandwich());
                        } else if (whichItem.equals("2")) {
                            cart.addItem(DeliFood.createFancyCheese());
                        } else if (whichItem.equals("3")) {
                            cart.addItem(DeliFood.createChickenWings());
                        } else {
                            System.out.println("Invalid input. Try again.");
                        }
                    }
                    whichItem = "0";
                } else if (toContinue.equals("2")) {
                    System.out.println("Enter the name of your item: ");
                    String itemName = s.nextLine();
                    System.out.println("Enter the pre-tax price "
                            + "of your item: ");
                    String itemPrice = s.nextLine();
                    GroceryItem customItem = new GroceryItem(itemName,
                            Double.parseDouble(itemPrice));
                    cart.addItem(customItem);
                } else if (toContinue.equalsIgnoreCase("c")
                        || toContinue.equalsIgnoreCase("q")) {
                    cart.emptyCart();
                } else {
                    System.out.println("Invalid input. Try again.");
                }
            } else {
                System.out.println("Cart full. Enter 'c' to clear cart "
                        + "or 'q' to quit");
                toContinue = s.nextLine();
                if (toContinue.equalsIgnoreCase("c")
                        || toContinue.equalsIgnoreCase("q")) {
                    cart.emptyCart();
                } else {
                    System.out.println("Invalid input. Try again.");
                }
            }

        } while (!toContinue.equalsIgnoreCase("q"));
    }
}
