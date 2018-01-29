public class Exercise9C
{
    public static void main(String[] args)
    {
        printCharacters("Hello");
    }

    private static void printCharacters(String text)
    {
        for (int i = 0; i < text.length(); i++)
        {
            char letter = text.charAt(i);

            System.out.println("" + letter + i);
        }
    }
}
