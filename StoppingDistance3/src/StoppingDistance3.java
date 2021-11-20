import java.util.Scanner;

public class StoppingDistance3 {

    public static final double FRICTION_COEFFICIENT_DRY = 0.8;
    public static final double FRICTION_COEFFICIENT_WET = 0.4;
    public static final double FRICTION_COEFFICIENT_ICY = 0.1;
    public static final int FRICTION_COEFFICIENT_CONSTANT = 250;
    public static final double KMH_TO_METRES_PER_SECOND = 3.6;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double vehicleSpeed = 0.0;
        int age = 0;
        boolean correctInput = false;
        boolean roadIsWet = false;
        boolean roadIsIcy = false;

        while (!correctInput)
        {
            System.out.print("Enter the vehicle speed in km/hr> ");
            if (scanner.hasNextDouble())
            {
                vehicleSpeed = scanner.nextDouble();
                correctInput = true;
            }
            else
            {
                System.out.println("Error: Enter a positive number for the speed of the vehicle.");
                scanner.next();
            }
        }

        correctInput = false;
        while (!correctInput)
        {
            System.out.print("Enter the age in years> ");
            if (scanner.hasNextInt())
            {
                age = scanner.nextInt();
                correctInput = true;
            }
            else
            {
                System.out.println("Error: Enter a positive whole number for the age of the driver.");
                scanner.next();
            }
        }

        correctInput = false;
        while (!correctInput)
        {
            System.out.print("Is the road wet (Yes/No)? ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("yes"))
            {
                roadIsWet = true;
                correctInput = true;
            }
            else if (input.equalsIgnoreCase("no"))
            {
                correctInput = true;
            }
            else
            {
                System.out.println("Error: You must enter either Yes or No.");
            }
        }

        correctInput = false;
        while (!correctInput)
        {
            System.out.print("Is the road icy (Yes/No)? ");
            String input = scanner.next();
            if (input.equalsIgnoreCase("yes"))
            {
                roadIsIcy = true;
                correctInput = true;
            }
            else if (input.equalsIgnoreCase("no"))
            {
                correctInput = true;
            }
            else
            {
                System.out.println("Error: You must enter either Yes or No.");
            }
        }
    }

    public static double computeCoefficientOfFriction(boolean roadIsIcy, boolean roadIsWet)
    {
        if (roadIsIcy)
        {
            return FRICTION_COEFFICIENT_ICY;
        }

        if (roadIsWet)
        {
            return FRICTION_COEFFICIENT_WET;
        }

        return FRICTION_COEFFICIENT_DRY;
    }

    public static double computeBrakingDistance(double vehicleSpeed, boolean roadIsIcy, boolean roadIsWet)
    {
        double coefficientOfFriction = computeCoefficientOfFriction(roadIsIcy, roadIsWet);
        return (Math.pow(vehicleSpeed, 2) / (FRICTION_COEFFICIENT_CONSTANT * coefficientOfFriction) );
    }

    public static double computeReactionDistance(double vehicleSpeed, int age)
    {
        double driverReactionTime = 1.0 + Math.abs(age - 24) * 0.05;
        double speed = vehicleSpeed / KMH_TO_METRES_PER_SECOND;
        return (speed * driverReactionTime);
    }

    public static int computeStoppingDistance(double vehicleSpeed, int age, boolean roadIsIcy, boolean roadIsWet)
    {
        double stoppingDistance = computeReactionDistance(vehicleSpeed, age)
                + computeBrakingDistance(vehicleSpeed, roadIsIcy, roadIsWet);

        return (int) stoppingDistance;
    }
}
