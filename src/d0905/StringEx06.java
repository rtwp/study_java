package d0905;
//1 475p
public class StringEx06 {
    public static void main(String[] args) {
        int iVal = 100;
        String strVal = String.valueOf(iVal); // int -> String

        double dVal = 200;
        String strVal2 = dVal + ""; // int -> String

        double sum = Integer.parseInt("+" + strVal)
                + Double.parseDouble(strVal2);
        double sum2 = Integer.valueOf(strVal)
                + Double.valueOf(strVal2);

        System.out.println(String.join
                ("", strVal, " + ", strVal2, " = ") + sum);
        System.out.println(strVal + " + " + strVal2 + " = " + sum2);

    }
}
