package Excercise;
/*
for -> while
        for(int i=0; i<=10; i++) {
            for(int j=0; j<=i; j++)
                System.out.print("*");
            System.out.println();
        }
*/
public class Ex04_05 {
    public static void main(String[] args) {
        int i = 0 ;

        while(i <= 10) {
            int j = 0;
            while(j++ <= i) {
                System.out.print("*");
            }
            System.out.println();
            i++;
        }
    }
}

