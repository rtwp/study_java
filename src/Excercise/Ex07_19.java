package Excercise;

public class Ex07_19 {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        b.buy(new Tv());
        b.buy(new Computer());
        b.buy(new Tv());
        b.buy(new Audio());
        b.buy(new Computer());
        b.buy(new Computer());
        b.buy(new Computer());
        b.summary();
    }
}

class Buyer {
    private int money = 1000;
    private Product[] cart = new Product[3];
    int i = 0;

    void buy(Product p) {
        if ( p.price > money) {
            System.out.println("잔액부족 - " + p);
            return;
        }
        money -= p.price;
        add(p);
    }

    void add(Product p) {
        if( i >= cart.length) {
            Product[] newCart = new Product[cart.length * 2];
            System.arraycopy(cart, 0, newCart, 0, cart.length);
            cart = newCart;
        }
        cart[i++] = p;
    }

    void summary() {
        int total = 0;
        System.out.printf("구입한 물건 : ");
        for(int i = 0; i < cart.length; i++) {
            System.out.print( cart[i] + "," );
            total += cart[i].price;
        }
        System.out.println();

        System.out.println("사용한 금액 : " + total);

        System.out.println("남은 돈 : " + money);
    }

}

class Product {
    int price;
    Product(int price) {
        this.price = price;
    }
}
class Tv extends Product {
    Tv() { super(100); }
    public String toString() { return "Tv"; }
}
class Computer extends Product {
    Computer() { super(200); }
    public String toString() { return "Computer";}
}
class Audio extends Product {
    Audio() { super(50); }
    public String toString() { return "Audio"; }
}