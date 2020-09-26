package d0906;
//1 509p
import java.util.regex.*;

public class RegularEx04 {
    public static void main(String[] args) {
        String source = "A broken hand works, but not a broken heart.";
        String pattern = "broken";
        StringBuffer sb = new StringBuffer();

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(source);
        System.out.println("source : " + source);

        int i = 0;

        while(m.find()) {
            System.out.println(++i + "번 째 매칭 : " + m.start() + "~" + m.end());
            // broken을 drunkend으로 치환하여 sb에 저장
            m.appendReplacement(sb, "drunken");
        }

        m.appendTail(sb);
        System.out.println("Replacement count : " + i);
        System.out.println("result : " + sb.toString());
    }
}