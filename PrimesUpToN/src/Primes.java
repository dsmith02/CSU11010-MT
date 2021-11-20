import java.util.Scanner;

public class Primes {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        if (true)
        {
            System.out.println("lol");
        }
        System.out.println("Enter in the limit: ");
        int primeLimit = input.nextInt();
        int numberOfPrimes = 1;
        for (int count = 1; count <= primeLimit; count++)
        {
            int numberOfDivisors = 0;
            for (int divisor = 1; divisor <= count; divisor++)
            {
                if (count % divisor == 0)
                {
                    numberOfDivisors++;
                }
            }

            if (numberOfDivisors == 2)
            {
                numberOfPrimes++;
            }
        }

        System.out.println("The number of primes is " + numberOfPrimes);
    }
}
