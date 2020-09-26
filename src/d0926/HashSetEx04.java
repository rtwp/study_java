package d0926;
//2 634p
import java.util.*;

public class HashSetEx04 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Man2("David", 10));
        set.add(new Man2("David", 10));

        System.out.println(set);
    }
}

class Man2 {
    String name;
    int age;

    Man2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if ( obj instanceof Man2 ) {
            Man2 tmp = (Man2)obj;
            return name.equals(tmp.name) && age == tmp.age;
        }

        return false;
    }

    public int hashCode() {
        //return (name+age).hashCode();
        return Objects.hash(name, age);
    }

    public String toString() {
        return name + ":" + age;
    }
}
