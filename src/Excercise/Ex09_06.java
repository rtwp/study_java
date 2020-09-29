package Excercise;

public class Ex09_06 {

    public static String fillZero(String src, int length) {

        if( src == null || src.length() == length)
            return src;
        if( length <= 0)
            return "";
        if( src.length() > length)
            return src.substring(0, length);

        char[] c = new char[length];

        for(int i = 0; i < c.length; i++) {
            c[i] = '0';
        }

        System.arraycopy(src.toCharArray(), 0, c, length - src.length(), src.length() );
        /*
        int tmp = length - src.length();

        for(int i = 0; i < tmp; i++) {
            c[i] = '0';
        }
        for(int i = tmp, j = 0; i < length; i++, j++) {
            c[i] = src.charAt(j);
        }
        */
        return new String(c);
    }

    public static void main(String[] args) {
        String src = "12345";
        System.out.println(fillZero(src,10));
        System.out.println(fillZero(src,-1));
        System.out.println(fillZero(src,3)); // 123
    }
}

