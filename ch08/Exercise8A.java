import java.util.Arrays;

public class Exercise8A
{
    public static void main(String[] args)
    {
        int testArray[] = {1,2,3,55,4,5,6};

        printArray(testArray);
    }

    private static void printArray(int[] y)
    {
        System.out.println("The values in this array are: " + Arrays.toString(y));

    }
}
