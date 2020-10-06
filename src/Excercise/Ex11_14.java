package Excercise;
import java.io.*;
import java.util.*;
//Stu.class at 11_05

public class Ex11_14 {
    //성적데이터 저장소
    static ArrayList record = new ArrayList();
    static Scanner s = new Scanner(System.in);

    public static void main(String args[]) {
        while(true) {
            switch(displayMenu()) {
                case 1 :
                    inputRecord();
                    break;
                case 2 :
                    displayRecord();
                    break;
                case 3 :
                    System.out.println("종료");
                    System.exit(0);
            }
        }
    }

    // menu 보여주는 메서드
    static int displayMenu() {
        System.out.println("성적 관리 프로그램");
        System.out.println("1 : 성적 입력");
        System.out.println("2 : 성적 보기");
        System.out.println("3 : 종료");

        System.out.print("메뉴 (1 ~ 3) > ");

        int menu = 0;

        //연습문제
        /*
        String input = s.nextLine();
        menu = Integer.parseInt(input);
        if(1 <= menu && menu <=3) {
            return menu;
        } else {
            while(true) {
               System.out.print("오입력, 1~3을 입력해주세요 >>");
               input = s.nextLine();
               menu = Integer.parseInt(input);
               if(1 <= menu && menu <=3) {
                   return menu;
               } else continue;
            }
        }
        */

        do {
            try {
                menu = Integer.parseInt(s.nextLine().trim());

                if(1 <= menu && menu <= 3)
                    break;
                else
                    throw new Exception();
            } catch(Exception e) {
                System.out.println("오입력! 재입력하세요");
                System.out.print("메뉴선택 1~3 >>");
            }
        }while(true);

        return menu;
    } // displayMenu

    //데이터 입력받는 메서드
    static void inputRecord() {
        System.out.println("1. 성적 입력");
        System.out.println("이름 반 번호 국어성적 영어성적 수학성적 의 순서로 공백없이 입력하세요");
        System.out.println("(,로 구분)입력을 마치려면 q를 입력하세요 메인화면으로 돌아갑니다");

        while(true) {
            System.out.print(">>");
            //이름 반 번호 국어성적 영어성적 수학성적 순 , 구분
            /*
            String input = s.nextLine();
            Object[] value = input.split(",");

            if(((String)value[0]).equalsIgnoreCase("Q"))
                return;
            else {
                Stu stu = new Stu((String)value[0], (int)value[1],
                        (int)value[2], (int)value[3], (int)value[4],
                        (int)value[5]);
                record.add(stu);
            }
            */

            try {
                String input = s.nextLine().trim();

                if(!input.equalsIgnoreCase("q")) {
                    Scanner s2 = new Scanner(input).useDelimiter(",");
                    record.add(new Stu(s2.next(), s2.nextInt(),s2.nextInt(),
                            s2.nextInt(),s2.nextInt(),s2.nextInt()));
                    System.out.println("완료. 입력을 마치려면 q 입력");
                } else return;
            } catch(Exception e) {
                System.out.println("오류!" +
                        "이름 반 번호 국어성적 영어성적 수학성적" +
                        "순으로 입력하세요");
            }
        }
    }

    //데이터 보여주는 메서드
    static void displayRecord() {
        int krT = 0;
        int enT = 0;
        int mtT = 0;
        int total = 0;

        int len = record.size();

        if( len > 0) {
            System.out.println("이름 반 번호 국어 영어 수학 총점 평균 전교등수 반등수");
            System.out.println();

            for(int i = 0; i < len; i++) {
                Stu stu = (Stu)record.get(i);
                System.out.println(stu);
                krT += stu.kr;
                mtT += stu.mt;
                enT += stu.en;
                total += stu.total;
            }
            System.out.println();
            System.out.println("총점: " +krT+" "+enT
                    +" "+mtT+" "+total);
            System.out.println();
        } else {
            System.out.println("no data");
        }
    }
}