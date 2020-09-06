package d0906;
//1 517p
import java.util.*;

public class StringTokenizerEx05 {
    public static void main(String[] args) {
        String data = "100,,,200,300";

        String[] result = data.split(",");
        StringTokenizer st = new StringTokenizer(data, ",");

        for(int i = 0; i < result.length; i++)
            System.out.print(result[i] + "|");

        System.out.println("갯수 : " + result.length);

        int i = 0;
        for(;st.hasMoreTokens(); i++)
            System.out.print(st.nextToken() + "|");

        System.out.println("갯수 : " + i);
    } // main
}
