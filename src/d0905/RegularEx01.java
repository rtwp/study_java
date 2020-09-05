package d0905;
//1 505p
import java.util.regex.*;

public class RegularEx01 {
    public static void main(String[] args) {
        String[] data = {"bat", "baby", "bonus", "combat", "coke", "cow", "korea"
                , "cat", "dad" };
        Pattern p = Pattern.compile("c[a-z]*"); // c로 시작하는 소문자영단어

        for(int i = 0; i < data.length; i++) {
            Matcher m = p.matcher(data[i]);
            if(m.matches())
                System.out.print(data[i] + ", ");
        }
    }
}
