import java.util.Scanner;

public class StoppingDistance1 {

    public static void main(String[] args) {
        /*  SELF ASSESSMENT of whether my code is easy to understand.
        1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 5: 5
       Comment: Didn't have to use any constants.
        2. Did I use easy-to-understand, meaningful CONSTANT names?
       Mark out of 5: 5
       Comment: As above.
        3. Did I format the CONSTANT names properly (in UPPERCASE)?
       Mark out of 5: 5
       Comment: As above.
        4. Did I use easy-to-understand meaningful variable names?
       Mark out of 10: 10
       Comment: Yes, all variable names match the concepts they represent from the problem description.
        5. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 5: 5
       Comment: Yes.
        6. Did I indent the code appropriately?
       Mark out of 10: 10
       Comment: Yes
       Total Mark out of  40 (Add all the previous marks): 40
        */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter vehicle speed in km/hr> ");
        double vehicleSpeed = input.nextDouble();

        System.out.print("Enter reaction time in seconds> ");
        double reactionTime = input.nextDouble();
        input.close();

        double reactionDistance = (vehicleSpeed / 3.6) * reactionTime;
        double brakingDistance = Math.pow(vehicleSpeed / 3.6, 2) / 20;

        System.out.printf("At a speed of %.1fkm/hr and with a reaction time of %.1fs, the stopping distance would be %.1fm",
                vehicleSpeed, reactionTime, (reactionDistance + brakingDistance));
    }
}
