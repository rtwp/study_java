package d0920;
// 1
public class ExceptionEx13 {
    public static void main(String[] args) {
        m1();
    }

    static void m1() {
        try {
            throw new Exception ();
        } catch ( Exception e) {
            System.out.println("m1 예외");
            e.printStackTrace();
        }
    }
}
