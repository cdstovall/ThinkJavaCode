import java.util.Scanner;

public class MyLoopsF
{
    public static void main(String[] args)
    {
        exercise7F();
    }

    private static void exercise7F()
    {
        Scanner in = new Scanner(System.in);

        int x;
        int y = 0;

        while (y <= 1000)
        {
            System.out.println("Please enter a number: ");
            x = in.nextInt();
            y = y + x;
            System.out.println();

        }

        System.out.println();
        System.out.println(y);
    }
}
