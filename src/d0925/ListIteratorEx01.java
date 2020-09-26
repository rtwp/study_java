package d0925;
//2 618p
import java.util.*;

public class ListIteratorEx01 {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(1);
        l.add(2);
        l.add(3);

        ListIterator it = l.listIterator();

        while(it.hasNext()) {
            System.out.print(it.next());
        }

        System.out.println();
        while(it.hasPrevious()) {
            System.out.print(it.previous());
        }
    }
}
