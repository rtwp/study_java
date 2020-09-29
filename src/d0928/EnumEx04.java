package d0928;
//2 700p

abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T> {
    static int id = 0;
    int ordinal;
    String name = "";

    public int ordinal() {return ordinal; }

    MyEnum(String name) {
        this.name = name;
        ordinal = id++;
    }

    public int compareTo(T t) { return ordinal - t.ordinal(); }
}

abstract class MyTrans extends MyEnum {
    static final MyTrans BUS = new MyTrans("BUS", 100) {
        int fare(int dis) { return dis * B_FARE; }
    };
    static final MyTrans TRAIN = new MyTrans("TRAIN", 150) {
        int fare(int dis) { return dis * B_FARE; }
    };
    static final MyTrans SHIP = new MyTrans("SHIP", 100) {
        int fare(int dis) { return dis * B_FARE; }
    };
    static final MyTrans PLANE = new MyTrans("PLANE", 300) {
        int fare(int dis) { return dis * B_FARE; }
    };

    abstract int fare(int dis);

    protected final int B_FARE;

    private MyTrans(String name, int bFare) {
        super(name);
        B_FARE = bFare;
    }

    public String name()        { return name; }
    public String toString()    { return name; }
}

public class EnumEx04 {
    public static void main(String[] args) {
        MyTrans t1 = MyTrans.BUS;
        MyTrans t2 = MyTrans.BUS;
        MyTrans t3 = MyTrans.TRAIN;
        MyTrans t4 = MyTrans.SHIP;
        MyTrans t5 = MyTrans.PLANE;

        System.out.println(t1.fare(100));
        System.out.printf("t1 = %s, %d\n", t1.name(), t1.ordinal());
        System.out.printf("t1 = %s, %d\n", t2.name(), t2.ordinal());
        System.out.printf("t1 = %s, %d\n", t3.name(), t3.ordinal());
        System.out.printf("t1 = %s, %d\n", t4.name(), t4.ordinal());
        System.out.printf("t1 = %s, %d\n", t5.name(), t5.ordinal());
        System.out.println("t1 == t2 ? " + (t1 == t2));
        System.out.println("t1.compareTo(t3) = " + t1.compareTo(t3));
    }
}
