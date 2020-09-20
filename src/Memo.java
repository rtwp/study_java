public class Memo {
    public static void main(String[] args) {
        int n = 100;
        int r;

        for(int i = 0; i < 20; i++) {
            try {
                r = n / (int) (Math.random() * 10 );
                System.out.println(r);
            } catch(ArithmeticException e) {
                System.out.println(-1);
            }

        }
    }
}