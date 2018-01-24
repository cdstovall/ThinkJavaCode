public class MyLoops
{
    public static void main(String[] args)
    {
        exercise7aForLoop();
        exercise7aForLoopBackwards();

        exercise7aWhile();
        exercise7aWhileBackwards();

        exercise7aDoWhile();
        exercise7aDoWhileBackwards();
    }

    private static void exercise7aDoWhileBackwards()
    {
        int x = 10;
        do{
            System.out.println(x);
            x--;
        } while (x >= 1);
    }

    private static void exercise7aDoWhile()
    {
        int x = 1;
        do{
            System.out.println(x);
            x++;
        } while (x <= 10);
    }

    private static void exercise7aWhileBackwards()
    {
        int x = 10;
        while (x >= 1)
        {
            System.out.println(x);
            x--;
        }
    }

    private static void exercise7aWhile()
    {
        int x = 1;
        while (x <= 10)
        {
            System.out.println(x);
            x++;
        }
    }

    private static void exercise7aForLoopBackwards()
    {
        for (int x = 10; x >= 1; x--)
        {
            System.out.println(x);
        }
    }

    private static void exercise7aForLoop()
    {
        for (int x = 1; x <= 10; x++)
        {
            System.out.println(x);
        }
    }
}
