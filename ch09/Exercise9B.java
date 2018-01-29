public class Exercise9B
{
    public static void main(String[] args)
    {
        printLastCharacter("Hello");
        printLastCharacter("Goodbye");

    }

    private static void printLastCharacter(String text)
    {
        System.out.println("Print the last character in " + text);

        System.out.println(text.charAt(text.length() - 1));
    }
}
