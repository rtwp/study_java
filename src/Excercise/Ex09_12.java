package Excercise;

public class Ex09_12 {

    static int getRand(int from, int to) {
        int r;

        int term = Math.abs( from - to ) + 1;


        r = (int) ( Math.random()  * term) + Math.min(from, to);


        return r;
    }

    public static void main(String[] args)
    {
        for(int i=0; i< 20; i++)
            System.out.print(getRand(1,-3)+",");
    }
}
