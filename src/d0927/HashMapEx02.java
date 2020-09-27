package d0927;
//2 647p
import java.util.*;

public class HashMapEx02 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        /*
        map.put("kim", 90);
        map.put("kim", 100);
        map.put("lee", 100);
        map.put("kang", 80);
        map.put("an", 90);
*/

        map.put("김자바", 90);
        map.put("김자바", 100);
        map.put("이자바", 100);
        map.put("강자바", 80);
        map.put("안자바", 90);

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext() ) {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("name : " + e.getKey() + ", score" + e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 : " + set);

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while( it.hasNext() ) {
            Integer i = (Integer)it.next();
            total += i.intValue();
        }

        System.out.println("total " + total);
        System.out.println("average " + (float)total/set.size());
        System.out.println("maxvalue " + Collections.max(values));
        System.out.println("maxvalue " + Collections.min(values));
    }
}
