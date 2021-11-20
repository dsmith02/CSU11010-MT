import java.sql.SQLOutput;
import java.util.Scanner;

public class FunctionReview {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter three numbers: ");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();

        System.out.println("The maximum number is " + calculateMaximum(numberOne, numberTwo, numberThree));
    }

    public static int calculateMaximum(int numberA, int numberB, int numberC)
    {
        int maximum = numberA;

        if (maximum < numberB)
        {
            maximum = numberB;
        }

        if (maximum < numberC)
        {
            maximum = numberC;
        }

        return maximum;
    }
}
