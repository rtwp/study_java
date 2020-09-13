import java.util.*;
import java.util.StringTokenizer;
import java.util.regex.*;
import java.math.*;

public class Memo {

    int iv = 1;

    static { cv = 2; }

    static int cv = 1;

    Memo() { iv = 3; }

    { iv = 2; }
    public static void main(String[] args) {

        Memo m = new Memo();
        System.out.println(m.iv);
        System.out.println(cv);
    }
}