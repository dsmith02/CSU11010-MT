public class PerfectNumber {

    public static void main(String[] args)
    {
        for (int count = 1; count <= 10000; count++)
        {
            if (isPerfectNumber(count) == true)
            {
                System.out.println("The number " + count + " is a perfect number.");
            }
            
        }
    }

    public static boolean isPerfectNumber(int number)
    {
        int sumOfDivisors = 0;
        for (int denominator = 1; denominator < number; denominator++)
        {
            if (number % denominator == 0)
            {
                sumOfDivisors += denominator;
            }
        }
        return (sumOfDivisors == number);
    }

}
