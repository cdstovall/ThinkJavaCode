public class ExerciseFourPointThree
{
    public static void main(String args[])
    {
        String day = "Thursday";
        int date = 18;
        String month = "January";
        int year = 2018;

        printAmerican(day, date, month, year);

        printEuropean(day, date, month, year);

    }

    public static void printAmerican(String day, int date, String month, int year)
    {
        System.out.println("American format:");

        System.out.print(day);
        System.out.print(", ");
        System.out.print(month);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(", ");
        System.out.println(year);

    }

    public static void printEuropean(String day, int date, String month, int year)
    {
        System.out.println("European format:");

        System.out.print(day);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(" ");
        System.out.print(month);
        System.out.print(" ");
        System.out.println(year);
    }
}
