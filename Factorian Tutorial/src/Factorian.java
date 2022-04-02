import java.util.Scanner;

public class Factorian {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number >= 0 or enter 'quit'> ");
        String rawInput = scanner.nextLine();
        while (!rawInput.equalsIgnoreCase("quit"))
        {
            try
            {
                int parsedInteger = Integer.parseInt(rawInput);
                if (parsedInteger <= -1)
                {
                    System.out.println("You must enter a number that is either 0 or positive.");
                }
                else
                {
                    System.out.println(isFactorian(parsedInteger));
                }
            }
            catch (NumberFormatException exception)
            {
                System.out.println("Please enter a number.");
            }
            System.out.print("Enter a number >= 0 or enter 'quit'> ");
            rawInput = scanner.nextLine();
        }
    }

    // This function computes the factorial of a given number. If a negative number is inputted, it will return -1;
    public static int computeFactorial(int number)
    {
        if (number == 0)
        {
            return 1;
        }
        if (number <= -1)
        {
            return -1;
        }
        return (number * computeFactorial(number - 1));
    }

    public static boolean isFactorian(int number)
    {
        int numberOfDigits = String.valueOf(number).length();
        int numberCopy = number;
        int sumOfFactorials = 0;
        for (int count = 1; count <= numberOfDigits; count++)
        {
            int currentDigit = numberCopy % 10;
            sumOfFactorials += computeFactorial(currentDigit);
            numberCopy /= 10;
        }
        return (sumOfFactorials == number ? true : false);
    }
}
