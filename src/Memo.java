import java.sql.Array;
import java.util.*;

class Memo{
    public static void main(String[] args) {


        T3 s = new T3();
        T3 l;

        s.age = 10;

        l = s;

        System.out.println(s);
        System.out.println(l);

        l.age = 20;
        System.out.println(s);
        System.out.println(l);


    }
}

class T3 {
    int age = 0;

    public String toString() {
        return age+"";
    }
}