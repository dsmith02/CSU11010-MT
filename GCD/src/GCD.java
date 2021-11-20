public class GCD {

    public static void main(String[] args) {
        int numberOne = 10876;
        int numberTwo = 5999812;
        int GCD = 1;

        for (int count = 1; (count <= numberOne) && (count <= numberTwo); count++) {
            if ( (numberOne % count == 0) && (numberTwo % count == 0) ) {
                GCD = count;
            }
        }

        System.out.println("The GCD of the two numbers is: " + GCD);
    }
}
