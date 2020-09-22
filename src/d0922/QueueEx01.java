package d0922;
//2 611p
import java.util.*;

public class QueueEx01 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말 보기");

        while(true) {
            System.out.print(">>");
            try {
                //화면으로 라인단위 입력
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if("".equals(input) ) continue;

                if(input.equalsIgnoreCase("q") ) {
                    System.exit(0);
                } else if ( input.equalsIgnoreCase("help") ) {
                    System.out.println("help - 도움말");
                    System.out.println("q 또는 Q - 종료");
                    System.out.println("history - 최근 명령한 명령어"
                            + MAX_SIZE + "개를 보여줍니다.");
                } else if ( input.equalsIgnoreCase("history") ) {
                    int i = 0;
                    save(input);

                    LinkedList tmp = (LinkedList)q;
                    ListIterator it = tmp.listIterator();

                    while(it.hasNext() )
                    System.out.println(++i + "."+it.next() );
                } else {
                    save(input);
                    System.out.println(input);
                }
            } catch(Exception e) {
                System.out.println("Error");
            }
        }
    }

    public static void save(String s) {
        if( !"".equals(s) )
            q.offer(s);

        if(q.size() > MAX_SIZE)
            q.remove();
    }
}