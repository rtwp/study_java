import java.util.StringJoiner;

public class Memo {
    public static void main(String[] args) {

        String s = "moonch,lulu,lala";
        String[] arr = s.split(",");
        StringJoiner sj = new StringJoiner("  ", "<", ">");
        for(String e : arr)
            sj.add(e.toUpperCase());

        System.out.println(sj);

    }
}