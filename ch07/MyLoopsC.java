public class MyLoopsC
{
    public static void main(String[] args)
    {
        exercise7cForLoop();

        exercise7cWhile();

        exercise7cDoWhile();
    }

    private static void exercise7cForLoop()
    {
        for (int x = 100; x >= -100; x -= 8)
        {
            System.out.println(x);
        }
    }


    private static void exercise7cWhile()
    {
        int x = 100;
        while (x >= -100)
        {
            System.out.println(x);
            x -= 8;
        }
    }

    private static void exercise7cDoWhile()
    {
        int x = 100;
        do{
            System.out.println(x);
            x -= 8;
        } while (x >= -100);
    }
}
