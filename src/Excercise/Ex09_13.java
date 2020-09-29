package Excercise;

public class Ex09_13 {
    public static void main(String[] args) {
        String src = "aabbccAABBCCaa";
        System.out.println(src);
        System.out.println("aa를 " + stringCount(src, "aa") + "개 찾음");
    }
    static int stringCount(String src, String key) {
        return stringCount(src, key, 0);
    }
    static int stringCount(String src, String key, int pos) {
        int count = 0;
        int index = 0;

        if (key == null || key.length() == 0)
            return 0;
        while( index < src.length() - key.length() ) {
            if( 0 <= ( index = src.indexOf(key, index) ) ) {
                count++;
                System.out.println(index);
                if( index == 0)
                    index += key.length();
            }
        }

        return count;
    }
}
