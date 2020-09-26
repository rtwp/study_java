package d0925;
//2 619p

import java.util.*;

public class IteratorEx02 {
    public static void main(String[] args) {
        ArrayList ori = new ArrayList(10);
        ArrayList co1 = new ArrayList(10);
        ArrayList co2 = new ArrayList(10);

        for(int i = 0; i < 10; i++)
            ori.add(i+"");

        Iterator it = ori.iterator();

        while(it.hasNext() )
            co1.add(it.next());

        System.out.println("original -> copy1 복사 ");
        System.out.println("ori = " + ori);
        System.out.println("co1 = " + co1);
        System.out.println(        );

        it = ori.iterator();

        while(it.hasNext()) {
            co2.add(it.next());
            it.remove();
        }

        System.out.println("original -> copy2 이동 ");
        System.out.println("ori = " + ori);
        System.out.println("co2 = " + co2);
    }
}
