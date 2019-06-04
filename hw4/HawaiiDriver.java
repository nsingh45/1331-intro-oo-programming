import java.util.Scanner;
/**Welcomes people to Hawaii and fixes their names to be Hawaiian accordingly
 *@author Neha Singh
 *@version 1
 */
public class HawaiiDriver {
    public static void main(String[] args) {
        String possibleName, fixedName, cont = new String();
        char toContinue = 'y';
        Hawaii h = new Hawaii();
        Scanner s = new Scanner(System.in);
        while (toContinue == 'y' || toContinue == 'Y') {
            System.out.println("Input possible name: ");
            possibleName = s.nextLine();
            if (h.isValid(possibleName)) {
                System.out.println(h.chooseString() + possibleName);
            } else {
                System.out.println("Not Hawaiian enough. Fixing...");
                fixedName = h.fixName(possibleName);
                System.out.println("Your Hawaiian name is " + fixedName);
                System.out.println(h.chooseString() + fixedName);
            }
            System.out.println("Try again? (Y/n)");
            cont = s.nextLine();
            cont = cont.toLowerCase();
            toContinue = cont.charAt(0);
        }
    }
}