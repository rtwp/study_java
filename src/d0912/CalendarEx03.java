package d0912;
//2 532p
import java.util.*;

public class CalendarEx03 {
    public static void main(String[] args) {
        final int[] TIME_UNIT = {3600, 60, 1}; //큰 단위 앞
        final String[] TIME_UNIT_NAME = {"시간 ", "분 ", "초 "};

        Calendar t1 = Calendar.getInstance();
        Calendar t2 = Calendar.getInstance();

        t1.set(Calendar.HOUR_OF_DAY, 10);
        t1.set(Calendar.MINUTE, 20);
        t1.set(Calendar.SECOND, 30);
        System.out.println();
        t2.set(Calendar.HOUR_OF_DAY, 20);
        t2.set(Calendar.MINUTE, 30);
        t2.set(Calendar.SECOND, 10);

        System.out.println("t1 : " + t1.get(Calendar.HOUR_OF_DAY) 
                + "시 " + t1.get(Calendar.MINUTE) 
                + "분 " + t1.get(Calendar.SECOND)
                + "초");
        System.out.println("t2 : " + t2.get(Calendar.HOUR_OF_DAY) 
                + "시 " + t2.get(Calendar.MINUTE) 
                + "분 " + t2.get(Calendar.SECOND)
                + "초");

        long diff = Math.abs(t2.getTimeInMillis() - t1.getTimeInMillis()) / 1000;
        System.out.println("t1과 t2의 차이는 " + diff + "초");

        String tmp = "";
        for(int i = 0; i < TIME_UNIT.length; i++) {
            tmp += diff / TIME_UNIT[i] + TIME_UNIT_NAME[i];
            diff %= TIME_UNIT[i];
        }
        System.out.println("시분초로 바꾸면 " + tmp);
    }
}
