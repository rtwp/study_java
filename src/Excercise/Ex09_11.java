package Excercise;
//cmd로 2~9 사이의 두 숫자를 받아 그 사이 구구단 출력
import java.util.*;

public class Ex09_11 {
    public static void main(String[] args) {
        if(args.length == 1) {
            System.out.println("정수 2개 입력");
            System.exit(0);
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        if( x < 2 || 9 < x || y < 2 || 9 < y ) {
            System.out.println("범위는 2~9 사이");
            System.exit(0);
        }

        for(int i = x; i <= y; i++) {
            for(int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
