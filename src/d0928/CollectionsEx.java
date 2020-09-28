package d0928;
//2 666p
import java.util.*;
import static java.util.Collections.*;

public class CollectionsEx {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1, 2, 3, 4, 5);
        System.out.println(list);

        rotate(list, 2); // 우로 2칸씩 이동
        System.out.println(list);

        swap(list, 0, 2); // index 0, 2 교환
        System.out.println(list);

        shuffle(list);
        System.out.println("shuffle" + list);

        sort(list);
        System.out.println(list);

        sort(list, reverseOrder());
        System.out.println(list);

        int idx = binarySearch(list, 3);
        System.out.println("indx of 3 = " + idx);

        System.out.println("max = " + max(list));
        System.out.println("min = " + min(list));
        System.out.println("min = " + max(list, reverseOrder()));

        fill(list, 9);
        System.out.println(list);

        List newList = nCopies(list.size(), 2);
        System.out.println("new " + newList);

        System.out.println(disjoint(list, newList));

        copy(list, newList);
        System.out.println("new " + newList);
        System.out.println("old " + list);

        replaceAll(list, 2, 1);
        System.out.println(list);

        Enumeration e = enumeration(list);
        ArrayList list2 = list(e);

        System.out.println(list2);
    }
}
