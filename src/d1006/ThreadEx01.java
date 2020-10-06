package d1006;

public class ThreadEx01 {
    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();

        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}

class ThreadEx1_1 extends Thread {
    @Override
    public void run() {
        for(int i = 0; i < 5; i++)
            System.out.println("1 - " + getName());
    }
}

class ThreadEx1_2 implements Runnable {
    public void run() {
        for(int i = 0; i < 5; i++)
            System.out.println("2 - " + Thread.currentThread().getName());
    }
}
