package Excercise;

class OC {
    int value = 10;

    class IC {
        int value = 20;

        void method1() {
            int value = 30;

            System.out.println(value);
            System.out.println(this.value);
            System.out.println(OC.this.value);
        }
    } //IC
} //OC

public class Ex07_27 {
    public static void main(String[] args) {
        OC oc = new OC();
        OC.IC ic = oc.new IC();

        ic.method1();
    }
}
