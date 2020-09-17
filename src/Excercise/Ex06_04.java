package Excercise;

public class Ex06_04 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "철수";
        s.ban = s.no = 1;
        s.kor = s.eng = 99;
        s.math = 2;

        System.out.println(" :"+s.name);
        System.out.println(" :"+s.getTotal());
        System.out.println(" :"+s.getAverage());

    }
}

class Student {
    String name; //이름
    int ban; // 반
    int no; // 번호
    int kor; //점수
    int eng; //점수
    int math; //점수

    int getTotal() {
        return kor + eng + math;
    }
    float getAverage() {
        return (int) ( getTotal() / 3f * 10 + 0.5f ) /10;
      //return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }

}