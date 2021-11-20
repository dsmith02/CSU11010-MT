import java.util.Scanner;

public class MonthsAndDays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a month number (1-12): ");
        int monthNumber = scanner.nextInt();

        while (monthNumber < 1 || monthNumber > 12)
        {
            System.out.print("The monht number must be in the range 1-12: ");
            monthNumber = scanner.nextInt();
        }

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = ( (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) );

        if (isLeapYear)
        {
            switch (ye)
        }
    }
}
