package d0906;
//1 515p
import java.util.*;

public class StringTokenizerEx02 {
    public static void main(String[] args) {
        String expression = "x=100*(200+300)/2";
        StringTokenizer st =
                new StringTokenizer(expression, "+-*/=()", true);

        while(st.hasMoreTokens() ) {
            System.out.println(st.nextToken() );
        }
    } //main
}
