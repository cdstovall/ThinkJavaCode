public class Exercise9A
{
    public static void main(String[] args)
    {
        printFirstCharacter("Hello");
        printFirstCharacter("Goodbye");

    }

    private static void printFirstCharacter(String text)
    {
        System.out.println("Print the first character in " + text);

        System.out.println(text.charAt(0));
    }
}
