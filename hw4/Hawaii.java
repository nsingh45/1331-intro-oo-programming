import java.util.Random;
/**
 *Defines a Hawaii class
 *@author Neha Singh
 *@version 1
 */
public class Hawaii {
    /**
     *Takes in a name and returns a boolean telling whether it is
     *a valid hawaiian name
     *@param in the name
     *@return whether it is a valid hawaiian name
     */
    public boolean isValid(String in) {
        boolean checker = true;
        in = in.toLowerCase();
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) != 'a' && in.charAt(i) != 'e'
                && in.charAt(i) != 'i' && in.charAt(i) != 'o'
                && in.charAt(i) != 'u' && in.charAt(i) != 'k'
                && in.charAt(i) != 'l' && in.charAt(i) != 'h'
                && in.charAt(i) != 'm' && in.charAt(i) != 'n') {
                checker = false;
            }
        }
        return checker;
    }
    /**
     *Chooses a welcome string to display
     *@param
     *@return the chosen string
     */
    public String chooseString() {
        String welcome = new String();
        Random r = new Random();
        int rand = r.nextInt(10) + 1;
        if (rand <= 5) {
            welcome = "Aloha, ";
        } else if (rand <= 8) {
            welcome = "Welcome to Hawaii, ";
        } else if (rand <= 10) {
            welcome = "E komo mai, ";
        }
        return welcome;
    }
    /**
     *Takes in a non-Hawaiian name and removes the non-Hawaiian letters
     *@param in the name
     *@return out the fixed name
     */
    public String fixName(String in) {
        String out = new String();
        for (int i = 0; i < in.length(); i++) {
            if (in.charAt(i) == 'a' || in.charAt(i) == 'e'
                || in.charAt(i) == 'i' || in.charAt(i) == 'o'
                || in.charAt(i) == 'u' || in.charAt(i) == 'k'
                || in.charAt(i) == 'l' || in.charAt(i) == 'h'
                || in.charAt(i) == 'm' || in.charAt(i) == 'n'
                || in.charAt(i) == 'A' || in.charAt(i) == 'E'
                || in.charAt(i) == 'I' || in.charAt(i) == 'O'
                || in.charAt(i) == 'U' || in.charAt(i) == 'K'
                || in.charAt(i) == 'L' || in.charAt(i) == 'H'
                || in.charAt(i) == 'M' || in.charAt(i) == 'N') {
                out = out + in.charAt(i);
            }
        }
        return out;
    }
}