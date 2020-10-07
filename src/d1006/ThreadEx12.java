package d1006;

public class ThreadEx12 {
    public static void main(String[] args) {
        ThreadEx12_1 t1 = new ThreadEx12_1();
        ThreadEx12_2 t2 = new ThreadEx12_2();

        t1.start();
        t2.start();

        t1.delay(2000);

        System.out.println("main over");
    }


}


class ThreadEx12_1 extends Thread {
    public void run() {
        for(int i = 0; i < 300; i++)
            System.out.print("-");
        System.out.println("t1 over");
    }

    void delay(long millis) {
        try {
            sleep(millis);
        } catch(InterruptedException e) {}
    }
}

class ThreadEx12_2 extends Thread {
    public void run() {
        for(int i = 0; i < 300; i++)
            System.out.print("|");
        System.out.println("t2 over");
    }
}