package Excercise;
import java.util.*;

public class Ex11_06 {
    static int getGroupCount(TreeSet tset, int from, int to) {
        // from ~ to 사이의 평균점수를 가진 학생의 수를 반환

        tset.subSet(from, to);

        return 0;
    }

    public static void main(String[] args) {
        TreeSet set = new TreeSet(new Comparator<Stu>() {
            public int compare(Stu s1, Stu s2) {
                // 평균점수에 따라 정렬
                return s1.getAverage() > s2.getAverage() ? 1 : -1;

            }
        });

        set.add(new Stu("홍길동",1,1,100,100,100));
        set.add(new Stu("남궁성",1,2,90,70,80));
        set.add(new Stu("김자바",1,3,80,80,90));
        set.add(new Stu("이자바",1,4,70,90,70));
        set.add(new Stu("안자바",1,5,60,100,80));
        Iterator it = set.iterator();

        while(it.hasNext())
            System.out.println(it.next());

        System.out.println("[60~69] :"+getGroupCount(set,60,70));
        System.out.println("[70~79] :"+getGroupCount(set,70,80));
        System.out.println("[80~89] :"+getGroupCount(set,80,90));
        System.out.println("[90~100] :"+getGroupCount(set,90,101));


    } //main
}
