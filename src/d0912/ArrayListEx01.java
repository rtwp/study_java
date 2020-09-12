package d0912;
//2 585p
import java.util.*;

public class ArrayListEx01 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5));
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        Collections.sort(list1); // 정렬
        Collections.sort(list2);

        // list1에 list2가 포함되어 있는지 확인
        System.out.println("list1.containsAll(list2) : "
                + list1.containsAll(list2));
        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");
        print(list1, list2);

        //list1에서 list2와 겹치는 부분 빼고 다 삭제
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        print(list1, list2);

        //list2에서 list1에 포함한 객체들 삭제
        for(int i = list2.size() - 1; i >= 0 ; i--) {
        //for(int i = 0; i < list2.size(); i++) {
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    } // main

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}