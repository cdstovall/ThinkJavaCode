import java.util.Scanner;

public class LogicMethods
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("What size cheese would you like? ");
        int diameter = in.nextInt();
        System.out.println();

        if (diameter < 0 || diameter > 3)
        {
            System.err.println("Your order is too crazy! Please try again.");
            return;
        }

        System.out.println("How many yards of cheese would you like? ");
        int yards = in.nextInt();
        System.out.println();

        if (yards < 0 || yards > 1000000)
        {
            System.err.println("Your order is too crazy! Please try again.");
            return;
        }

        crazyCheesePrice(diameter,yards);
    }

    private static void crazyCheesePrice(int diameter, int yards)
    {
        int costPerYard = 0;

        final int PRICE_ONE_INCH = 2;
        final int PRICE_TWO_INCH = 4;
        final int PRICE_THREE_INCH = 6;

        if (diameter == 1)
        {
            costPerYard = (PRICE_ONE_INCH * yards);
        } else if (diameter == 2)
        {
            costPerYard = (PRICE_TWO_INCH * yards);
        } else if (diameter == 3)
        {
            costPerYard = (PRICE_THREE_INCH * yards);
        }


        int shipping = 0;

        final int SHIPPING_ONE_OR_TWO = 2;
        final int SHIPPING_THREE = 4;

        final int FREE_SHIPPING_ONE_INCH = 50;
        final int FREE_SHIPPING_TWO_INCHES = 75;
        final int FREE_SHIPPING_THREE_INCHES = 25;


        if ((diameter == 1 && yards <= FREE_SHIPPING_ONE_INCH) || (diameter == 2 && yards <= FREE_SHIPPING_TWO_INCHES))

        {
            shipping = SHIPPING_ONE_OR_TWO * yards;

        } else if (diameter == 3 && yards <= FREE_SHIPPING_THREE_INCHES)
        {
            shipping = SHIPPING_THREE * yards;
        }


        final int HANDLING = 5;
        int totalPrice = costPerYard + shipping + HANDLING;

        System.out.println("The total cost for your order is $" + totalPrice);
        System.out.println();

    }





    /* //5-4
    private static void checkFermat(int a, int b, int c, int n)
    {

        if (n > 2)
        {
            if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n))
            {
                System.out.println("Holy smokes, Fermat was wrong!");
                System.out.println();
            } else
            {

                System.out.println("No, that doesn't work.");
                System.out.println();
            }
        } else
        {
            System.out.println("Holy smokes, Fermat was right!");
            System.out.println();
        }
    } */

//5-A
    /*private static void printIsLarge(int number)
    {
        if (number > 99)
        {
            System.out.println("The number is large");

            System.out.println();
        }
    }*/

//5-B
    /*private static void printIsLargeOrSmall(int number)
    {
        if (number > 99)
        {
            System.out.println("The number is large");

            System.out.println();
        }

        if (number < 10)
        {
            System.out.println("The number is small");

            System.out.println();
        }
    }*/

//5-C
    /*private static void printLargest(int number1, int number2)
    {

        if (number1 > number2)
        {
            System.out.println("The largest number is: " + number1);

            System.out.println();
        }

        else if (number2 > number1) {

            System.out.println("The largest number is: " + number2);

            System.out.println();
        }

        else if (number1 == number2) {

            System.out.println("The numbers are equal");
            System.out.println();

        }
    } */

//5-D
    /* private static void printLargestOdd(int number1, int number2)
    {
        int remainder1 = (number1 % 2);
        int remainder2 = (number2 % 2);

        if (remainder1 == 1 && remainder2 == 1)
        {
            if (number1 > number2)
            {
                System.out.println("The largest odd number is: " + number1);

                System.out.println();
            }

            else if (number2 > number1) {

                System.out.println("The largest odd number is: " + number2);

                System.out.println();
            }

            else if (number1 == number2) {

                System.out.println("Two odds make an even");
                System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));

            }
        }

        else if (remainder1 == 1 && remainder2 == 0)
        {
            System.out.println("The largest odd number is: " + number1);
            System.out.println();
        }

        else if (remainder1 == 0 && remainder2 == 1)
        {
            System.out.println("The largest odd number is: " + number2);
            System.out.println();
        }

        else {
            System.out.println("Neither number is odd");
            System.out.println();
        }
    } */

}
