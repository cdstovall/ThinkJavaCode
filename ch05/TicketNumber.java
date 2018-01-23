import java.util.Scanner;

public class TicketNumber
{
    public static void main(String[] args)
    {
        int ticketNumber;

        Scanner in = new Scanner(System.in);

        System.out.println("What is your ticket number? ");
        ticketNumber = in.nextInt();
        System.out.println();

        int lastDigit = ticketNumber % 10;
        int ticketPrefix = ticketNumber / 10;

        final int TICKET_TEST = 7;
        boolean result = ((ticketPrefix % TICKET_TEST) == lastDigit);


        if (result)
        {
            System.out.println("Good Number");
        } else
        {
            System.out.println("Bad Number");
        }


    }
}
