import java.util.Scanner;

public class ConvertTime
{
    public static void main(String[] args) {
        int secondsIn;

        Scanner in = new Scanner(System.in);

        // prompt the user and get the value
        System.out.print("Exactly how many seconds? ");
        secondsIn = in.nextInt();

        final int SECONDS_PER_HOUR = 60 * 60;

        int hours = secondsIn / SECONDS_PER_HOUR;

        final int SECONDS_PER_MINUTE = 60;

        int minutes = (secondsIn - (hours * SECONDS_PER_HOUR)) / SECONDS_PER_MINUTE;

        int seconds = (secondsIn - (hours * SECONDS_PER_HOUR)) % SECONDS_PER_MINUTE;

        System.out.printf(secondsIn + " seconds = %d hours, %d minutes, and %d seconds.\n",
                hours, minutes, seconds);
    }
}
