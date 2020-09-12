package d0912;
//2 529p
import java.util.*;

public class calendarEx01 {
    public static void main(String[] args) {
        //기본적으로 현재날짜 및 시각이 설정됨
        Calendar today = Calendar.getInstance();

        System.out.println("YEAR : " + today.get(Calendar.YEAR));
        System.out.println("MONTH(현재 -1값) : " + today.get(Calendar.MONTH));
        System.out.println("이 해의 몇 째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇 째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
        System.out.println();
        //DATE와 DAY_OF_MONTH는 같다.
        System.out.println("이 달의 몇 일: " + today.get(Calendar.DATE));
        System.out.println("이 달의 몇 일: " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("요일(1~7, 1 = 일요일): " + today.get(Calendar.DAY_OF_WEEK));
        System.out.println("이 달의 몇 째 요일: "
                + today.get(Calendar.DAY_OF_WEEK_IN_MONTH)
                + "번 째 " + today.get(Calendar.DAY_OF_WEEK) + "요일");
        System.out.println("오전_오후(0 오전, 1 오후): " + today.get(Calendar.AM_PM));
        System.out.println("시간(0~11): " + today.get(Calendar.HOUR));
        System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("분 0~59: " + today.get(Calendar.MINUTE));
        System.out.println("초 0~59: " + today.get(Calendar.SECOND));
        System.out.println("1/1000 초 0~999: " + today.get(Calendar.MILLISECOND));
        System.out.println();
        // 1/1000초를 시간으로 표시하기 위해 3,600,000으로 나누었다. (1시간 = 60 * 60초)
        System.out.println("TimeZone(시차) -12 ~ +12 : "
                +( today.get(Calendar.ZONE_OFFSET) / (60 * 60 * 1000) ));
        System.out.println("이 달의 마지막 날 : " + today.getActualMaximum(Calendar.DATE) );

    }
}