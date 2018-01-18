public class Time
{
    public static void main(String args[])
    {
        int hour = 14;
        int minute = 34;
        int second = 30;

        System.out.print("Number of seconds since midnight: ");
        System.out.println((hour * 60 * 60) + (minute * 60) + second);

        System.out.print("Number of seconds remaining in the day: ");
        System.out.println((24 * 60 * 60) - ((hour * 60 * 60) + (minute * 60) + second));

        System.out.print("Percent of the day that has passed: ");
        System.out.println(((hour * 60 * 60) + (minute * 60) + second) * 100 / (24 * 60 * 60));

        int hour2 = 14;
        int minute2 = 48;
        int second2 = 17;

        System.out.print("Time elapsed since beginning this exercise: ");
        System.out.print(((hour2 * 60 * 60) + (minute2 * 60) + second2) - ((hour * 60 * 60) + (minute * 60) + second));
        System.out.println(" seconds.");

    }

}
