public class PerfectSquare {

    public static void main(String[] args)
    {
        System.out.println(isPerfectSquare(35));
    }

    public static boolean isPerfectSquare(int number)
    {
        for (int i = 1; i <= number / 2; i++)
        {
            if (i * i == number)
            {
                return true;
            }
        }
        return false;
    }
}
