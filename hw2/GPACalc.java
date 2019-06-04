import java.util.Scanner;

public class GPACalc {
	public static void main(String[] args) {
		Scanner scan;
		int a, b, c, d, f;
		double result, weight, sum;
		scan = new Scanner(System.in);
		System.out.print("Number of A's:");
		a = scan.nextInt();
		//System.out.print(a);
		System.out.print("Number of B's:");
		b = scan.nextInt();
		System.out.print("Number of C's:");
		c = scan.nextInt();
		System.out.print("Number of D's:");
		d = scan.nextInt();
		System.out.print("Number of F's:");
		f = scan.nextInt();
		weight = (4.0 * a) + (3.0 * b) + (2.0 * c) + (1.0 * d) + (0.0 * f);
		sum = a + b + c + d + f;
		result = weight/sum;
		System.out.print("GPA: "+result);
	}

}