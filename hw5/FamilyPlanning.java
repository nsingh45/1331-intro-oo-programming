import java.util.Scanner;
/**
 * Simulates a given number of families and returns data about how many
 * kids they would need to have to have one male and one female child
 * @author Neha Singh
 * @version 1.0
 */
public class FamilyPlanning {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fam, input = new String();
        String toContinue = "y";
        int numFam = 0;
        int total = 0;
        int max = 0;
        int totalM = 0;
        int totalF = 0;
        double avg;
        while (toContinue.equalsIgnoreCase("y")) {
            while (numFam <= 0) {
                System.out.println("Enter number of families to simulate: ");
                fam = scan.nextLine();
                numFam = Integer.parseInt(fam);
                if (numFam <= 0) {
                    System.out.println("Number invalid. Try again.");
                }
            }
            for (int i = 1; i <= numFam; i++) {
                Family f = new Family();
                f.wooHoo();
                fam = f.getMembers();
                System.out.println(i + ": " + fam);
                if (f.getTotal() > max) {
                    max = f.getTotal();
                }
                totalM = totalM + f.getM();
                totalF = totalF + f.getF();
                total = total + f.getTotal();
            }
            avg = (double) total / numFam;
            System.out.println("Average number of kids: " + avg);
            System.out.println("Maximum number of kids: " + max);
            System.out.println(totalM + " male and " + totalF
                + " female kids were born.");
            System.out.println("Try again? Y/n");
            toContinue = scan.nextLine();
        }
    }
}