public class Exercise9F
{
    public static void main(String[] args)
    {
        printPhoneNumber("501-555-0100");
    }

    private static void printPhoneNumber (String digits)
    {
        System.out.println("Area Code: " + digits.substring(0,3));
        System.out.println("Exchange: " + digits.substring(4,7));
        System.out.println("Line Number: " + digits.substring(8,12));
    }
}
