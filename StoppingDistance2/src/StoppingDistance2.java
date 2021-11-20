import java.util.Scanner;

public class StoppingDistance2 {

    /*  SELF ASSESSMENT of whether my code is easy to understand.
       1. Did I use easy-to-understand meaningful variable and constant names?
           Mark out of 15: 15
           Comment: Yes, all variable names accurately represent the concept they are conveying.
       2. Did I format the variable and constant names properly?
           Mark out of 5: 5
           Comment: All used camel case.
       3. Did I indent the code appropriately?
           Mark out of 10: 10
           Comment: All appropriately indented.
          Total Mark out of  30 (Add all the previous marks): 30
    */

    public static void main(String[] args)
    {

        final double CONVERT_TO_METRES_PER_SECOND = 3.6;
        final double FRICTION_COEFFICIENT_FACTOR = 250.0;

        Scanner scanner = new Scanner(System.in);
        double reactionTime = 2.0;
        double frictionCoefficient = 0.8;

        System.out.print("Enter vehicle speed in km/hr> ");
        double vehicleSpeed = scanner.nextDouble();

        System.out.print("Enter age in years> ");
        int age = scanner.nextInt();

        System.out.print("Is the road wet (Yes/No)? ");
        boolean isRoadWet = scanner.next().equalsIgnoreCase("Yes");

        if (age > 60)
        {
            reactionTime = 3.0;
        }
        else if (age >= 50)
        {
            reactionTime = 2.5;
        }

        if (isRoadWet)
        {
            frictionCoefficient = 0.4;
        }

        double brakingDistance = Math.pow(vehicleSpeed, 2) / (FRICTION_COEFFICIENT_FACTOR * frictionCoefficient);
        double reactionDistance = (vehicleSpeed / CONVERT_TO_METRES_PER_SECOND) * reactionTime;

        System.out.println("As the road is " + (isRoadWet ? "wet" : "dry" ) + ", the coefficient of friction is " + frictionCoefficient);
        System.out.printf("As the driver is " + age + " years old, his/her reaction time is %.1fs\n", reactionTime);
        System.out.printf("At a speed of %.1fkm/hr, the reaction distance is %.0fm, the braking distance is %.0fm" +
                ", and so the stopping distance is %.0fm", vehicleSpeed, reactionDistance, brakingDistance, (reactionDistance + brakingDistance));
    }
}
