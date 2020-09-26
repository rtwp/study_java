package d0926;
//2 634p
import java.util.*;

public class HashSetEx03 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Man("David", 10));
        set.add(new Man("David", 10));

        System.out.println(set);
    }
}

class Man {
    String name;
    int age;

    Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }
}
