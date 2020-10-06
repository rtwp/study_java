package d1006;

public class ThreadEx04 {
    public static void main(String[] args) {
        long sTime = System.currentTimeMillis();

        for(int i = 0; i < 500; i++)
            System.out.printf("%s", new String("-"));

        System.out.println("소요시간 1 " + (System.currentTimeMillis() - sTime));

        for(int i = 0; i < 500; i++)
            System.out.printf("%s", new String("|"));

        System.out.println("소요시간 2 " + (System.currentTimeMillis() - sTime));

    }
}
