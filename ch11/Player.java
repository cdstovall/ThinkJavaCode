public class Player
{
    private String name;
    private int score;

    public Player(String name)
    {
        score = 0;

        this.name = name;
    }

    public void increaseScore()
    {
        score++;
    }

    public void resetScore()
    {
        score = 0;
    }


}
