package d0922;
//2 602p
import java.util.*;

public class ArrayListLinkedListTest2 {
    static int x = 1_000_000;

    public static void main(String[] args) {
        ArrayList al = new ArrayList(x);
        LinkedList ll = new LinkedList();
        add(al);
        add(ll);

        System.out.println("접근시간 테스트");
        System.out.println("ArrayList : " + access(al));
        System.out.println("LinkedList : " + access(ll));
    }

    public static void add(List list) {
        for(int i = 0; i < x / 10; i++) list.add(i+"");
    }

    public static long access(List list) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < x / 10; i++) list.get(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
