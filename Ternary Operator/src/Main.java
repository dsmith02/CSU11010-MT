import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(input.nextInt() % 2 == 0 ? "Even" : "Odd");

        double examPercentage = input.nextDouble();

        System.out.println("You got " + examPercentage + "% so you " +
                (examPercentage >= 40.0 ? "passed" : "failed") + " your exam.");
    }
}
