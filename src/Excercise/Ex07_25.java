package Excercise;

class Outer {
    class Inner {
        int iv = 100;
    }
}

class Outer2 {
    static class staticInner {
        int iv = 200;
    }
}

public class Ex07_25 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        System.out.println(i.iv);
        Outer2.staticInner si = new Outer2.staticInner();
        System.out.println(si.iv);


    }
}
