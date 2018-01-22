public class LogicMethods
{
    public static void main(String[] args)
    {
        printLargestOdd(5,7);
        printLargestOdd(7,5);
        printLargestOdd(5,8);
        printLargestOdd(8,5);
        printLargestOdd(8,8);
        printLargestOdd(5,5);
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

    private static void printLargestOdd(int number1, int number2)
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
    }

}
