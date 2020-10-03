package Excercise;
import java.util.*;

class BNAscending implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Stu s1 = (Stu)o1;
        Stu s2 = (Stu)o2;
        if( s1.ban > s2.ban)
            return 1;
        else if( s1.ban < s2.ban)
            return -1;
        else
            if(s1.no > s2.no)
                return 1;
            if(s1.no < s2.no)
                return -1;
            else
                return 0;
    }
}
public class Ex11_07 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Stu("이자바",2,1,70,90,70));
        list.add(new Stu("안자바",2,2,60,100,80));
        list.add(new Stu("홍길동",1,3,100,100,100));
        list.add(new Stu("남궁성",1,1,90,70,80));
        list.add(new Stu("김자바",1,2,80,80,90));

        calculateSchoolRank(list);

        Iterator it = list.iterator();

        while(it.hasNext())
            System.out.println(it.next());
    }
}
