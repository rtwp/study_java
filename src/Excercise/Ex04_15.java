package Excercise;
//회문수 찾기 예) 12321 , 45252
public class Ex04_15 {
    public static void main(String[] args) {
        int number =12321;
        int tmp = number;

        int result = 0; // 변수number를거꾸로변환해서담을변수

        while(tmp!=0){
            result *= 10;
            result += tmp % 10;
            tmp /= 10;
        }

        if(number == result)
            System.out.println( number+"는회문수입니다.");
        else
            System.out.println( number+"는회문수가아닙니다.");
    }
}

