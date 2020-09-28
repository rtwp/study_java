package d0928;
//2 675p
import java.util.ArrayList;

class Fruit                 { public String toString() { return "Fruit"; } }
class Apple extends Fruit   { public String toString() { return "Apple"; } }
class Grape extends Fruit   { public String toString() { return "Grape"; } }
class Toy                   { public String toString() { return "Toy"; } }

public class FruitBoxEx01 {
    public static void main(String[] args) {
        Box<Fruit> fruitB = new Box<Fruit>();
        Box<Apple> appleB = new Box<Apple>();
        Box<Toy> toyB = new Box<Toy>();

        fruitB.add(new Fruit());
        fruitB.add(new Apple());

        appleB.add(new Apple());
        appleB.add(new Apple());

        toyB.add(new Toy());

        System.out.println(fruitB);
        System.out.println(appleB);
        System.out.println(toyB);
    }
}

class Box<T> {
    ArrayList<T> list = new ArrayList<T>();
    void add(T item)    { list.add(item); }
    T get(int i)        { return list.get(i); }
    int size()          { return list.size(); }
    public String toString() { return list.toString(); }
}
