package d0922;
//2 610p

import java.util.*;

public class ExpValidCheck {
    public static void main(String[] args) {
        if(args.length != 1 ) {
            System.out.println("args의 길이가 하나여야만 한다.");
            System.exit(0);
        }

        Stack st = new Stack();
        String expression = args[0];

        System.out.println("expression : " + expression);

        try {
            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                if(ch == '(') {
                    st.push(ch+"");
                } else if( ch == ')' ) {
                    st.pop();
                }
            }
            if(st.isEmpty() ) {
                System.out.println("equal");
            } else {
                System.out.println("not equal");
            }
        } catch ( EmptyStackException e) {
            System.out.println("not equal");
        }
    }
}
