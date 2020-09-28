package d0928;
//2 648p
import java.util.*;

public class HashMapEx03 {
    static HashMap phoneBook = new HashMap();

    public static void main(String[] args) {
        addPhoneNo("PAL", "lee", "1");
        addPhoneNo("PAL", "kim", "2");
        addPhoneNo("PAL", "kim", "3");
        addPhoneNo("BUSINESS", "kim", "4");
        addPhoneNo("BUSINESS", "kim", "5");
        addPhoneNo("BUSINESS", "pak", "6");
        addPhoneNo("BUSINESS", "lee", "7");
        addPhoneNo("laundry", "8");

        printList();
    }

    static void addPhoneNo(String groupName, String name, String num) {
        addGroup(groupName);
        HashMap group = (HashMap)phoneBook.get(groupName);
        group.put(num, name);
    }

    static void addGroup(String groupName) {
        if ( !phoneBook.containsKey(groupName) )
            phoneBook.put(groupName, new HashMap());
    }
    static void addPhoneNo(String name, String num) {
        addPhoneNo("NULL", name, num);
    }

    static void printList() {
        Set set = phoneBook.entrySet();
        Iterator it = set.iterator();

        while( it.hasNext() ) {
            Map.Entry e = (Map.Entry)it.next();

            Set subSet = ( (HashMap)e.getValue() ).entrySet();
            Iterator subIt = subSet.iterator();

            System.out.println(" * " + e.getKey() + "[" + subSet.size() + "]");

            while(subIt.hasNext()) {
                Map.Entry subE = (Map.Entry)subIt.next();
                String telNo = (String)subE.getKey();
                String name = (String)subE.getValue();
                System.out.println(name + " " + telNo);
            }

            System.out.println();
        }
    }
}