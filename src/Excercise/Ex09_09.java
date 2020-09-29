package Excercise;

public class Ex09_09 {
    static String delChar(String src, String delCh) {
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < src.length(); i++) {
            if (  -1 == delCh.indexOf(src.charAt(i))  ) {
                sb.append(src.charAt(i));
            }
        }
        return new String(sb);
    }

    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)"+" -> " + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)"+" -> " + delChar("(1 2 3 4\t5)"," \t"));
    }
}
