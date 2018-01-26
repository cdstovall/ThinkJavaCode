public class Exercise8D
{
    public static void main(String[] args)
    {
        int testArray[] = {1,2,3,60,4,5};

        arrayMaxIndex(testArray);
    }

    private static void arrayMaxIndex(int[] values)
    {
        int maxValueIndex = 0;

        for(int i = 0; i < values.length; i++)
        {
            if (values[i] > values[maxValueIndex])
            {
                maxValueIndex = i;
            }
        }

        System.out.println("The index in this array with the highest value is index: " + maxValueIndex);
    }
}
