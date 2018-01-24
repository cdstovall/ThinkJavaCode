import java.util.Scanner;

public class MyLoopsE
{
    public static void main(String[] args)
    {
        exercise7E();
    }

    private static void exercise7E()
    {
        Scanner in = new Scanner(System.in);

        int x = 1;

        while (x != 0)
        {
            System.out.println("Please enter a number: ");
            x= in.nextInt();

            if (x != 0)
            {
                System.out.println("Oops! You did not enter \"0\"!");
                System.out.println();
            }
        }
    }
}
