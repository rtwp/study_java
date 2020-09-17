package Excercise;
//문자열이 숫자인지 문자인지 확인
public class Ex04_13 {
    public static void main(String[] args) {
        String value = "12o34";
        char ch = ' ';
        boolean isNumber = true;

        //문자열의 문자를 하나씩 검사
        //charAt(int i) 사용
        for(int i = 0; i < value.length(); i++) {
            ch = value.charAt(i);
            if ('0' <= ch || ch <= '9') {
                isNumber = false;
            } else {
                isNumber = true;
                break;
            }
        }

        if ( isNumber) {
            System.out.println(value + "는 숫자");
        } else {
            System.out.println(value + "는 숫자 아님");
        }
    }
}