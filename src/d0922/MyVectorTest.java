package d0922;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class MyVectorTest {
    public static void main(String[] args) {
        MyVector v = new MyVector(0);
        Vector rv = new Vector(10);
        Vector rv2 = new Vector(5);

        v.add(1);
        v.add(2);
        v.add(3);

        rv.add(1);
        rv.add(2);
        rv.add(3);


        ArrayList l = new ArrayList();

        l.add(1);
        l.add(2);
        l.add(3);

        System.out.println(v.equals(l));
        System.out.println(rv.equals(l));
    }
}
