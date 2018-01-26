import java.util.Arrays;

public class Ch8Exercises
{
    public static void main(String[] args)
    {
        int testArray[] = {1, 2, 3, 4, 5};
        arrayTotal(testArray);
    }


    //Exercise 8-B
    private static void arrayTotal(int[] a)
    {
        int total = 0;

        for (int b : a)
        {
            total += b;
        }

        System.out.println("The sum of all of the values in the array is: " + total);

    }


    //Exercise 8-A
   /* private static void printArray(int[] y)
    {
        System.out.println(Arrays.toString(y));

    } */
}
