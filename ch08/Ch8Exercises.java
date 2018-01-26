import java.util.Arrays;

public class Ch8Exercises
{
    public static void main(String[] args)
    {
        int testArray[] = {5,4,3,55,2,1};
        arrayMax(testArray);
    }

    //Exercise 8-C
    private static void arrayMax(int[] a)
    {
        int max = 0;
        int max2 = 0;

        for (int b : a)
        {
           max = Math.max(a[0], b);
           max2 = Math.max(max2, max);

        }

        System.out.println(max2);
    }


    //Exercise 8-B
   /* private static void arrayTotal(int[] a)
    {
        int total = 0;

        for (int b : a)
        {
            total += b;
        }

        System.out.println("The sum of all of the values in the array is: " + total);

    } */


    //Exercise 8-A
   /* private static void printArray(int[] y)
    {
        System.out.println(Arrays.toString(y));

    } */
}
