package d0920;
//1 431p
import java.io.*;

public class ExceptionEx15 {
    public static void main(String[] args) {
        String s = "";
        File f = createFile(s);
        System.out.println(f.getName() + "생성");
    } //main
    static File createFile(String name) {
        try {
            if ( name == null || name.equals("") )
                throw new Exception("ExceptioN");
        } catch ( Exception e) {
            name = "제목없음.txt";
        } finally {
            File f = new File(name);
            createNewFile(f);
            return f;
        }
    } //createFile

    static void createNewFile(File f) {
        try {
            f.createNewFile();
        } catch(Exception e) {}
    } //createNewFile
}
