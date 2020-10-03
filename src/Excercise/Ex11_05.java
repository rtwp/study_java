package Excercise;
import java.util.*;

class Stu implements Comparable<Stu>{
    String name;
    int ban, no, kr, en, mt, total, rank;

    Stu(String name, int ban, int no,
            int kr, int en, int mt) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kr = kr;
        this.en = en;
        this.mt = mt;
    }

    int getTotal() { return total; }

    float getAverage() { return (int)
      ((getTotal() / 3f) * 10 + 0.5) / 10f;
    }

    public String toString() {
        return name
                +","+ban
                +","+no
                +","+kr
                +","+en
                +","+getTotal()
                +","+getAverage()
                +","+rank;
    }

    @Override
    public int compareTo(Stu o) {

        if( this.getTotal() >= o.getTotal() )
            return 1;
        else
            return -1;

        /* 8이전
        if( this.name.charAt(0) >= o.name.charAt(0) )
            return 1;
        else
            return -1;
        */
    }
}

public class Ex11_05 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(new Stu("A",1,1,100,100,100));
        list.add(new Stu("E",1,2,90,70,80));
        list.add(new Stu("C",1,3,80,80,90));
        list.add(new Stu("D",1,4,70,90,70));
        list.add(new Stu("B",1,5,60,100,80));
        Collections.sort(list);
        Iterator it = list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }
}
