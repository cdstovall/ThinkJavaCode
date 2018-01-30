public class Exercise9F
{
    public static void main(String[] args)
    {
        printPhoneNumber("501-555-0100");
    }

    private static void printPhoneNumber (String digits)
    {
        //Expected format: ###-###-####

        String areaCode = digits.substring(0,3);
        String exchange = digits.substring(4,7);
        String lineNumber = digits.substring(8,12);

        System.out.println("Area Code: " + areaCode);
        System.out.println("Exchange: " + exchange);
        System.out.println("Line Number: " + lineNumber);
    }
}
