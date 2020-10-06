package Excercise;
import java.util.*;
//SutdaCard.class 는 Ex06_02에 있음

public class Ex11_12 {
    public static void main(String[] args)
    throws Exception {
        S_deck deck = new S_deck();

        deck.shuffle();
       Player[] pArr = {
        new Player("타짜", deck.pick(), deck.pick()),
        new Player("고수", deck.pick(), deck.pick()),
        new Player("중수", deck.pick(), deck.pick()),
        new Player("하수", deck.pick(), deck.pick()),
        new Player("초짜", deck.pick(), deck.pick())
       };

       TreeMap rank = new TreeMap(new Comparator() {
           public int compare(Object o1, Object o2) {
               if( o1 instanceof Player && o2 instanceof Player) {
                   Player p1 = (Player) o1;
                   Player p2 = (Player) o2;

                   return p2.point - p1.point;

                   /*
                   if( p1.point <= p2.point)
                       return 1;
                   else
                       return -1;
                   */
               }
               return -1;
           }
       });

        for(int i=0; i < pArr.length;i++) {
            Player p = pArr[i];
            rank.put(p, deck.getPoint(p));
            System.out.println(p+" "+deck.getPoint(p));
        }

        System.out.println();
        System.out.println("1위 : "+rank.firstKey());
    }
}

class S_deck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    int pos = 0; // 다음에 가져올 카드 위치
    HashMap jokbo = new HashMap(); // 족보저장소

    S_deck() {
        for(int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = i < 10 && (num == 1 || num == 3 || num == 8);

            cards[i] = new SutdaCard(num, isKwang);
        }

        registerJokbo();
    }

    void registerJokbo() {
        jokbo.put("KK", 4000);

        jokbo.put("1010",3100); jokbo.put("12", 2060);
        jokbo.put("99", 3090); jokbo.put("21", 2060);
        jokbo.put("88", 3080); jokbo.put("14", 2050);
        jokbo.put("77", 3070); jokbo.put("41", 2050);
        jokbo.put("66", 3060); jokbo.put("19", 2040);
        jokbo.put("55", 3050); jokbo.put("91", 2040);
        jokbo.put("44", 3040); jokbo.put("110", 2030);
        jokbo.put("33", 3030); jokbo.put("101", 2030);
        jokbo.put("22", 3020); jokbo.put("104", 2020);
        jokbo.put("11", 3010); jokbo.put("410", 2020);
        jokbo.put("46", 2010);
        jokbo.put("64", 2010);

    }

    int getPoint(Player p) {
        if(p == null) return 0;

        SutdaCard c1 = p.c1;
        SutdaCard c2 = p.c2;

        Integer result = 0;

        if( c1.isKwang && c2.isKwang)
            result = (Integer)jokbo.get("KK");
        else {
            result = (Integer)jokbo.get(""+ c1.num + c2.num);

            if(result == null)
                result = (int)(c1.num + c2.num % 10 + 1000);
        }

        p.point = result.intValue();

        return p.point;

    }

    SutdaCard pick() throws Exception {
        SutdaCard c = null;

        if(0 <= pos && pos < CARD_NUM) {
            c = cards[pos];
            cards[pos++] = null;
        } else {
       throw new Exception("남아있는 카드가 없습니다");
        }
        return c;
    }

    void shuffle() {
        for(int x=0; x < CARD_NUM * 2; x++) {
            int i = (int)(Math.random() * CARD_NUM);
            int j = (int)(Math.random() * CARD_NUM);
            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }
} //S_deck

class Player {
    String name;
    SutdaCard c1;
    SutdaCard c2;

    int point; // 카드의 등급에 따른 점수 - 새로 추가

    Player(String name, SutdaCard c1, SutdaCard c2) {
        this.name = name ;
        this.c1 = c1 ;
        this.c2 = c2 ;
    }
    public String toString() {
        return "["+name+"]"+ c1.toString() +","+ c2.toString();
    }
} // class Player