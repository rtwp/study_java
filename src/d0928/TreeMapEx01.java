package d0928;
//2 656p
import java.util.*;

public class TreeMapEx01 {
    public static void main(String[] args) {
        String[] data = { "a", "s", "a", "s", "d", "s",
                "a", "s", "s", "s", "f", "d" };

        TreeMap map = new TreeMap();

        for(int i = 0; i < data.length; i ++) {
            if ( map.containsKey(data[i]) ) {
                Integer val = (Integer)map.get(data[i]);
                map.put(data[i], new Integer(val.intValue() + 1) );
            } else {
                map.put(data[i], new Integer(1) );
            }
        }

        Iterator it = map.entrySet().iterator();

        System.out.println("@ 기본정렬 @");
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            int val =  ( (Integer)entry.getValue() ).intValue();
            System.out.println(
                    entry.getKey() + " : " + printBar('#', val) + " " + val);
        }
        System.out.println();
        /*
        Set set = map.entrySet();
        List list = new ArrayList(set);
        */
        List list = new ArrayList(map.entrySet());

        // static void sort(List list, Comparator c)
        Collections.sort(list, new ValueComparator());

        it = list.iterator();

        System.out.println("@ 값의 크기가 큰 순서로 정렬 @");
        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            int val = ( (Integer)entry.getValue() ).intValue();
            System.out.println(
                    entry.getKey() + " : " + printBar('#', val) + " " + val);
        }

    }

    static class ValueComparator implements Comparator {
        public int compare(Object o1, Object o2) {
            if(o1 instanceof Map.Entry && o2 instanceof Map.Entry) {
                Map.Entry e1 = (Map.Entry)o1;
                Map.Entry e2 = (Map.Entry)o2;

                int v1 = ( (Integer)e1.getValue() ).intValue();
                int v2 = ( (Integer)e2.getValue() ).intValue();

                return v2 - v1;
            }
            return -1;
        }
    }

    static String printBar(char ch, int val) {
        char[] bar = new char[val];

        for(int i = 0; i < bar.length; i++)
            bar[i] = ch;

        return new String(bar);
    }

}
