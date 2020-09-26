package d0926;
//2 632p
import java.util.*;

public class HashSetEx01 {
    public static void main(String[] args) {
        Object[] oA = {"1", new Integer(1),
                "2", "2", "3", "3", "4", "4", "4" };
        Set set = new HashSet();

        for(int i = 0; i < oA.length; i++)
            set.add(oA[i]);

        System.out.println(set);


    }
}
