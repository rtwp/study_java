package Excercise;

public class Ex07_20 {
    public static void main(String[] args) {
        Parent p = new Child();
        Child c = new Child();

        System.out.println("p.x = " + p.x); // 100
        p.method(); //cm

        System.out.println("c.x = " + c.x); // 200
        c.method(); //cm
    }
}

class Parent {
    int x = 100;

    void method() {
        System.out.println("pM");
    }
}

class Child extends Parent {
    int x = 200;

    void method() {
        System.out.println("cM");
    }
}