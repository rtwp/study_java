package Excercise;

import netscape.javascript.JSUtil;

public class Ex06_02 {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();
        System.out.println(card1.info()); // 3
        System.out.println(card2.info()); // 1K
    }
}

class SutdaCard {
    int num;
    boolean isKwang;

    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    String info() {
        if( isKwang)
            return num+ "K";
        return "" + num;
    }

}