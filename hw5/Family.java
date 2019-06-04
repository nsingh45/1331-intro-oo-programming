import java.util.Random;
/**
 * This class represents a Family object
 * @author Neha Singh
 * @version 1.0
 */
public class Family {
    private int numM, numF, numTotal;
    private boolean hasM, hasF;
    private String kids = new String();
    /**
     * Creates a Family object with no kids
     * @param
     * @return
     */
    public Family() {
        numM = 0;
        numF = 0;
        numTotal = 0;
        hasM = false;
        hasF = false;
        kids = "";
    }
    /**
     * Makes the family have kids until there is one male and one female child
     * @param
     * @return
     */
    public void wooHoo() {
        String out = new String("");
        String kid = new String("");
        int chance;
        Random rand = new Random();
        while (!hasM || !hasF) {
            chance = rand.nextInt(10) + 1;
            if (chance <= 5) {
                kid = "M";
                numM++;
                numTotal++;
                hasM = true;
            } else if (chance <= 10) {
                kid = "F";
                numF++;
                numTotal++;
                hasF = true;
            }
            out = out + kid;
        }
        kids = out;
    }
    /**
     * Returns the number of male children
     * @param
     * @return numM, the number of male children
     */
    public int getM() {
        return numM;
    }
    /**
     * Returns the number of female children
     * @param
     * @return numF, the number of female children
     */
    public int getF() {
        return numF;
    }
    /**
     * returns the total number of children in the family
     * @param none
     * @return numTotal, the total number of kids in the family
     */
    public int getTotal() {
        return numTotal;
    }
    /**
     * returns a string containing the sex of the children in the family
     * @param
     * @return kids, a string representing the sex of each child
     */
    public String getMembers() {
        return kids;
    }
    /**
     * returns a string representing the values of each instance variable
     * @param
     * @return a string with values of each variable inserted
     */
    public String toString() {
        String out = new String("numM: " + numM + "\n numF: " + numF
        + "\n numTotal: " + numTotal + "\n hasF: " + hasF + "\n hasM: " + hasM
        + "\n kids: " + kids);
        return out;
    }
}