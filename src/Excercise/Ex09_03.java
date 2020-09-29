package Excercise;

public class Ex09_03 {
    public static void main(String[] args) {
                         //012 3456789 01234 56789012345678901234
        String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
        String path = "";
        String fileName = "";

        path = fullPath.substring(0, 14);
        fileName = fullPath.substring(15);

        System.out.println("fullPath:"+fullPath);
        System.out.println("path:"+path);
        System.out.println("fileName:"+fileName);
    }
}
