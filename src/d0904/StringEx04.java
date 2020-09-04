package d0904;
//1 472p

import java.util.StringJoiner;

public class StringEx04 {
    public static void main(String[] args) {
        String animals = "dog, cat, rabbit";
        String[] arr = animals.split(", ");

        System.out.println(String.join("_", arr));

        StringJoiner sj =
                new StringJoiner("/", "[", "]");
        for(String s : arr)
            sj.add(s);

        System.out.println(sj.toString());
    }
}
