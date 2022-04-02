import java.util.Scanner;

public class Main {

    public static final double MAXIMUM_MARK = 100.0;
    public static final double MINIMUM_MARK = 0.0;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double[] listOfMarks = new double[5];

        System.out.print("Enter the 5 percentages obtained: ");
        for (int count = 0; count < listOfMarks.length; count++)
        {
            if (scanner.hasNextDouble())
            {
                listOfMarks[count] = scanner.nextDouble();
                if (listOfMarks[count] < MINIMUM_MARK || listOfMarks[count] > MAXIMUM_MARK)
                {
                    System.out.print("ERROR: INVALID PERCENTAGE FOR ENTRY NO. " + (count + 1) +
                            "\nEnter the remaining " + (listOfMarks.length - count) + " percentage(s): ");
                    count--;
                }
            }
            else
            {
                System.out.print("ERROR: INVALID PERCENTAGE FOR ENTRY NO. " + (count + 1) +
                        "\nEnter the remaining " + (listOfMarks.length - count) + " percentage(s): ");
                count--;
            }
            scanner.nextLine();
        }

        double average = determineAverageMark(listOfMarks);
        double[] finalisedList = new double[6];
        finalisedList[0] = average;
        System.arraycopy(listOfMarks, 0, finalisedList, 1, listOfMarks.length);

        int studentsAboveAverage = countAboveAverageStudents(finalisedList);
        System.out.printf("The average percentage is %.1f%% and %d student(s) attained a mark above the average.", average, studentsAboveAverage);
    }

    public static double determineAverageMark(double[] marks)
    {
        double sumOfMarks = 0;
        for (int index = 0; index < marks.length; index++)
        {
            sumOfMarks += marks[index];
        }
        return (sumOfMarks / marks.length);
    }

    public static int countAboveAverageStudents(double[] marks)
    {
        final int AVERAGE_MARK_LOCATION = 0;
        double average = marks[AVERAGE_MARK_LOCATION];
        int studentsAboveAverage = 0;

        for (int count = 1; count < marks.length; count++)
        {
            if (marks[count] > average)
            {
                studentsAboveAverage++;
            }
        }
        return studentsAboveAverage;
    }
}
