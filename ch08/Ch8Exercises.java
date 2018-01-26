public class Ch8Exercises
{
    public static void main (String [] args)
    {
        int testArray[] = {1,2,3,4,5};
        printArray(testArray);
    }

    //Exercise 8-A
    private static void printArray(int[] y)
    {
        for (int x : y)
        {
            System.out.println(x);
        }
    }
}
