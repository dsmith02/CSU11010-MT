public class AddToArray {

    public static void main(String[] args)
    {
        int[] poo = {4, 9, 11, 22, 22, 15};
        int number = 12241;
        int digit = ((number % 100) / 10) % 10;
        System.out.println(digit);
    }



    public static int[] extend(int[] original, int increaseBy, int setValue)
    {
        int[] newArray = new int[(original == null) ? 1 : original.length + increaseBy];
        if (original != null)
        {
            System.arraycopy(original, 0, newArray, 0, original.length);

            for (int index = 0; index < newArray.length; index++)
            {
                newArray[index] = setValue;
            }
        }
        return newArray;
    }
}
