import java.util.Scanner;

public class WizardCurrency {

    public static final int SICKLES_IN_GALLEON = 17;
    public static final int KNUTS_IN_GALLEON = 493;
    public static final int KNUTS_IN_SICKLE = 29;

    public static void main(String[] args)
    {
        System.out.println("1. Convert Wizarding Currency to GBP");
        System.out.println("2. Convert Knutz to Wizarding Currency and GBP");
        System.out.println("3. Convert GBP to Wizarding Currency");
        System.out.println("4. Quit");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Select function> ");
        String function = scanner.nextLine();
    }

    public static int convertGBPToKnuts(int pounds, int pence)
    {
        
    }

    public static String convertKnutsToWizardingCurrency(int totalKnuts)
    {
        return "";
    }

    public static String convertGBPToWizardingCurrency(int pounds, int pence)
    {

    }

    public static int covertWizardingCurrencyToKnuts(int numGalleons, int numSickles, int numKnuts)
    {

    }

    public static int convertWizardingCurrencyToPence(int numGalleons, int numSickles, int numKnuts)
    {

    }

    public static double getNumberFromUser(String prompt, String errorMessage, Scanner input, boolean integerRequired)
    {

    }
}
