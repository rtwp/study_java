package d0929;
//2 707p
import java.util.ArrayList;

class NewC {
    int newF;

    int getNewF() { return newF; }

    @Deprecated
    int oldF;

    @Deprecated
    int getOldF() { return oldF; }
}

public class AnnotationEx03 {
    //@SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewC nc = new NewC();

        nc.oldF = 10;
        System.out.println(nc.getOldF());

        //@SuppressWarnings("unchecked")
        ArrayList<NewC> list = new ArrayList<>();
        list.add(nc);
    }
}
