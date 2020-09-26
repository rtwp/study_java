package d0926;
//2 643p
import java.util.*;

public class TreeSetEx02 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        int[] score = {80, 90, 50, 35, 45, 60, 10, 102};

        for(int i = 0; i < score.length; i++) 
            set.add(score[i]);

        System.out.println("50보다 작은값" + set.headSet(50));
        System.out.println("50보다 큰값" + set.tailSet(50));
    }
}
