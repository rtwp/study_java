package d1006;

public class ThreadEx15 {
    public static void main(String[] args) {
        RunImplEx15 r1 = new RunImplEx15();
        RunImplEx15 r2 = new RunImplEx15();
        RunImplEx15 r3 = new RunImplEx15();

        Thread t1 = new Thread(r1, "-");
        Thread t2 = new Thread(r2, "--");
        Thread t3 = new Thread(r3, "---");
        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(2000);
            t1.suspend();
            Thread.sleep(2000);
            t2.suspend();
            Thread.sleep(3000);
            t1.resume();
            Thread.sleep(3000);
            t1.stop();
            t2.stop();
            Thread.sleep(2000);
            t3.stop();
        } catch(InterruptedException e) {}
    }
}

class RunImplEx15 implements Runnable {
    public void run() {
        while(true) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {}
        }
    }
}