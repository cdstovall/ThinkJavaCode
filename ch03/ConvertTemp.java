import java.util.Scanner;

public class ConvertTemp
{
    public static void main(String[] args) {
        double degC;
        double degF;

        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("Exactly how many degrees Celsius? ");
        degC = in.nextDouble();

        final double DEGC_TO_DEGF = (degC * 9 / 5) + 32;

        // convert and output the result
        degF = DEGC_TO_DEGF;
        System.out.printf("%.1f degrees Celsius = %.1f degrees Fahrrenheit.\n",
                degC, degF);
    }
}
