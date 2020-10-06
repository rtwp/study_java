package d1006;
import javax.swing.JOptionPane;

public class ThreadEx06 {
    public static void main(String[] args) throws Exception{
        String input = JOptionPane.showInputDialog("입력하세요");
        System.out.println("입력값은 " + input );

        for(int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch(Exception e) {}
        }
    }
}
