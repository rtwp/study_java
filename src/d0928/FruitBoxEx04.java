package d0928;
import java.util.*;

class Fish {
    String name;
    int weight;

    Fish(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() { return name + "(" + weight + ")"; }
}

class Tuna extends Fish {
    Tuna(String name, int weight) { super(name, weight); }
}

class Eel extends Fish {
    Eel(String name, int weight) { super(name, weight); }
}

class TunaComp implements Comparator<Tuna> {
    public int compare(Tuna t1, Tuna t2) {
        return t2.weight - t1.weight;
    }
}

class EelComp implements Comparator<Eel> {
    public int compare(Eel t1, Eel t2) {
        return t2.weight - t1.weight;
    }
}

class FishComp implements Comparator<Fish> {
    public int compare(Fish t1, Fish t2) {
        return t1.weight - t2.weight;
    }
}

public class FruitBoxEx04 {
    public static void main(String[] args) {
        FishBag<Tuna> tb = new FishBag<Tuna>();
        FishBag<Eel>  eb = new FishBag<Eel>();

        tb.add(new Tuna("GreenTuna", 300));
        tb.add(new Tuna("GreenTuna", 200));
        tb.add(new Tuna("GreenTuna", 100));

        eb.add(new Eel("GreenEel", 400));
        eb.add(new Eel("GreenEel", 300));
        eb.add(new Eel("GreenEel", 200));

        Collections.sort(tb.getList(), new TunaComp());
        Collections.sort(eb.getList(), new EelComp());
        System.out.println(tb);
        System.out.println(eb);
        System.out.println();

        Collections.sort(tb.getList(), new FishComp());
        Collections.sort(eb.getList(), new FishComp());
        System.out.println(tb);
        System.out.println(eb);

    }
}

class FishBag<T extends Fish> extends Bag<T> {}

class Bag<T> {
    ArrayList<T> list = new ArrayList<T>();

    void add(T item) { list.add(item); }
    T get(int i) { return list.get(i); }
    ArrayList<T> getList() { return list; }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }
}
