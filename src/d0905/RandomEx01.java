package d0905;
//1 501p
import java.util.*;

public class RandomEx01 {
    public static void main(String[] args) {
        Random r = new Random(1);

        System.out.println("= random =");
        for(int i = 0; i < 5; i++)
            System.out.println(i + " : " + r.nextInt());

        System.out.println();
        System.out.println("= random 2 =");
        for(int i = 0; i < 5; i++)
            System.out.println(i + " : " + r.nextInt());
    }
}
