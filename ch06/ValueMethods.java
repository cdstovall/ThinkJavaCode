public class ValueMethods
{
    public static void main(String[] args)
    {
        System.out.println(isTriangle(3,4,5));
        System.out.println(isTriangle(1,1,12));
    }

    //Exercise 6.3
    private static boolean isTriangle (int a, int b, int c)
    {
        return (a <= b + c && b <= a + c && c <= a + b);
    }






    //Exercise 6.2
    /* private static boolean isDivisible(int n, int m)
    {
        return (n % m == 0);
    } */
}
