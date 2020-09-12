package d0912;
//2 534p
import java.util.*;

public class CalendarEx06 {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("Usage : java CalendarEx06 2020 9");
            return;
        }
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        int START_DAY_OF_WEEK = 0;
        int END_DAY = 0;

        Calendar sDay = Calendar.getInstance(); //시작일
        Calendar eDay = Calendar.getInstance(); //끝일

        // Calendar의 MONTH값은 0~11, month에서 1을 빼야 함.
        sDay.set(year, month-1, 1);
        eDay.set(year, month, 1);

        eDay.add(Calendar.DATE, -1);

        //1일의 요일을 알아낸다.
        START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);

        //eDay의 날짜를 얻어온다
        END_DAY = eDay.get(Calendar.DATE);

        System.out.println("    " + args[0] + "년 " + args[1] + "월");
        System.out.println(" SU MO TU WE TH FR SA");

        // 해당 월의 첫 요일에 따라 공백 출력
        for(int i = 1; i < START_DAY_OF_WEEK; i++)
            System.out.print("   ");

        for(int i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
            System.out.print((i < 10) ? "  " + i : " " + i);
            if(n%7 == 0) System.out.println();
        }
    }
}
