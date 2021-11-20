import java.util.Scanner;

public class IntegerMultiples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What integer would you like to multiply? ");
        int number = scanner.nextInt();

        while (number < 1) {
            System.out.println("You must enter a number greater than 1!");
            System.out.print("Enter an integer greater than or equal 1: ");
            number = scanner.nextInt();
        }

        System.out.print("Enter the which integer you would like to stop at: ");
        int limit = scanner.nextInt();

        while (limit < 1) {
            System.out.println("You must enter a number greater than 1!");
            System.out.print("Enter a limit greater than or equal 1: ");
            limit = scanner.nextInt();
        }

        System.out.print("The multiples of " + number + " up to " + limit
                + " are 0");

        for (int count = 1; number < limit; count++) {
            int output = number * count;

            if (output > limit) {
                break;
            }

            System.out.print(", " + output);
        }
    }
}
