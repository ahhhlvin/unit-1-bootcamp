/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

  public static void main (String args[]) {
    Cat garfield = new Cat ("Garfield");
    Cat pinkPanther = new Cat ("Pink Panther");
    Cat catwoman = new Cat ("Catwoman");

    garfield.setFavoriteFood("Lasangna");
    pinkPanther.setFavoriteFood("Burgers");
    catwoman.setFavoriteFood("Meowmix");

    garfield.setAge(5);
    pinkPanther.setAge(10);
    catwoman.setAge(15);

    System.out.println(isOlder(garfield, pinkPanther));
    makeBestFriends(catwoman, pinkPanther);
    System.out.println(catwoman.getFavoriteFood());

    Person alvin = new Person ("Alvin");
    adoption(pinkPanther, alvin);

    adoption(catwoman, alvin);

    System.out.println(isFree(pinkPanther));
    System.out.println(isFree(catwoman));

    System.out.println(isSibling(pinkPanther, catwoman));

  }

  public static boolean isOlder (Cat cat1, Cat cat2) {
    if (cat1.getAge() > cat2.getAge()) {
      return true;
    } else {
      return false;
    }
  }

  public static void makeBestFriends (Cat cat1, Cat cat2) {
    cat1.setFavoriteFood(cat2.getFavoriteFood());
  }


  public static String adoption(Cat cat, Person person) {
    if (cat.getName().equals("Catwoman")) {
      return "Catwoman will never be anyone's pet!";
    } else
    {
      cat.setOwner(person);
      return cat.getName() + " is now " + person.getName() + "'s pet!";
    }
  }


  public static boolean isFree(Cat cat) {
    if (cat.getOwner() == null) {
      return true;
    } else {
      return false;
    }
  }



  public static boolean isSibling (Cat cat1, Cat cat2) {
    if (cat1.getOwner().equals(cat2.getOwner())) {
      return true;
    } else {
      return false;
    }
  }

}


