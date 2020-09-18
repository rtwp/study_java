package Excercise;

public class Ex06_22 {
    static boolean isNumber(String str) {
        boolean x = false;

        for(int i = 0; i < str.length(); i++) {
            if('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                x = true;
            } else {
                x = false;
                break;
            }
        }

        return x;
    }

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+" 는 숫자입니까? "+isNumber(str));
        str = "1234o";
        System.out.println(str+" 는 숫자입니까? "+isNumber(str));
    }
}
