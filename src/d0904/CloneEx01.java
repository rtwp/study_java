package d0904;
//1 456p
class Point implements Cloneable {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
  //public Object clone() {
    public Point clone() {
        Object obj = null;
        try {
            obj = super.clone(); // clone()은 반드시 예외처리 해야 한다.
        } catch ( CloneNotSupportedException e) {}
      //return obj;
        return (Point)obj;
    }
}

public class CloneEx01 {
    public static void main(String[] args) {
        Point origin = new Point(3, 5);
      //Point copy = (Point)origin.clone();
        Point copy = origin.clone();
        System.out.println(origin);
        System.out.println(copy);
    }
}
