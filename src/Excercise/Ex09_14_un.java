package Excercise;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.*;

public class Ex09_14_un {
    public static void main(String[] args) {
        String[] phoneNumArr = {
                "012-3456-7890",
                "099-2456-7980",
                "088-2346-9870",
                "013-3456-7890"
        };

        ArrayList list = new ArrayList();
        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.print(">>");
            String input = s.nextLine().trim();
            if(input.equals("")) {
                continue;
            } else if(input.equalsIgnoreCase("Q")) {
                System.exit(0);
            }

            //코드

            if(list.size()>0) {
                System.out.println(list);
                list.clear();
            } else {
                System.out.println("일치하는 번호가 없습니다  .");
            }
        }
    }
}