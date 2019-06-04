public class NickNamer {
	//What we want the program to do:
	/*
	Ask for name
	Calculate nickname
	Ask if you want to be called that
	*/
	public static void main(String[] args) {
		Scanner scan;
		String line, nickName;
		scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		line = scan.nextLine(); //wait till there's a full line from command line
		nickName = line.substring(0,4);
		System.out.print("Can I call you "+nickName+"? If not, I'll call you "+line+".");
		
		