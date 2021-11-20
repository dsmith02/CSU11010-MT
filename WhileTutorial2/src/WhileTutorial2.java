import java.util.Scanner;

public class WhileTutorial2 {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Scanner inputtedLine = new Scanner(input.nextLine());

        int maximum = inputtedLine.nextInt();
        int minimum = inputtedLine.nextInt();

        while (inputtedLine.hasNext())
        {
            while (inputtedLine.hasNextInt())
            {
                if (maximum < inputtedLine.nextInt())
                {
                    maximum = inputtedLine.nextInt();
                }
            }
        }

        System.out.println("The maximum is " + maximum);
    }
}
