package Excercise;
//각 자리의 합 구하기

public class Ex04_09 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        for(int i=0; i < str.length(); i++) {
            sum += str.charAt(i);
            System.out.println(sum);
        }
        System.out.println("sum = " + sum);
    }
}
