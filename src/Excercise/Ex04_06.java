package Excercise;
// 두 주사위 눈의 합이 6이 되는 경우의 수를 구하라

public class Ex04_06 {
    public static void main(String[] args) {
        int count = 0;
        for( int i = 1 ; i < 7; i++) {
            for(int j = 1; j < 7; j++)
                if( i + j == 6 ) {
                    System.out.printf("[%d, %d]", i, j);
                    count++;
                }
            System.out.println();
        }
        System.out.println(count);
    }
}
