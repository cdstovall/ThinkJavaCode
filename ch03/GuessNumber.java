import java.util.Scanner;
import java.util.Random;

public class GuessNumber
{
    public static void main(String[] args)
    {
        int userGuess;

        Scanner in = new Scanner (System.in);

        //prompt user to guess a number
        System.out.print("Guess a number between 1 and 100: ");
        userGuess = in.nextInt();

        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        int difference = Math.abs(number - userGuess);

        System.out.println("Your guess was " + userGuess + ".");
        System.out.println("The number I was thinking of was " + number + ".");
        System.out.println("The difference between your guess and my number is " + difference + ".");
    }

}
