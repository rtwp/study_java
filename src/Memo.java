import java.sql.Array;
import java.util.*;

class Memo  {



    public static void main(String[] args) {
        int[] ia = new int[10];
        int tmp = 0;
        int r;

        for(int i = 0; i < 10; i++) {
            ia[i] = i;
            System.out.print(ia[i]);
        }
        System.out.println();

        for(int i = 0; i < 10; i++) {
            r = (int) (Math.random() * 10);
            tmp = ia[r];
            ia[r] = ia[i];
            ia[i] = tmp;
        }
        for(int i = 0; i < 10; i++) {
            System.out.print(ia[i]);
        }


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