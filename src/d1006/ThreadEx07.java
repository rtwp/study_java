package d1006;

import javax.swing.*;

public class ThreadEx07 {
    public static void main(String[] args) throws Exception{
        ThreadEx7_1 t1 = new ThreadEx7_1();
        t1.start();

        String input = JOptionPane.showInputDialog("입력하세요");
        System.out.println("입력값은 " + input );
    }
}

class ThreadEx7_1 extends Thread {
    public void run() {
        for(int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch(Exception e) {}
        }
    }
}
