package Excercise;
// 1 ~ 6 사이의 임의의 정수를 value에 넣어라
public class Ex04_07 {
    public static void main(String[] args) {
        int value = ( (int)( Math.random() * 6 + 1 ) );
        System.out.println("value : " + value);
    }
}
