public class LogicMethods
{
    public static void main(String[] args)
    {
        checkFermat(3, 4, 5, 3);
        checkFermat(3, 4, 5, 2);
    }

    //5-4
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
    }

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
