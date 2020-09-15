package d0915;
//1 373p 직접
import java.util.*;

class Buyer {
    private int money = 0;
    private int point = 0;
    private Vector item = new Vector();

    Buyer() {   this(1000);  }
    Buyer(int money) {  this.money = money; }

    void buy(Product p) {
        if ( money < p.price)
            return;
        money -= p.price;
        point += p.bonus;
        System.out.println(p + " 구매완료 / -"  + p.price);
        item.add(p);
    }

    void refund(Product p) {
        if(item.remove(p)) {
            money += p.price;
            point -= (int)(p.price/10);
            System.out.println(p + " 환불완료 / +" + p.price);
        }
    }

    void summary() {
        System.out.print("잔액 : " + money + ",\t");
        System.out.println("포인트 : " + point);
        System.out.println(item.toString());
    }
}

class Product {
    final int price;
    final int bonus;

    Product(int price) {
        this.price = price;
        this.bonus = (int)(price/10);
    }
}

class Tv extends Product {
    Tv() {   super(100);   }
    public String toString() {  return "Tv";    }
}
class Com extends Product {
    Com() {   super(200);   }
    public String toString() {  return "Com";    }

}
class Audio extends Product {
    Audio() {   super(300);   }
    public String toString() {  return "Audio";    }

}

public class PolyArgumentsTest3 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Tv tv = new Tv();
        Com com = new Com();
        Audio audio = new Audio();
        
        b.buy(tv);
        b.buy(tv);
        b.buy(audio);
        b.summary(); // 요약
        System.out.println();
        
        b.refund(com); //환불
        b.summary();
    }
}
