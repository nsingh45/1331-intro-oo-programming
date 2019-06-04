/**
 * Allows objects to be defined by a set of characteristics
 * common to all purchasable items
 * @author Neha Singh
 * @version 1.0
 */
public interface Purchasable {
    double SALES_TAX = 0.05;
    String getName();
    double getPrice();
    double getAfterTaxPrice();
}
