import java.util.Scanner;

public class VertebrateClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String vertebrate = "";
        boolean stop = false;

        System.out.println("Does your vertebrate have fins?");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            vertebrate = "fish";
        } else {
            System.out.println("Is your vertebrate cold or warm blooded?");
            if (scanner.nextLine().equalsIgnoreCase("warm")) {
                System.out.println("Is your animals covering hair/fur or feathers? (Hair/Feathers)");
                if (scanner.nextLine().equalsIgnoreCase("hair")) {
                    vertebrate = "mammal";
                } else {
                    vertebrate = "bird";
                }
            } else {
                System.out.println("Does your vertebrate have moist or scaly skin?");
                if (scanner.nextLine().equalsIgnoreCase("moist")) {
                    vertebrate = "amphibian";
                } else {
                    vertebrate = "reptile";
                }
            }

            System.out.println("The class of your vertebrate is " + vertebrate + ".");
        }
    }
}
