public class ValueMethods
{
    public static void main(String[] args)
    {
        System.out.println(isDivisible(4, 2));
        System.out.println(isDivisible(5, 2));

    }

    //Exercise 6.2
    private static boolean isDivisible(int n, int m)
    {
        return (n % m == 0);
    }
}
