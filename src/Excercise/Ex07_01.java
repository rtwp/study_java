package Excercise;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        //1~10, 138 K
        for(int i = 0; i < cards.length; i++) {
            if( i == 0 || i == 2 || i ==  7)
                cards[i] = new SutdaCard(i %10 + 1, true);

            else
                cards[i] = new SutdaCard(i %10 + 1, false);

        }
    }

    void shuffle() {
        SutdaCard tmp = new SutdaCard();

        for(int i = 0; i < cards.length; i++) {
            int x =(int)( Math.random() * cards.length);
            tmp = cards[x];
            cards[x] = cards[i];
            cards[i] = tmp;
        }
    }
    SutdaCard pick(int index) {
        return cards[index];
    }
    SutdaCard pick() {
        return cards[(int)( Math.random() * cards.length)];
    }
}
public class Ex07_01 {
    public static void main(String[] args) {
        SutdaDeck deck = new SutdaDeck();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        for(int i = 0; i < deck.cards.length; i++)
            System.out.print(deck.cards[i] + ",");

        System.out.println();
        System.out.println(deck.pick(0));
    }
}
