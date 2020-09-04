package d0904;
//1 468p

public class StringEx03 {
    public static void main(String[] args) {
        char[] cArr = new char[0];
        String s = new String(cArr);

        System.out.println("cArr.length = " + cArr.length);
        System.out.println("@@@" + s + "@@@");
    }
}
