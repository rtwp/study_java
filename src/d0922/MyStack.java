package d0922;
//2 606p
import java.util.*;

class MyStack extends Vector {
    public Object push(Object item) {
        addElement(item);
        return item;
    }
    public Object pop() {
        Object obj = peek(); // Stack에 저장된 마지막 요소를 읽어온다
        // Stack이 비어있으면 peek() 메서드가 EmptyStackException을 발생
        // 마지막 요소를 삭제한다. 배열의 index는 0부터 시작하므로 -1 처리.
        removeElementAt(size() - 1 );
        return obj;
    }
    public Object peek() {
        int len = size();

        if( len == 0 )
            throw new EmptyStackException();
        // 마지막 요소를 삭제한다. 배열의 index는 0부터 시작하므로 -1 처리.
        return elementAt(len - 1 );
    }
    public boolean empty() { return size() == 0; }

    public int search(Object o) {
        int i = lastIndexOf(o);

        if( i >= 0 ) { return size() - i; }
        return -1;
    }
}
