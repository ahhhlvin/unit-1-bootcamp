/**
 * Created by alvin2 on 4/19/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class Bonus
{
    public static void main(String[] args)
    {
        // Fizzbuzz();
        Fizzbuzz2();
        iterativeSeq(25);

    }


    public static void Fizzbuzz()
    {

        for(int i = 1; i <= 1000; i++)
        {
            // More specific case goes in the BEGINNING !
            if(i % 15 == 0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i % 5 == 0)
            {
                System.out.println("Buzz");
            }
            else if(i % 3 == 0)
            {
                System.out.println("Fizz");
            }
            else
            {
                System.out.println(i);
            }

        }
    }


    public static void Fizzbuzz2()
    {


        for(int i = 1; i <= 1000; i++)
        {
            String num = String.valueOf(i);

            if (num.contains("3") && num.contains("5"))
            {
                System.out.println("FizzBuzz");
            } else if (num.contains("3")) {
                System.out.println("Fizz");
            } else if (num.contains("5")) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }

        }

    }


    public static void iterativeSeq(int n)
    {
        for (int i = 5; i < n; i++)
        {
            System.out.print(i + " -> ");

            while(i < n && i > 3)
            {
                if(i == 1)
                {
                    break;
                }
                else if(i % 2 == 0)
                {
                    i = i / 2;
                    System.out.print(i + " -> ");
                }
                else if(i % 2 != 0)
                {
                    i = (3 * i) + 1;
                    System.out.print(i + " -> ");
                }


            }

            if (i == 1) {
                break;
            }


        }


    }



}
