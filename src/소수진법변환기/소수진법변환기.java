package 소수진법변환기;

import java.util.Scanner;

public class 소수진법변환기 {
    public static void main(String[] args) {
        System.out.println("1) 10 ->  2");
        System.out.println("2) 10 ->  8");
        System.out.println("3) 10 -> 16");
        System.out.println("4)  2 -> 10");
        System.out.println("5)  8 -> 10");
        System.out.println("6) 16 -> 10");
        System.out.print("선택(종료 : 00) : ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int num = Integer.parseInt(input);

        switch(num) {
            case 1 : // 10 -> 2
                System.out.print("숫자를 입력하세요(이전으로 : 0, 종료 00) : ");
                Scanner innerScanner = new Scanner(System.in);
                String innerInput = innerScanner.nextLine();
                int x = Integer.parseInt(innerInput);

                System.out.printf(" 10 ->  2 : %s (정답)%n", Integer.toBinaryString(x));
                System.out.printf(" 10 ->  2 : %s%n");



        }
    
    }
}
