package Excercise;
// 피보나치 수열 1,1, 2, 3, 5, 8, 13, 21, 34, 55
public class Ex04_11 {
    public static void main(String[] args) {

        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        System.out.print(num1+","+num2);

        for (int i = 0 ; i < 8 ; i++ ) {
            num3 = num1 + num2;
            if ( i % 2 == 0) {
                num1 = num3;
            } else {
                num2 = num3;
            }
            System.out.print(", " + num3);
        }
    } // end of main
}
