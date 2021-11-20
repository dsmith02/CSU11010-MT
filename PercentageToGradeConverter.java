import java.sql.SQLOutput;
import java.util.Scanner;

public class PercentageToGradeConverter2 {

    /*  SELF ASSESSMENT of whether my code is easy to understand.
       1. Did I use easy-to-understand meaningful variable names?
           Mark out of 5: 5
           Comment: Yep.
       2. Did I format the variable names properly (in lowerCamelCase)?
           Mark out of 5: 5
           Comment: Yes.
       3. Did I indent the code appropriately?
           Mark out of 5: 5
           Comment: I've inspected it and got IntelliJ to reformat the code automatically.
       4. Did I implement a switch statement as required?
           Mark out of 10: 10
           Comment: Yes, implemented in printGradeClass function.
         Total Mark out of  25 (Add all the previous marks): 25
    */

    public static final double MAXIMUM_PERCENTAGE = 100.0;
    public static final double MINIMUM_PERCENTAGE = 0.0;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        boolean continueProgram = true;

        // Loop will continue executing until continueProgram == false
        do
        {
            System.out.print("Enter a percentage (or 'quit' to finish)> ");

            double roundedPercentage = 0.0;
            double parsedPercentage = 0.0;
            String rawInput = scanner.nextLine();

            if (rawInput.equalsIgnoreCase("quit"))
            {
                continueProgram = false;
            }
            else
            {
                try
                {
                    parsedPercentage = Double.parseDouble(rawInput);
                    roundedPercentage = Math.round(parsedPercentage);
                }
                catch (NumberFormatException exception)
                {
                    System.out.println("Error: Enter a number between 0.0 and 100.0, or the word quit to exit the program.");
                }

                if (parsedPercentage <= MAXIMUM_PERCENTAGE && parsedPercentage >= MINIMUM_PERCENTAGE)
                {
                    printGradeClass(roundedPercentage, parsedPercentage);
                }
                else
                {
                    System.out.println("Error: Percentages must be between 0.0% and 100.0%");
                }
            }

        } while (continueProgram);

    }

    public static void printGradeClass(double roundedPercentage, double parsedPercentage)
    {
        int numberOfTens = (int) roundedPercentage / 10;

        switch (numberOfTens)
        {
            case 1:
            case 2:
            case 3:
                if (roundedPercentage < 35.0)
                {
                    System.out.printf("The grade for %.1f%% is F2\n", parsedPercentage);
                }
                else
                {
                    System.out.printf("The grade for %.1f%% is a F1\n", parsedPercentage);
                }
                break;
            case 4:
                System.out.printf("The grade for %.1f%% is a III\n", parsedPercentage);
                break;

            case 5:
                System.out.printf("The grade for %.1f%% is a II.2\n", parsedPercentage);
                break;

            case 6:
                System.out.printf("The grade for %.1f%% is a II.1\n", parsedPercentage);
                break;

            case 7:
            case 8:
            case 9:
            case 10:
                System.out.printf("The grade for %.1f%% is a I\n", parsedPercentage);
                break;
        }
    }
}
