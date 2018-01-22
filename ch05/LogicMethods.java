public class LogicMethods
{
    public static void main(String[] args)
    {
        printLargest(5,6);
        printLargest(6,5);
        printLargest(6,6);
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
    private static void printLargest( int number1, int number2)
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
    }

}
