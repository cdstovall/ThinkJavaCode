public class Exercise8C
{
    public static void main(String[] args)
    {
        int testArray[] = {1,2,3,55,600,4,5};

        arrayMax(testArray);
    }

    private static void arrayMax(int[] a)
    {
        int max;
        int max2 = 0;

        for (int b : a)
        {
            max = Math.max(a[0], b);
            max2 = Math.max(max2, max);

        }

        System.out.println("The largest value in the array is: " + max2);
    }
}
