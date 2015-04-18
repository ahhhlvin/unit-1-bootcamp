/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

  public static void main (String args[]) {
    Person friend = new Person("Alvin");
    friend.setCity("California");

    System.out.println(isFromLondon(friend));
    printName(friend);

    fizzMultipleofThree(20);

  }

  public static void printName(Person person) {
    if (person.getName().length() < 5) {
      System.out.println("Name is too short");
    } else {
      System.out.println(person.getName());
    }
  }


  public static boolean isFromLondon(Person person) {
    return (person.getCity().equals("London"));
  }

  public static void fizzMultipleofThree(int n) {
    for (int i = 0; i < n; i++) {
      if (i % 3 == 0) {
        System.out.println("Fizz");
      } else {
        System.out.println(i);
      }
    }
  }


}
