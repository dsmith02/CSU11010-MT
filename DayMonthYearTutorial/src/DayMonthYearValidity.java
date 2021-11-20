import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DayMonthYearValidity {

    public static final int FEBRUARY = 2;
    public static final int APRIL = 4;
    public static final int JUNE = 6;
    public static final int SEPTEMBER = 9;
    public static final int NOVEMBER = 11;
    public static final int MAXIMUM_DAY = 31;
    public static final int MINIMUM_DAY = 1;
    public static final int MAXIMUM_MONTH = 12;
    public static final int MINIMUM_MONTH = 1;
    public static final int STANDARD_DAYS_IN_MONTH = 31;
    public static final int MINIMUM_DAYS_IN_MONTH = 1;
    public static final int NON_STANDARD_DAYS_IN_MONTH = 30;
    public static final int DAYS_IN_FEBRUARY = 28;
    public static final int DAYS_IN_FEBRUARY_LEAP = 29;
    public static final int ERROR_CODE = -1;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int day = 0;
        int month = 1;
        int year = 1;
        boolean correctInput = false;

        while (!correctInput)
        {
            System.out.println("Enter the day> ");
            if (scanner.hasNextInt())
            {
                day = scanner.nextInt();
                if (day <= STANDARD_DAYS_IN_MONTH && day >= MINIMUM_DAYS_IN_MONTH)
                {
                    correctInput = true;
                }
                else
                {
                    System.err.println("ERROR: The number days must be greater than or equal to 1 and less than or equal to 31.");
                }
            }
            else
            {
                System.err.println("ERROR: The number of days must be a positive whole number.");
                scanner.next();
            }
        }

        System.out.println(validDate(day, month, year));
    }

    public static boolean validDate(int day, int month, int year)
    {
        if (day <= daysInMonth(month, year) )
        {
            return true;
        }

        return false;
    }

    public static int daysInMonth(int month, int year)
    {
        if (month >= MINIMUM_MONTH && month <= MAXIMUM_MONTH)
        {
            switch (month)
            {
                case FEBRUARY:
                    if (isLeapYear(year))
                    {
                        return DAYS_IN_FEBRUARY_LEAP;
                    }
                    else
                    {
                        return DAYS_IN_FEBRUARY;
                    }
                case APRIL:
                case JUNE:
                case SEPTEMBER:
                case NOVEMBER:
                    return NON_STANDARD_DAYS_IN_MONTH;
                default:
                    return STANDARD_DAYS_IN_MONTH;
            }
        }
        return ERROR_CODE;
    }

    public static boolean isLeapYear(int year)
    {
        if ( (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0))
        {
            return true;
        }
        return false;
    }
}
