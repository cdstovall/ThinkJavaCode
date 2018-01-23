public class Multadd
{
    public static void main(String[] args)
    {
        System.out.println(multadd(1.0, 2.0, 3.0));
        System.out.println(multadd(12.0, 20.0, 4.0));
        System.out.println(multadd(-11.0, 242.0, -30.0));
    }

    //Exercise 6.4: 1, 2, and 3
    private static double multadd(double a, double b, double c)
    {
        return (a * b + c);
    }
}
