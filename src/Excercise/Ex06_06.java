package Excercise;
//두 점 사이의 거리 구하기

class MyPoint {
    int x, y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double getDistance(int x, int y) {
        return Math.sqrt(( x-this.x) * (x-this.x) + (y-this.y) * (y-this.y));
    }

}
public class Ex06_06 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);

        System.out.println(p.getDistance(2,2));
    }
}
