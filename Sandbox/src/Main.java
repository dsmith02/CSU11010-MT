import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        try
        {
            String userInput = input.nextLine();
            double test = Double.parseDouble(userInput);
            System.out.println("POO");
        }
        catch (InputMismatchException exception)
        {
            System.out.println("INCORRECT INPUT");
        }
/*
        int value1 = input.nextInt();
        int value2 = input.nextInt();

        if ((value1 > 0) && (value2 > 0))
        {
            int result = 0;
            int count = 1;

            while (count <= value1)
            {
                int temp = 1;
                for (int count2 = 0; (count2 < value2); count2++)
                {
                    temp *=count;
                }

                result += temp;
                count++;
            }

            System.out.println(result);
        }
         */
    }
}
