import java.util.Scanner;

public class FirstsAndPasses {

    /*  SELF ASSESSMENT of whether my code is easy to understand.
       1. Did I use easy-to-understand meaningful variable and constant names?
           Mark out of 10: 10
           Comment: All are accurate.
       2. Did I format the variable and constant names properly (in lowerCamelCase and UPPERCASE)?
           Mark out of 5: 5
           Comment: Yes.
       3. Did I indent the code appropriately?
           Mark out of 10: 10
           Comment: Yes.
       4. Did I implement a for loop to read the input as required?
           Mark out of 10: 10
           Comment: Yes
          Total Mark out of  35 (Add all the previous marks): 35
    */

    public static final int ABSOLUTE_MINIMUM_MARK = 0;
    public static final int PASS_MINIMUM_MARK = 40;
    public static final int HONOUR_MINIMUM_MARK = 70;
    public static final int MAXIMUM_MARK = 100;
    public static final int MINIMUM_STUDENTS_ALLOWED = 1;
    public static final double CONVERT_TO_PERCENT = 100.0;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students in the class> ");
        int totalStudents = input.nextInt();

        int firstClassAmount = 0;
        int passAmount = 0;
        for (int count = 1; (count <= totalStudents); count++)
        {
            System.out.print("Enter the percentage obtained by student " + count + "> ");
            double percentObtained = input.nextDouble();

            while ( (percentObtained < ABSOLUTE_MINIMUM_MARK) || (percentObtained > MAXIMUM_MARK) )
            {
                System.out.println("Invalid percentage. Please enter the mark again for this student.");
                System.out.print("Enter the percentage obtained by student " + count + "> ");
                percentObtained = input.nextDouble();
            }

            percentObtained = Math.round(percentObtained);

            if (percentObtained >= PASS_MINIMUM_MARK)
            {
                passAmount++;
            }

            if (percentObtained >= HONOUR_MINIMUM_MARK)
            {
                firstClassAmount++;
            }
        }

        if (totalStudents < MINIMUM_STUDENTS_ALLOWED)
        {
            System.out.println("Error: The number of students must be greater than 0");
        }
        else
        {
            double percentPassed = ((double) passAmount / (double) totalStudents) * CONVERT_TO_PERCENT;
            System.out.printf("In this class of " + totalStudents + " students, " + firstClassAmount
                    + " got a first class honour and %.1f%% passed the class", percentPassed);
        }
    }
}
