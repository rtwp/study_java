package d1006;

public class ThreadEx18 {
    public static void main(String[] args) {
        ThreadEx18_1 t1 = new ThreadEx18_1("1");
        ThreadEx18_1 t2 = new ThreadEx18_1("2");
        ThreadEx18_1 t3 = new ThreadEx18_1("3");
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

class ThreadEx18_1 implements Runnable {
    boolean suspended = false;
    boolean stopped = false;

    Thread th;

    ThreadEx18_1(String name) {
        th = new Thread(this, name);
    }

    public void run() {
        String name = th.getName();

        while(!stopped) {
            if(!suspended) {
                System.out.println(name);
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException e) {
                    System.out.println(name + " - interrupted");
                }
            } else {
                Thread.yield();
            }
        }
        System.out.println(name + " - stopped");
    }

    public void suspend() {
        suspended = true;
        th.interrupt();
        System.out.println(th.getName() + " - interrupt() by suspend()");
    }

    public void stop() {
        stopped = true;
        th.interrupt();
        System.out.println(th.getName() + " - interrupt() by stop()");
    }

    public void resume() { suspended = false; }
    public void start() { th.start(); }
}