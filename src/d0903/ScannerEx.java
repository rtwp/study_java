package d0903;

import java.util.*;


public class ScannerEx {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("레후 : ");
        String input = s.nextLine();
        int num = Integer.parseInt(input);

        System.out.println("보로롱 : " + input);
        System.out.print("보로롱 : " + (num + 100));
    }
}