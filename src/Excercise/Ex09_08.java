package Excercise;

public class Ex09_08 {
    static double round(double d, int n) {
        /*
        int a = 1;
        for(int i = 0; i < n; i++)
            a *= 10;
        d *= a;
        d = (int) (d + 0.5f);
        d = d / a;

        return d;
*/
        return Math.round(d * Math.pow(10, n))  / Math.pow(10, n);
    }

    public static void main(String[] args) {
        System.out.println(round(3.1415,1));
        System.out.println(round(3.1415,2));
        System.out.println(round(3.1415,3));
        System.out.println(round(3.1415,4));
        System.out.println(round(3.1415,5));
    }
}
