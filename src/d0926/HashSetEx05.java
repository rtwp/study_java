package d0926;
//2 637p
import java.util.*;

public class HashSetEx05 {
    public static void main(String[] args) {
        HashSet setA    = new HashSet();
        HashSet setB    = new HashSet();
        HashSet setHab  = new HashSet();
        HashSet setKyo  = new HashSet();
        HashSet setCha  = new HashSet();
        HashSet hab     = new HashSet();
        HashSet kyo     = new HashSet();
        HashSet cha     = new HashSet();

        setA.add("1");        setA.add("2");        setA.add("3");
        setA.add("4");        setA.add("5");
        System.out.println("A = " + setA);

        setB.add("6");        setB.add("7");        setB.add("8");
        setB.add("4");        setB.add("5");
        System.out.println("B = " + setB);

        Iterator it = setB.iterator();
        while(it.hasNext() ) {
            Object tmp = it.next();
            if( setA.contains(tmp) )
                setKyo.add(tmp);
        }

        it = setA.iterator();
        while( it.hasNext() ) {
            Object tmp = it.next();
            if ( !setB.contains(tmp) )
                setCha.add(tmp);
        }

        it = setA.iterator();
        while( it.hasNext() )
            setHab.add(it.next() );

        it = setB.iterator();
        while( it.hasNext() )
            setHab.add(it.next() );

        System.out.println("A 교 B " + setKyo);
        System.out.println("A 합 B " + setHab);
        System.out.println("A - B " + setCha);
        System.out.println();


        kyo = (HashSet)setA.clone();
        kyo.retainAll(setB);

        hab = (HashSet)setA.clone();
        hab.addAll(setB);

        cha = (HashSet)setA.clone();
        cha.removeAll(setB);

        System.out.println("A 교 B " + kyo);
        System.out.println("A 합 B " + hab);
        System.out.println("A - B " + cha);


    }
}
