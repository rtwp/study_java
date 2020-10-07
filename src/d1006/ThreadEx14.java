package d1006;

import javax.swing.*;

public class ThreadEx14 {
    public static void main(String[] a) throws Exception {
        ThreadEx14_1 t1 =  new ThreadEx14_1();
        t1.start();

        System.out.println("isInterrupted() : " + t1.isInterrupted());
        String input = JOptionPane.showInputDialog("입력하세요");
        System.out.println("입력값은 " + input );
        t1.interrupt();
        System.out.println("isInterrupted() : " + t1.isInterrupted());
    }
}

class ThreadEx14_1 extends Thread {
    public void run() {
        int i = 10;

        while(i != 0 && !isInterrupted()) {
            System.out.println(i--);
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) { //interrupt();
            }
        }
        System.out.println("the count is over");
    }
}