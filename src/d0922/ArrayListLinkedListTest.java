package d0922;
//2 600p
import java.util.*;

public class ArrayListLinkedListTest {
    static int x = 2000000;

    public static void main(String[] args) {
        //추가할 데이터의 개수를 고려해 충분히 크게 잡아야한다.
        ArrayList al = new ArrayList(x);
        LinkedList ll = new LinkedList();

        System.out.println("순차적 추가");
        System.out.println("LinkedList : " + add1(ll));
        System.out.println("ArrayList : " + add1(al));
        System.out.println();

        System.out.println("중간에 추가");
        System.out.println("LinkedList : " + add2(ll));
        System.out.println("ArrayList : " + add2(al));
        System.out.println();

        System.out.println("중간에 삭제");
        System.out.println("LinkedList : " + remove2(ll));
        System.out.println("ArrayList : " + remove2(al));
        System.out.println();

        System.out.println("순차적 삭제");
        System.out.println("LinkedList : " + remove1(ll));
        System.out.println("ArrayList : " + remove1(al));
        System.out.println();
    }

    public static long add1(List list) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < x/ 2; i++) list.add(i + "");
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long add2(List list) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < x/ 200; i++) list.add(500, "X");
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long remove1(List list) {
        long start = System.currentTimeMillis();
        for(int i = list.size() - 1; i >= 0; i--) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long remove2(List list) {
        long start = System.currentTimeMillis();
        for(int i = 0; i < x/ 200; i++) list.remove(i);
        long end = System.currentTimeMillis();
        return end - start;
    }
}
