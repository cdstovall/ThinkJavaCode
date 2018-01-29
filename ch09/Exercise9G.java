public class Exercise9G
{
    public static void main(String[] args)
    {
        System.out.println(findFirstE("Hello"));
        System.out.println(findFirstE("Goodbye"));
    }

    private static int findFirstE(String text)
    {
        return text.indexOf('e');
    }
}
