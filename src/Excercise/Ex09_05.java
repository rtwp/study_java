package Excercise;

public class Ex09_05 {
    public static int count(String src, String target) {
        int count = 0;
        int pos = 0;

        while(true) {
            int tmp = src.indexOf(target, pos);

            if( tmp >= 0) {
                count++;
                pos += tmp;
            }
            if( tmp == -1)
                break;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("12345AB12AB345AB","AB"));
        System.out.println(count("12345","AB"));
    }
}
