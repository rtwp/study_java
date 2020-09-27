package d0927;
//2 646p
import java.util.*;

public class HashMapEx01 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner s= new Scanner(System.in);

        while(true) {
            System.out.println("id & pw");
            System.out.printf("id : ");
            String id = s.nextLine().trim();

            System.out.printf("pw : ");
            String pw = s.nextLine().trim();
            System.out.println();

            if( !map.containsKey(id)) {
                System.out.println("없는 id ");
                continue;
            } else {
                if( ! (map.get(id).equals(pw) ) ) {
                    System.out.println("비번 불일치");
                } else {
                    System.out.println("id, pw 일치");
                    break;
                }
            }
        }
    }
}
