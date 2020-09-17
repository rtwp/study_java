package Excercise;
//숫자 맞추기 게임
public class Ex04_14 {
    public static void main(String[] args) {
        //1 ~ 100사이 임의의 값을 answer에 저장
        int answer = (int) ( Math.random() * 100 + 1 );
        int input = 0;
        int count = 0;
        System.out.println(answer);

        java.util.Scanner s = new java.util.Scanner(System.in);

        do {
            count++;
            System.out.print("1 ~ 100 사이 값 입력 : ");
            input = s.nextInt();

            if (answer == input) {
                System.out.println("정답! 시도횟수 : " + count);
                break;
            } else if(answer > input) {
                System.out.println("UP");
            } else {
                System.out.println("LOW");
            }
        } while(true);
    } // main
}
