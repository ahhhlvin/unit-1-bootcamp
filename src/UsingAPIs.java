import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.model.Charge;
import com.stripe.model.Customer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;


/**
 * Created by alexandraqin on 4/14/15.
 */
public class UsingAPIs
{

  public static void main(String args[]) throws CardException, APIException, AuthenticationException, InvalidRequestException, APIConnectionException
  {
    HashSet<String> words = new HashSet<String>();

    File file = new File(
            "/Users/alvin2/Desktop/accesscode/unit-1-bootcamp/resources/ATaleofTwoCities.txt");

    Scanner scanner = null;
    try
    {
      scanner = new Scanner(file);
    }
    catch(FileNotFoundException e)
    {
      e.printStackTrace();
    }


    while(scanner.hasNext())
    {
      words.add(scanner.next().toLowerCase());


      // str += scanner.next();


      /*if (!words.contains(word.toLowerCase())) {
        words.add(word.toLowerCase());
      } else {
        continue;
        }*/


    }

    System.out.println(words);


    /* for(String word : words)
    {
      if(word.contains(".") || word.contains(",") || word.contains(
              "!") || word.contains("?") || word.contains(":") || scanner
              .next().contains(";") || word.contains("_") || word.contains(
              "'s") || word.contains("-") || word.contains("--"))
      {

        word.replace(",", " ");
        word.replace("!", " ");
        word.replace("?", " ");
        word.replace(":", " ");
        word.replace(";", " ");
        word.replace("_", " ");
        word.replace("'s", " ");
        word.replace("-", " ");
        word.replace("--", " ");
      }

      */





  // Using a TEST API key to practice calling the Stripe API
    Stripe.apiKey = "sk_test_BQokikJOvBiI2HlWgH4olfQ2";

    Map<String, Object> customerParams = new HashMap<String, Object>();
    customerParams.put("limit", 3);

    // Specifies details of how to pull in customer data from Stripe API 'Customer.all(-------);'
          // in our case we are specifying the limit and to only yield 3 customers and place them in a HashMap we created to present the data !
    Customer.all(customerParams);

    for (Customer currentCustomer : Customer.all(customerParams).getData()) {
      System.out.println(currentCustomer.getId());
      System.out.println(currentCustomer.getEmail());

      currentCustomer.setAccountBalance(700);

    }


    System.out.println(customerParams.size());


    Map<String, Object> chargeParams = new HashMap<String, Object>();
    chargeParams.put("amount", 600);
    chargeParams.put("currency", "hkd");
    chargeParams.put("customer", "cus_655swcTsoKi4aT");
    chargeParams.put("description", "Creating my first Stripe charge!");


    Charge.create(chargeParams);


  }

}
