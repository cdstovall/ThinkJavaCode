public class MyLoopsB
{
    public static void main(String[] args)
    {
        exercise7bForLoop();

        exercise7bWhile();

        exercise7bDoWhile();
    }

    private static void exercise7bForLoop()
    {
        for (int x = 0; x <= 100; x += 10)
        {
            System.out.println(x);
        }
    }

    private static void exercise7bWhile()
    {
        int x = 0;
        while (x <= 100)
        {
            System.out.println(x);
            x += 10;
        }
    }

    private static void exercise7bDoWhile()
    {
        int x = 0;
        do{
            System.out.println(x);
            x += 10;
        } while (x <= 100);
    }
}
