package d0905;
//1 498p
import java.util.*;
import static java.util.Objects.*;

public class ObjectTest {
    public static void main(String[] a) {
        String[][] str2d    = { {"aaa", "bbb"}, {"AAA", "BBB"} };
        String[][] str2d2   = { {"aaa", "bbb"}, {"AAA", "BBB"} };

        System.out.print("str2D  = { ");
        for(String[] tmp : str2d)
            System.out.print(Arrays.toString(tmp));
        System.out.println(" } ");

        System.out.print("str2d2 = { ");
        for(String[] tmp : str2d2)
            System.out.print(Arrays.toString(tmp));
        System.out.println(" } ");

        System.out.println("equals(str2d, str2d2) = " +
                Objects.equals(str2d, str2d2));
        System.out.println("equals(str2d, str2d2) = " +
                Objects.deepEquals(str2d, str2d2));
        System.out.println();
        System.out.println("isNull(null) = " + isNull(null));
        System.out.println("nonNull(null) = " + nonNull(null));
        System.out.println("hashCode(null) = " + Objects.hashCode(null));
        System.out.println("toString(null) = " + Objects.toString(null));
        System.out.println("toString(null, \"\") = " +
                Objects.toString(null, ""));
        System.out.println();

        Comparator c = String.CASE_INSENSITIVE_ORDER; // 대소문자 구분x 비교

        System.out.println("compare(\"aa\", \"bb\") = " +
                compare("aa", "bb", c));
        System.out.println("compare(\"bb\", \"aa\") = " +
                compare("bb", "aa", c));
        System.out.println("compare(\"ab\", \"AB\") = " +
                compare("ab", "AB", c));
    }
}
