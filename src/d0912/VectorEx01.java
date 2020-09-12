package d0912;
//2 588p
import java.util.*;

public class VectorEx01 {
    public static void main(String[] args) {
        Vector v = new Vector(5);
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize(); // 용량(capacity)의 빈 공간을 없앤다
        System.out.println(" ~ After trimToSize() ~ ");
        print(v);
        System.out.println();

        v.ensureCapacity(6);
        System.out.println(" ~ After ensureCapacity(6) ~ ");
        print(v);
        System.out.println();

        v.setSize(7);
        System.out.println(" ~ After setSize(7) ~ ");
        print(v);
        System.out.println();

        v.clear();
        System.out.println(" ~ After clear() ~ ");
        print(v);
    }
    static void print(Vector v) {
        System.out.println(v);
        System.out.println("    size : " + v.size());
        System.out.println("capacity : " + v.capacity());
    }
}
