package d0914;
//1 320p 직접

public class DeckTest {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = d.pick();
        System.out.println(c);

        System.out.println();

        d.shuffle();
        c = d.pick();
        System.out.println(c);
    }
}

class Card {
    private static int[] SIZE = {60, 90};
    static final int SHAPE_MAX = 4;
    static final int NUM_MAX = 13;
    static final String[] SHAPE_INDEX = { "SPADE", "DIAMOND", "HEART", "CLOVER" };
    static final String NUM_INDEX = "A23456789XJQK";

    final String SHAPE;
    final char NUM;

    Card() {
        this(0, 0);
    }

    Card(int shape, int num) {
        this(SHAPE_INDEX[shape], num);
    }

    Card(String shape, int num) {
        SHAPE = shape;
        NUM = NUM_INDEX.charAt(num);
    }

    public String toString() {
        return SHAPE + ", " + NUM;
    }
}

class Deck {
    static final int NUM = 52;
    Card[] cardArr = new Card[NUM];

    Deck() {
        for(int i = 0; i < Card.SHAPE_MAX; i++) {
            for(int j =0; j < Card.NUM_MAX; j++) {
                cardArr[i * 13 + j] = new Card(i, j);
            }
        }
    }

    Card pick() {   return cardArr[0];  }

    void shuffle() {
        int i = 0;

        while(i != cardArr.length) {
            int ran = (int)(Math.random() * 52);

            Card tmp = cardArr[ran];
            cardArr[ran] = cardArr[i];
            cardArr[i] = tmp;
            i++;
        }
    }

    public void view() {
        for(int i = 0; i < Card.SHAPE_MAX; i++) {
            for(int j =0; j < Card.NUM_MAX; j++)
                System.out.print(
                        "[" +cardArr[i * 13 + j].toString() + "]");
            System.out.println();
        }
    }
}