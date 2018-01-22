public class LogicMethods
{
    public static void main(String[] args)
    {
        printIsLargeOrSmall(5);
        printIsLargeOrSmall(100);
        printIsLargeOrSmall(50);
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
    private static void printIsLargeOrSmall(int number)
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
    }

}
