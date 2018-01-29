public class Exercise9H
{
    public static void main(String[] args)
    {
        System.out.println(isFinn("Finn"));
        System.out.println(isFinn("Jake"));

    }

    private static boolean isFinn(String adventure)
    {
        String theHuman = "Finn";

        return  (adventure.equals(theHuman));
    }
}
