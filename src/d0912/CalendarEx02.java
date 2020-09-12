package d0912;
//2 531p

import java.util.Calendar;

public class CalendarEx02 {
    public static void main(String[] args) {
        // 요일은 1부터 시작하니까 DAY_OF_WEEK[0]은 비워둠
        final String[] DAY_OF_WEEK =
                {"", "일", "월", "화", "수", "목", "금", "토"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();


        //month는 0부터 시작(현재 달 -1 해야 함)
        //date.set(2020, Calendar.AUGUST, 15);
        date1.set(2020, 7, 15); //2020.08.15 설정
        System.out.println("date1 : " + toString(date1)
                + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일");
        System.out.println("오늘 date2 : " + toString(date2)
                + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일");

        // 두 날짜 간의 차이를 얻으려면, getTimeInMillis() - 1/1000초로 변환해야 함.
        long diff = (date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000;
        System.out.println("date1 부터 date2 까지 " + diff + "초 지났음");
        System.out.println("day로 계산하면 " + diff / (24 * 60 * 60) + "일입니다");
        //1일 = 24 * 60(분) * 60(초)
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 "
                + (date.get(Calendar.MONTH) + 1) + "월 "
                + date.get(Calendar.DATE) + "일 ";
    }
}