import java.util.Scanner;

import java.util.Arrays;

public class Exercise8G
{
    public static void main(String[] args)
    {
        final int MENU_SIZE = 5;

        int[] menuChoices = new int[MENU_SIZE];

        int customerChoice;

        Scanner in = new Scanner(System.in);

        while (menuChoices[0] < 99 && menuChoices[1] < 99 && menuChoices[2] < 99 && menuChoices[3] < 99 && menuChoices[4] < 99)
        {

            do
            {
                System.out.println("Would you like menu item 0, 1, 2, 3, or 4? ");
                customerChoice = in.nextInt();
                in.nextLine();

                if (customerChoice < 0 || customerChoice > 4)
                {
                    System.out.println("Sorry, that is not one of the items that we offer. Please make a different selection.");
                }
            } while (customerChoice < 0 || customerChoice > 4);

            menuChoices[customerChoice]++;
            System.out.println(Arrays.toString(menuChoices));


        }


        System.out.println("Gooodbye!");

        boolean employeeScreen = false;


        System.out.println("Are you an IVM employee? Please answer yes or no. ");
        String employeeTest = in.nextLine();

        if (employeeTest.equals("yes"));
        {
            employeeScreen = true;
        }

        if (employeeScreen)
        {
            System.out.println(Arrays.toString(menuChoices));
        }
        else
            System.out.println("Sorry, this information is only accessible by IVM employees.");
    }


}