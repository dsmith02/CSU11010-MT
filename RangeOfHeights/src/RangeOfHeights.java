import java.util.Scanner;

public class RangeOfHeights {

    /*  SELF ASSESSMENT of whether my code is easy to understand.
       1. Did I use easy-to-understand meaningful variable names?
           Mark out of 5: 5
           Comment: Yes, all are accurate and meaningful.
       2. Did I format the variable names properly (in lowerCamelCase)?
           Mark out of 5: 5
           Comment:  Yes.
       3. Did I indent the code appropriately?
           Mark out of 5: 5
           Comment: Yes.
       4. Did I implement a while loop or do-while loop as required?
           Mark out of 10: 10
           Comment: Yes, while loops were used.
      Total Mark out of  25 (Add all the previous marks): 25
    */

    public static final double ABSOLUTE_MINIMUM_HEIGHT = 0.0;
    public static final double STOP_PROGRAM_INDICATOR = 0.0;
    public static final double DEFAULT_HEIGHT_SETTING = 0.0;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double inputtedHeight = 1.0;
        double maximumHeight = DEFAULT_HEIGHT_SETTING;
        double minimumHeight = DEFAULT_HEIGHT_SETTING;

        while (inputtedHeight != STOP_PROGRAM_INDICATOR)
        {
            System.out.print("Enter a height in metres (0.0 to finish)> ");
            inputtedHeight = scanner.nextDouble();

            while (inputtedHeight < ABSOLUTE_MINIMUM_HEIGHT)
            {
                System.out.println("Negative heights are invalid.");
                System.out.print("Enter a height in metres (0.0 to finish)> ");
                inputtedHeight = scanner.nextDouble();
            }

            if (inputtedHeight != STOP_PROGRAM_INDICATOR)
            {
                if (inputtedHeight > maximumHeight)
                {
                    maximumHeight = inputtedHeight;
                } else if (inputtedHeight < minimumHeight)
                {
                    minimumHeight = inputtedHeight;
                }

                if (minimumHeight == DEFAULT_HEIGHT_SETTING)
                {
                    minimumHeight = maximumHeight;
                }

                System.out.println("Heights entered so far are in the range " + minimumHeight + " to " + maximumHeight);
            }
        }

        scanner.close();
    }
}
