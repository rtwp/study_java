package d1006;
import java.util.ArrayList;

public class ThreadWaitEx01 {
    public static void main(String[] args) throws Exception {
        Table table = new Table();

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table, "donut"), "CUST1").start();
}
