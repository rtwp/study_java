package d0912;
//2 536p

import java.util.Calendar;

public class CalendarEx07 {
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

        // 말일 설정
        eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE));
        
        // 1일이 속한 주의 일요일로 날짜 설정.
        sDay.add(Calendar.DATE, -(sDay.get(Calendar.DAY_OF_WEEK)) + 1);
        // 말일이 속한 주의 토요일로 날짜 설정.
        eDay.add(Calendar.DATE, 7 -eDay.get(Calendar.DAY_OF_WEEK));

        System.out.println("    " + year + "년 " + month + "월");
        System.out.println(" SU MO TU WE TH FR SA");

        // 시작 일부터 말일까지(eDay <= sDay) 1일씩 증가시키며 일(Calendar.DATE) 출력
        for(int n = 1;
            sDay.before(eDay) || sDay.equals(eDay);
            sDay.add(Calendar.DATE,1)) {
            int day = sDay.get(Calendar.DATE);
            System.out.printf(" %02d", day);
            if(n++ % 7 == 0) System.out.println();
        }
    }
}
