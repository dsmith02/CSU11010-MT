import java.util.Scanner;

public class ETest1 {

    public static final int NO_DIGIT_REMAINING = 0;
    public static final int ISOLATE_DIGIT = 10;
    public static final int MIN_DIGIT_INDEX = 0;
    public static final int DIVIDES_IN = 0;
    public static final int QUIT_PROGRAM_INDICATOR = -1;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;
        while (continueProgram)
        {
            System.out.print("Enter the maximum positive whole number to be considered (or -1 to quit)> ");
            if (scanner.hasNextInt())
            {
                int userInput = scanner.nextInt();
                if (userInput == QUIT_PROGRAM_INDICATOR)
                {
                    continueProgram = false;
                }
                else if (userInput <= 0)
                {
                    System.out.printf("Error: %d is not a positive number.\n", userInput);
                }
                else if (userInput <= 10)
                {
                    System.out.printf("There are no numbers which are both zygodromes and nude up to %d\n", userInput);
                }
                else if (userInput < 22)
                {
                    System.out.printf("The numbers which are both zygodromes and nude up to %d are 11\n", userInput);
                }
                else
                {
                    System.out.printf("The numbers which are both zygodromes and nude up to %d are ", userInput);
                    for (int currentNumber = 11; currentNumber <= userInput; currentNumber++)
                    {
                        if (isNude(currentNumber) && isZygodrome(currentNumber))
                        {
                            String output = currentNumber != userInput ? currentNumber + ", " : currentNumber + "\n";
                            System.out.print(output);
                        }
                    }
                }
            }
            else
            {
                String input = scanner.nextLine();
                System.out.printf("Error: %s is not a positive number.\n", input);
            }
        }
        scanner.close();
    }

    public static boolean isNude(int number)
    {
        boolean isNude = true;
        int digitAmount = getNumberOfDigits(number);
        int[] digitArray = new int[digitAmount];
        for (int index = 0; index < digitAmount; index++)
        {
            digitArray[index] = getDigit(number, (index + 1));
            if (digitArray[index] == 0)
            {
                isNude = false;
            }
        }

        for (int index = 0; (index < digitArray.length) && (isNude); index++)
        {
            if (number % digitArray[index] != DIVIDES_IN)
            {
                isNude = false;
            }
        }
        return isNude;
    }

    public static int getNumberOfDigits(int number)
    {
        int numberCopy = number;
        int numberOfDigits = 0;

        if (numberCopy == 0)
        {
            return 1;
        }

        while (numberCopy != NO_DIGIT_REMAINING)
        {
            numberCopy /= ISOLATE_DIGIT;
            numberOfDigits++;
        }

        return numberOfDigits;
    }

    public static int getDigit(int number, int digitNumber)
    {
        int numberCopy = number;
        int maxDigits = getNumberOfDigits(number);
        if ((digitNumber > maxDigits) || (digitNumber <= MIN_DIGIT_INDEX))
        {
            return -1;
        }

        int numberOfDivisions = (maxDigits - digitNumber) + 1;
        int isolatedDigit = 0;
        for (int index = 1; index <= numberOfDivisions; index++)
        {
            isolatedDigit = numberCopy % ISOLATE_DIGIT;
            numberCopy /= 10;
        }

        return (isolatedDigit);
    }

    public static boolean isZygodrome(int number)
    {
        int digitAmount = getNumberOfDigits(number);
        int[] digitArray = new int[digitAmount];
        for (int index = 0; index < digitAmount; index++)
        {
            digitArray[index] = getDigit(number, (index + 1));
        }

        if (digitArray.length == 1)
        {
            return false;
        }
        else if (digitArray[0] != digitArray[1])
        {
            return false;
        }
        else if (digitArray[digitArray.length - 1] != digitArray[digitArray.length - 2])
        {
            return false;
        }

        int previousDigit = digitArray[1];
        for (int index = 2; index < digitArray.length - 1; index++)
        {
            int currentDigit = digitArray[index];
            int nextDigit = digitArray[index + 1];
            if (currentDigit != previousDigit && currentDigit != nextDigit)
            {
                return false;
            }
        }
        return true;
    }
}
