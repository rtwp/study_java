package d0928;
enum Transportation {
    BUS(50)   { int fare(int distance) { return distance*BASIC_FARE; } },
    TRAIN(100){ int fare(int distance) { return distance*BASIC_FARE; } },
    PLANE(300){ int fare(int distance) { return distance*BASIC_FARE; } },
    SHIP(150) { int fare(int distance) { return distance*BASIC_FARE; } };

    protected final int BASIC_FARE;

    Transportation(int basicFare) { BASIC_FARE = basicFare; }

    public int getBasicFare() { return BASIC_FARE; }

    abstract int fare(int distance);
}

public class EnumEx03 {
    public static void main(String[] args) {
        System.out.println("bus " + Transportation.BUS.fare(100));
        System.out.println("TRAIN " + Transportation.TRAIN.fare(100));
        System.out.println("SHIP " + Transportation.SHIP.fare(100));
        System.out.println("PLANE " + Transportation.PLANE.fare(100));
    }
}
