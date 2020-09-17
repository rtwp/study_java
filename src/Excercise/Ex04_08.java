package Excercise;
// 방정식 의 모든 해를 구하시오 2x+4y=10 [x와 y는 모두 정수, 0이상 10이하]
public class Ex04_08 {
    public static void main(String[] args) {
        for(int x = 0; x <= 10; x++) {
            for(int y = 0; y <= 10; y++) {
                if ( 2 * x + 4 * y == 10) {
                    System.out.printf("x = %d, y = %d\n", x, y);
                }
            }
        }
    }
}
