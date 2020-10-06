package d1006;

public class ThreadEx05 {
    static long sTime = 0;

    public static void main(String[] args) {
        ThreadEx5_1 t1 = new ThreadEx5_1();
        t1.start();
        sTime = System.currentTimeMillis();

        for(int i = 0; i < 500; i++)
            System.out.printf("%s", new String("-"));

        System.out.println("소요시간 1 " + (System.currentTimeMillis() - sTime));

    }

}

class ThreadEx5_1 extends Thread {
    public void run() {
        for(int i = 0; i < 500; i++)
            System.out.printf("%s", new String("|"));

        System.out.println("소요시간 2 " + (System.currentTimeMillis() - ThreadEx05.sTime));
    }
}