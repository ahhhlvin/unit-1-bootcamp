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

    System.out.println(cigarParty(50, true));
    System.out.println(caughtSpeeding(60, false));
    System.out.println(alarmClock(4, true));
    System.out.println(lotteryTicket(1, 4, 1));
    System.out.println(blackjack(20, 18));
    System.out.println(evenSpace(2, 4, 7));

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


  public static boolean cigarParty(int num, boolean weekend) {
    if (weekend == true && num >= 40) {
      return true;
    } else if (weekend == false && num >= 40 && num <= 60){
      return true;
    } else {
      return false;
    }
  }


  public static int caughtSpeeding(int speed, boolean birthday)
  {
    if(birthday == false && speed > 0)
    {
      return 0;
    }
    else if(birthday == true && speed > 0)
    {
      return 0;
    }
    else if(birthday == false && speed >= 61 && speed <= 80)
    {
      return 1;
    }
    else if(birthday == false && speed >= 81)
    {
      return 2;
    }
    else if(birthday == true && speed >= 66 && speed <= 85)
    {
      return 1;
    }
    else if (birthday == false && speed >= 86)
    {
      return 2;
    }
    else
    {
      return -1;

    }
  }



  public static String alarmClock(int DayofWeek, boolean vacation) {
    if (vacation == true) {
      if (DayofWeek >= 1 && DayofWeek <= 5) {
        return "10:00";
      } else {
        return "off";
      }
    }

    else {
      if (DayofWeek >= 1 && DayofWeek <= 5) {
        return "7:00";
      } else {
        return "10:00";
      }
    }

  }


  public static int lotteryTicket(int a, int b, int c) {
    if (a == b & b == c) {
      return 20;
    } else if (a != b && b != c && c != a) {
      return 0;
    } else if (a == b || b == c || c == a) {
      return 10;
    } else {
      return -1;
    }
  }

  public static int blackjack(int n1, int n2) {
    int diff1 = 21 - n1;
    int diff2 = 21 - n2;

    if (diff1 < diff2) {
      return n1;
    } else {
      return n2;
    }
  }


  public static boolean evenSpace(int a, int b, int c) {
    double avg = (a + b + c) / 3.0;
    return (avg == a || avg == b || avg == c);

  }




}
