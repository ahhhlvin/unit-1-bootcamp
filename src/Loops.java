/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

  public static void main (String args[]) {
    sumOf1through10();
    sumOfnTimes("hello", 10);
    numOfnTimes(6);
    printEven(20);
    System.out.println(printSum1through10());
    System.out.println(printSum1throughn(10000));
    printSNtimes("hey", - 5);
    printSNtimesString("hey", 5);

    fibonacciSeq(10);
    fibonacciSeqSum(10);

    digits();

  }

  public static void sumOf1through10() {
    int num = 0;

    for (int i = 1; i <= 10; i++) {
      num += 1;
    }

    System.out.println(num);
  }


  public static void printSNtimes(String s, int n) {
    if (n < 0) {
      System.out.println("");
    } else
    {
      for(int i = 0; i < n; i++)
      {
        System.out.println(s);
      }
    }
  }



  public static void printSNtimesString(String s, int n) {
    if (n < 0) {
      System.out.println("");
    } else
    {
      for(int i = 0; i < n; i++)
      {
        System.out.print(s);
      }
      System.out.println("");

    }
  }


  public static void sumOfnTimes(String word, int num) {
    String str = "";

    for (int i = 0; i < num; i++) {
      str += word;
    }

    System.out.println(str);
  }

  public static void numOfnTimes(int num) {
    for (int i = 1; i < num; i++) {
      System.out.println(i);
    }
  }

  public static void printEven(int num) {
    for (int i = 1; i < num; i++) {
      if (i % 2 == 0) {
        System.out.println(i);
      } else {
        continue;
      }
    }
  }


  public static int printSum1through10() {
    int fin = 0;

    for (int i = 1; i <10; i++) {
      fin += i;
    }

    return fin;
  }


  public static int printSum1throughn(int n) {
    int fin = 0;

    for(int i = 1; i < n; i++) {
      fin += i;
    }

    return fin;
  }


  public static void fibonacciSeq(int num) {
    int first = 0;
    int next = 1;
    int sum = first + next;

    System.out.println(first + "\n" + next + "\n" + sum);

    for (int i = 0; i < num - 3; i++) {
      first = next;
      next = sum;
      sum = first + next;


      System.out.println(sum);
    }

  }



  public static void fibonacciSeqSum(int num) {
    int first = 1;
    int next = 1;
    int sum = first + next;

    for (int i = 0; i < num - 3; i++) {
      first = next;
      next = sum;
      sum = first + next;
    }

    System.out.println(sum);
  }


  public static void digits()
  {
    for(int i = 10; i < 10000; i++)
    {
      int n = 0;
      String add = "";
      String num = String.valueOf(i);

      for(int j = 0; j < num.length(); j++) {
        n +=  Character.getNumericValue(num.charAt(j));

        if (j == num.length()-1) {
          add += num.charAt(j) + " = ";
        } else
        {
          add += (num.charAt(j) + " + ");
        }
      }

      System.out.println(i + ", " + add + n);

    }
  }
}
