package d0928;
//2 663p
import java.util.*;

public class PropertiesEx04 {
    public static void main(String[] args) {
        Properties sysProp = System.getProperties();
        System.out.println("java.version : " +
                sysProp.getProperty("java.version"));
        System.out.println("awt.toolkit : " +
                sysProp.getProperty("awt.toolkit"));
        sysProp.list(System.out);
    }
}
