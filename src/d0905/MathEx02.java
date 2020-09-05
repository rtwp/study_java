package d0905;
//1 485p
import static java.lang.Math.*;
import static java.lang.System.*;

public class MathEx02 {
    public static void main(String[] args) {
        int i = Integer.MIN_VALUE;
        out.println(Integer.toBinaryString(i) + "\n");

        String s = Integer.toBinaryString(i);
        out.println(s.length() + "\n");

        out.println(" i = " + i);
        out.println("-i = " + (-i));

        try {
            out.printf("negateExact(%d) = %d\n",  10, negateExact(10));
            out.printf("negateExact(%d) = %d\n", -10, negateExact(-10));
            out.printf("negateExact(%d) = %d\n",   i, negateExact(i)); //예외발생
        } catch(ArithmeticException e) {
            // i -> long 이후 negteExact(long a) 호출
            out.printf("negateExact(%d) = %d\n", (long)i, negateExact( (long)i ));
        }
    } //main
}
