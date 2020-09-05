package d0905;
//1 479p
public class StringBufferEx01 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");

        System.out.println("sb == sb2 ? " + (sb == sb2));
        System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));

        // StringBuffer > String 변환
        String s = sb.toString();    // 둘은 같다
        String s2 = new String(sb2); // 둘은 같다

        System.out.println("s.equals(s2) ? " + s.equals(s2));
    }
}
