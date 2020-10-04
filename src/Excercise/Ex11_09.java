package Excercise;
import java.util.*;

class ClassTotalComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Stu s1 = (Stu)o1;
        Stu s2 = (Stu)o2;
        if( s1.ban == s2.ban) {
            if(s1.total <= s2.total)
                return 1;
            else
                return -1;
        }
        return 0;
    }
}

public class Ex11_09 {

    public static void calculateClassRank(List list) {
        // 먼저 반별 총점기준 내림차순으로 정렬한다
        Collections.sort(list, new ClassTotalComparator());
        int prevBan = -1;
        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();

        Iterator it = list.iterator();
        int i = 1;

        while(it.hasNext()) {
            Stu s = (Stu)it.next();
            if(s.ban != prevBan)
                prevRank = prevTotal = -1;

            if( s.total == prevTotal)
                s.cRank = prevRank;
            else
                s.cRank = i;

            prevBan = s.ban;
            prevTotal = s.total;
            prevRank = s.cRank;
            i++;
        }
    }

    public static void calculateSchoolRank(List list) {
        Collections.sort(list);

        int prevRank = -1;
        int prevTotal = -1;
        int length = list.size();

        Iterator it = list.iterator();

        for(int i = 1; i <= list.size(); i++) {
            if(it.hasNext()) {
                Stu s = (Stu)it.next();
                if( s.total == prevTotal)
                    s.sRank = prevRank;
                else
                    s.sRank = i;

                prevRank = s.sRank;
                prevTotal = s.total;
            }
        }
    }
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Stu("이자바",2,1,70,90,70));
        list.add(new Stu("안자바",2,2,60,100,80));
        list.add(new Stu("홍길동",1,3,100,100,100));
        list.add(new Stu("남궁성",1,1,90,70,80));
        list.add(new Stu("김자바",1,2,80,80,90));

        calculateSchoolRank(list);
        calculateClassRank(list);

        Iterator it = list.iterator();

        while(it.hasNext())
            System.out.println(it.next());
    }
}
