import java.util.Random;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {

  public static void main (String args[]) {

    System.out.println(calculateSquare(4));
    System.out.println(calculateSquareRoot(16));
    System.out.println(toLowerCase("Hello, World"));
    System.out.println(isMultiple(16, 4));
    System.out.println(prettyInteger(5));
    System.out.println(random(4, 10));
    System.out.println(random(30, 70));
  }


  public static int calculateSquare(int n) {
    return (n * n);
  }


  public static double calculateSquareRoot(int n) {
    return Math.sqrt(n);
  }

  public static String toLowerCase(String str) {
    String fin = "";

    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      // store each letter of word into a CHAR variable
      int encoded = (int) c;
      // convert each letter to it's appropriate ASCII code

      // if letter is a capital letter, add 32 to to the ASCII code to get the lower case version and convert back to CHAR to add to final string
      if (encoded >= 65 && encoded <= 90 ) {
        char decoded = (char) (encoded + 32);
        fin += decoded;
      } else {
        // if letter ASCII code is not a capital letter then just add the CHAR on to the final string
        fin += c;
        continue;
      }
    }

    return fin;
  }


  public static boolean isMultiple(int n1, int n2) {
    if (n1 % n2 == 0) {
      return true;
    } else {
      return false;
    }
  }


  public static String prettyInteger(int n) {
    String fin = "";

    for (int i = 0; i < n; i++) {
      fin += "*";
    }

    fin += (" " + n + " ");

    for (int i = 0; i < n; i++) {
      fin += "*";
    }

    return fin;
  }


  public static int random(int n1, int n2) {
    Random random = new Random();

    int num = random.nextInt(n2) + n1;


    return num;

  }



}
