package Excercise;

public class Ex09_10 {

    static String format(String str, int length, int alignment) {
        StringBuffer sb = new StringBuffer();
        switch(alignment) {
            case 0 :
                sb.append(str);
                for(int i = str.length(); i < length; i++)
                    sb.append(" ");

                return new String(sb);
            case 1 :
                int tmp = ( length - str.length() ) / 2;
                int tmp2;
                if( ( length - str.length() ) % 2 == 1)
                    tmp2 = tmp + 1;
                else
                    tmp2 = tmp;

                for(int i = tmp; i > 0; i--)
                    sb.append(" ");
                sb.append(str);
                for(int i = tmp2; i > 0; i--)
                    sb.append(" ");

                return new String(sb);
            case 2 :
                int space = length - str.length();

                for(int i = space; i > 0; i--) {
                    sb.append(" ");
                }

                sb.append(str);
                return new String(sb);
            default :
                return str;
        }
    }
    public static void main(String[] args) {
        String str = "가나다";
        System.out.println(format(str,7,0)); //왼쪽정렬
        System.out.println(format(str,7,1)); //가운데 정렬
        System.out.println(format(str,7,2)); //오른쪽 정렬
    }
}
