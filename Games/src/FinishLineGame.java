import java.util.Random;

public class FinishLineGame
{
    public static void main(String[] args)
    {
        final int GAME_START = 1;
        int place1 = GAME_START;
        int place2 = GAME_START;

        System.out.println("Let the game begin!");
        System.out.println();

        //The game ends when either player reaches 10
        final int GAME_OVER = 10;

        //Turn for both players
        while (place1 < GAME_OVER && place2 < GAME_OVER)
        {
            //Player 1 rolls
            int next1 = place1 + 1;

            int player1Die1 = die1();
            int player1Die2 = die2();
            int rollTotal1 = player1Die1 + player1Die2;

            System.out.println("Player 1 rolled a " + player1Die1 + " and " + player1Die2 + " for a total of "
                    + rollTotal1 + " .");

            if (player1Die1 == next1 || player1Die2 == next1 || rollTotal1 == next1)
            {
                System.out.println("Player 1 is moving up!");

                place1++;
            }

            //Player 2 rolls
            int next2 = place2 + 1;

            int player2Die1 = die1();
            int player2Die2 = die2();
            int rollTotal2 = player2Die1 + player2Die2;

            System.out.println("Player 2 rolled a " + player2Die1 + " and " + player2Die2 + " for a total of "
                    + rollTotal2 + " .");

            if (player2Die1 == next2 || player2Die2 == next2 || rollTotal2 == next2)
            {
                System.out.println("Player 2 is moving up!");

                place2++;
            }

        }

        int player1FinalScore = place1;
        int player2FinalScore = place2;

        System.out.println();

        if (winner1(player1FinalScore,player2FinalScore))
        {
            System.out.println("Player 1 is the winner!");
        }
        else if (winner2(player1FinalScore,player2FinalScore))
        {
            System.out.println("Player 2 is the winner");
        }
        else if (tieGame(player1FinalScore, player2FinalScore))
        {
            System.out.println("Tie game!");
        }
        else {
            System.out.println("Oops, something went wrong in the game winning announcement if / else if .");
        }

    }

    private static int die1()
    {
        final int MAX_NUMBER = 6;

        Random random = new Random();
        int randomNumber = random.nextInt(MAX_NUMBER) + 1;

        return randomNumber;
    }

    private static int die2()
    {
        final int MAX_NUMBER = 6;

        Random random = new Random();
        int randomNumber = random.nextInt(MAX_NUMBER) + 1;

        return randomNumber;
    }

    private static boolean winner1(int player1FinalScore, int player2FinalScore)
    {
        return player1FinalScore > player2FinalScore;
    }

    private static boolean winner2(int player1FinalScore, int player2FinalScore)
    {
        return player2FinalScore > player1FinalScore;
    }

    private static boolean tieGame(int player1FinalScore, int player2FinalScore)
    {
        return player1FinalScore == player2FinalScore;
    }
}
