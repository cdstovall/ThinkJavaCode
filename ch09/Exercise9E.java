public class Exercise9E
{
    public static void main(String[] args)
    {
        printFirstThree("Hello");
        printFirstThree("Goodbye");

    }

    private static void printFirstThree(String text)
    {
        System.out.println(text.substring(0, 3));
    }
}
