package d0922;
//2 612p
import java.util.*;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue();

        for(int i = 0; i < 5; i++) {
            pq.offer((int) (10 * Math.random() + 1) );
        }
        System.out.println(pq);
        Object obj = null;

        while( ( obj = pq.poll() ) != null )
            System.out.println(obj);
    }
}
