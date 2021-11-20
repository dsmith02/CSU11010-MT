public class Calculator {

    public static void main(String[] args)
    {
        System.out.println("Welcome to my first calculator.");
    }

    public static int addition(int operandOne, int operandTwo)
    {
        return (operandOne + operandTwo);
    }

    public static int subtraction(int operandOne, int operandTwo)
    {
        return (operandOne - operandTwo);
    }

    public static int multiplication(int operandOne, int operandTwo)
    {
        return (operandOne * operandTwo);
    }

    public static double division(int numerator, int denominator)
    {
        if (denominator == 0)
        {
            return -1;
        }
        return (numerator / denominator);
    }

    public static double remainderOnDivision(int numerator, int denominator)
    {
        if (denominator == 0)
        {
            return -1;
        }
        return (numerator % denominator);
    }

    public static int absoluteValue(int value)
    {
        if (value < 0)
        {
            return (0 - value);
        }
        return value;
    }
}


