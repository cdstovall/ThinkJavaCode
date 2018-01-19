public class Withdrawal
{
    public static void main(String[] args)
    {
        int withhdrawal = 137;

        int twenty = withhdrawal / 20;
        int remainder1 = withhdrawal % 20;

        System.out.println(twenty + " $20 bills");

        int ten = remainder1 / 10;
        int remainder2 = remainder1 % 10;

        System.out.println(ten + " $10 bills");

        int five = remainder2 / 5;
        int remainder3 = remainder2 % 5;

        System.out.println(five + " $5 bills");

        int one = remainder3;

        System.out.println(one + " $1 bills");


    }
}
