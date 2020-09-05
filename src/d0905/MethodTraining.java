package d0905;
// 메서드 및 this()를 까먹어 연습해보았다.
public class MethodTraining {
    public static void main(String[] args) {
        Mc mc = new Mc(30);
        Mc mc2 = mc.copy();

        System.out.println(mc.getAge());
        System.out.println(mc2.getAge());
        System.out.println();

        mc.growUp();

        System.out.println(mc.getAge());
        System.out.println(mc2.getAge());
    }
}

class Mc {
    int age;

    Mc()     { this(20); }
    Mc(int a) { age = a; }

    int getAge()   { return age; }
    void growUp()  { age++; }
    Mc copy() {
        Mc newMc = new Mc();
        newMc.age = age;
        return newMc;
    }
}