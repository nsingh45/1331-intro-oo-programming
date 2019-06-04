import java.util.Scanner;

public class Cipher {
 public static void main(String[] args) {
  char extra; //initialize vars
  String toCode, decode, chunk1, chunk2, chunk3, chunk4, chunk5 = new String();
  Scanner s = new Scanner(System.in);
  System.out.println("Enter a word to encode: ");
  toCode = s.nextLine(); //gets input from user
  chunk1 = toCode.substring(0, 1); //pulls out 1st character, stays same
  chunk2 = toCode.substring(1, 2); //pulls out 2nd character, shifts up 4
  char second = chunk2.charAt(0);
  extra = (char) (second + 4);
  chunk2 = chunk2.replace(second, extra);
  chunk3 = toCode.substring(2, 3); //pulls out 3rd character, shifts down 4
  char third = chunk3.charAt(0);
  extra = (char) (third - 4);
  chunk3 = chunk3.replace(third, extra);
  chunk4 = toCode.substring(3, 4); //pulls out 4th character
  chunk5 = toCode.substring(4, 5); //pulls out 5th character for swap
  System.out.println("Encoded word: " + chunk1 + chunk2
  + chunk3 + chunk5 + chunk4);
  System.out.println("Enter a word to decode: ");
  decode = s.nextLine(); //gets input from user
  chunk1 = decode.substring(0, 1); //pulls out 1st character, stays same
  chunk2 = decode.substring(1, 2); //pulls out 2nd character, shifts down 4
  second = chunk2.charAt(0);
  extra = (char) (second - 4);
  chunk2 = chunk2.replace(second, extra);
  chunk3 = decode.substring(2, 3); //pulls out 3rd character shifts up 4
  third = chunk3.charAt(0);
  extra = (char) (third + 4);
  chunk3 = chunk3.replace(third, extra);
  chunk4 = decode.substring(3, 4); //pulls out 4th character
  chunk5 = decode.substring(4, 5); //pulls out 5th character to swap
  System.out.println("Decoded word: " + chunk1 + chunk2
  + chunk3 + chunk5 + chunk4);
 }
}