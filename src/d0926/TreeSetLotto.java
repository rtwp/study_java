package d0926;
//2 641p
import java.util.*;

public class TreeSetLotto {
    public static void main(String[] args) {
        Set set = new TreeSet();

        for(int i = 0; set.size() < 6; i++) {
            int n = (int) (Math.random() * 45) + 1;
            set.add(n);
        }

        System.out.println(set);
    }
}
