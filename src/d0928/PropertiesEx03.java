package d0928;
//2 662p
import java.util.*;
import java.io.*;

public class PropertiesEx03 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("timeout", "30");
        prop.setProperty("langauge", "한글");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        try {
            prop.store(new FileOutputStream("output.txt"),
                    "Properties Example");
            prop.storeToXML(new FileOutputStream("output.xml"),
                    "Properties Example");
        } catch ( IOException e) {
            e.printStackTrace();
        }

    }
}
