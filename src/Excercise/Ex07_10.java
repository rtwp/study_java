package Excercise;
class MyTv2 {
    private boolean isPowerOn;
    private int     channel;
    private int     volume;
    private int     pre;

    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void gotoPrevChannel() {
        setChannel(pre);
    }
    int getVolume() {
        return volume;
    }
    int getChannel() {
        return channel;
    }
    void setVolume(int x) {
        volume = x;
    }
    void setChannel(int x) {
        pre = channel;
        channel = x;
    }
}

public class Ex07_10 {
    public static void main(String[] args) {
        MyTv2 t = new MyTv2();
        t.setChannel(10);
        System.out.println("CH:"+t.getChannel());
        t.setChannel(20);
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
        t.gotoPrevChannel();
        System.out.println("CH:"+t.getChannel());
    }
}
