import java.util.Scanner;

public class WhileTutorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        String[] splitString = new String[userInput.length()];

        for (int count = 0; count < userInput.length(); count++)
        {
            splitString = userInput.split(" ");
        }

        int maximum = Integer.parseInt(splitString[0]);

        for (int count = 1; count < splitString.length; count++)
        {
            if (maximum < Integer.parseInt(splitString[count]))
            {
                maximum = Integer.parseInt(splitString[count]);
            }
        }

        int minimum = Integer.parseInt(splitString[0]);
        for (int count = 1; count < splitString.length; count++)
        {
            if (minimum > Integer.parseInt(splitString[count]))
            {
                minimum = Integer.parseInt(splitString[count]);
            }
        }

        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }
}
