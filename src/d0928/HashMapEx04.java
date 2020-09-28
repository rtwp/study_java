package d0928;
//2 650p
import java.util.*;

public class HashMapEx04 {
    public static void main(String[] args) {
        String[] data = { "a", "s", "a", "s", "d", "s",
                "a", "s", "s", "s", "f", "d" };

        HashMap map = new HashMap();

        for(int i = 0; i < data.length; i ++) {
            if ( map.containsKey(data[i]) ) {
                Integer val = (Integer)map.get(data[i]);
                map.put(data[i], new Integer(val.intValue() + 1) );
            } else {
                map.put(data[i], new Integer(1) );
            }
        }

        Iterator it = map.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();
            int val =  ( (Integer)entry.getValue() ).intValue();
            System.out.println(
                    entry.getKey() + " : " + printBar('#', val) + " " + val);
        }
    }

    static String printBar(char ch, int val) {
        char[] bar = new char[val];

        for(int i = 0; i < bar.length; i++)
            bar[i] = ch;

        return new String(bar);
    }

}
