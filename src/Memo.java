import java.sql.Array;
import java.util.*;

class Memo  {
    static int test(int i) {
        while(true) {
            if(i == 0) {
                System.out.println(1);
                continue;
            }
            return 0;
        }
    }
    public static void main(String[] args) {

        System.out.println(test(0));


    }
}

class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }
    public boolean equals(Object obj) {
        if(obj instanceof SutdaCard) {
            SutdaCard nobj = (SutdaCard)obj;
            return (num== nobj.num) && (isKwang == nobj.isKwang);
        }
        return false;
    }
    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}