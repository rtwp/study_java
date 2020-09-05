package d0905;
//1 502p
import java.util.*;

public class RandomEx02 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] num = new int[100];
        int[] counter = new int[10];
        int sum = 0;

        for(int i = 0; i < num.length; i++) {
//          System.out.print(num[i] = (int)(Math.Random() * 10));
            System.out.print(num[i] = r.nextInt(10));
            counter[num[i]]++;
        }
        System.out.println();

        for(int i = 0; i < counter.length; i++)
            System.out.println(i + "의 갯수 : " +
                    printGraph('#', counter[i]) + " " + counter[i]);

        for(int tmp : counter)
            sum += tmp;
        System.out.println("총합 : " + sum);
    }

    static String printGraph(char ch, int value) {
        char[] bar = new char[value];

        /* for(int i = 0; i < bar.length; i++)
            bar[i] = ch;
        */
        int j = 0;
        while(j < bar.length) {
            bar[j] = ch;
            j++;
        }
        return new String(bar);
    }
}
