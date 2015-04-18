import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {

  public static void main (String args[]) {

    ArrayList<String> cats = new ArrayList<String>();

    cats.add("Meow1");
    cats.add("Meow2");
    cats.add("Meow3");
    cats.add("Meow4");
    cats.add("Meow5");

    for (String cat : cats) {
      System.out.println(cat);
    }






    HashMap<String, Integer> accessCoders = new HashMap<String, Integer>();

    accessCoders.put("Alvin", 23);
    accessCoders.put("Sufei", 23);
    accessCoders.put("Luke", 30);



    for (String name : accessCoders.keySet()) {
      System.out.println(name + ", " + accessCoders.get(name));
    }


    System.out.println(canRentCar(accessCoders));



    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(4);
    numbers.add(2);
    numbers.add(5);
    numbers.add(6);
    numbers.add(2);
    mostFrequentElement(numbers);


  }





  public static void mostFrequentElement(ArrayList<Integer> nums) {

    HashMap<Integer, Integer> frequent = new HashMap<Integer, Integer>();

    for (Integer num : nums) {
      if (frequent.containsKey(num)) {
        frequent.put(num, frequent.get(num)+1);
      } else {
        frequent.put(num, 1);
      }
    }



    int maxVal = Collections.max(frequent.values());

    for (Integer line : frequent.keySet()) {
      if (frequent.get(line) == maxVal) {
        System.out.println(line + ", " + maxVal);
      }
    }


  }




  public static boolean canRentCar(HashMap<String, Integer> map){

    boolean bool = false;

    for (String name : map.keySet())
    {
      if(map.get(name) > 25)
      {
         return true;
      }

    }

    return bool;
  }



}
