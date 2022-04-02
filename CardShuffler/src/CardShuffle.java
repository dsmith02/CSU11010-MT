import java.util.Random;

public class CardShuffle {

    public static void main(String[] args)
    {
        int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        shuffleDeck(cards);
    }

    public static void shuffleDeck(int[] deck)
    {
        Random randomiser = new Random();

        for (int index = 0; index < deck.length; index++)
        {
            int randomIndex = randomiser.nextInt(deck.length);
            int tempContainer = deck[randomIndex];
            deck[randomIndex] = deck[index];
            deck[index] = tempContainer;
        }
    }
}
