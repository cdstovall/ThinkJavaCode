public class Exercise8E
{
    public static void main(String[] args)
    {
        double testArray[] = {3.0, 5.0, 1.0, 9.0, 7.0};

        arrayAverage(testArray);
    }

    private static void arrayAverage(double[] values)
    {
        double total = 0.0;

        for (double value : values)
        {
            total += value;
        }

        double avg = total / values.length;

        System.out.println("The average of all of the values in the array is: " + avg);
    }
}
