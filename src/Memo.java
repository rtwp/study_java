interface A {
    public static final int MAX = 100;
    void sum();

}

public class Memo {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = new int[1];
        b = a;

        System.out.println(b[2]);

    }
}