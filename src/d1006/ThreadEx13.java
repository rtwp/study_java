package d1006;
import javax.swing.JOptionPane;

public class ThreadEx13 {
    public static void main(String[] a) throws Exception {
        ThreadEx13_1 t1 =  new ThreadEx13_1();
        t1.start();

        String input = JOptionPane.showInputDialog("입력하세요");
        System.out.println("입력값은 " + input );
        t1.interrupt();
        System.out.println("isInterrupted() : " + t1.isInterrupted());
    }
}

class ThreadEx13_1 extends Thread {
    public void run() {
        int i = 10;

        while(i != 0 && !isInterrupted()) {
            System.out.println(i--);
            for(long x = 0; x < 2500000000l; x++);
        }
        System.out.println("the count is over");
    }
}