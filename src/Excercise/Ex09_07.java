package Excercise;

public class Ex09_07 {
    static boolean contains(String src, String target) {

        return ( 0 <= src.indexOf(target) ) ? true : false ;

    }

    public static void main(String[] args) {
        System.out.println(contains("12345","23"));
        System.out.println(contains("12345","67"));
    }
}
