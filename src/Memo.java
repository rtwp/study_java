import java.util.*;

class Memo {
    public static void main(String[] args) {
        C c = new C();

        System.out.println(c.isF(5));

    }
}

abstract class P {
    P() {}

    public boolean isF(Object x) {
        if ( x == this )
            return true;
        return false;
    }
}

class C extends P {
    Object v = 5;
    C() {}

    public boolean isF(int x) {
        return super.isF(x);
    }
}