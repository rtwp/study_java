package d0928;
//2 677p
import java.util.ArrayList;

class Fruit2                { public String toString() { return "Fruit"; } }
class Apple2 extends Fruit2 { public String toString() { return "Apple"; } }
class Grape2 extends Fruit2 { public String toString() { return "Grape"; } }

class Juice {
    String name;

    Juice(String name) { this.name = name + "Juice"; }
    public String toString() { return name; }
}

class Juicer {
    static Juice makeJuice(FruitB<? extends Fruit2> box) {
        String tmp = "";

        for(Fruit2 f : box.getList())
            tmp += f + " ";
        return new Juice(tmp);
    }
}

public class FruitBoxEx02 {
    public static void main(String[] args) {
        FruitB<Fruit2> fb = new FruitB<>();
        FruitB<Apple2> ab = new FruitB<>();

        fb.add(new Apple2());
        fb.add(new Grape2());
        ab.add(new Apple2());
        ab.add(new Apple2());

        System.out.println(Juicer.makeJuice(fb));
        System.out.println(Juicer.makeJuice(ab));
    }
}

class FruitB<T extends Fruit2> extends Box2<T> {}

class Box2<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item); }
    T get(int i)     { return list.get(i); }
    ArrayList<T> getList() { return list; }
    int size()       { return list.size(); }
    public String toString() { return list.toString(); }
}