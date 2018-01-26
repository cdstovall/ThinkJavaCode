public class Exercise8B
{
    public static void main(String[] args)
    {
        int testArray[] = {1,2,3,4,5};

        arrayTotal(testArray);
    }

    private static void arrayTotal(int[] a)
    {
        int total = 0;

        for (int b : a)
        {
            total += b;
        }

        System.out.println("The sum of all of the values in the array is: " + total);

    }
}
