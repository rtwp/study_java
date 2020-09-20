package d0920;
// 1
public class ExceptionEx14 {
    public static void main(String[] args) {
        try {
            m2();
        } catch (Exception e) {
            System.out.println("main");
            e.printStackTrace();
        }
    }

    static void m2() throws Exception {
        throw new Exception();
        }
}
