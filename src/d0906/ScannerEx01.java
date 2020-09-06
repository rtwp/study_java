package d0906;
//1 511p
import java.util.*;

public class ScannerEx01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] argArr = null;

        while(true) {
            String prompt = ">>";
            System.out.print(prompt);

            // 화면으로부터 라인단위로 입력 받는다.
            String input = s.nextLine();

            input = input.trim();
            argArr = input.split(" +");

            String command = argArr[0].trim();

            if( "".equals(command) ) continue;

            // 명령어를 소문자로 바꾼다
            command = command.toLowerCase();

            //q 또는 Q를 입력하면 종료
            if( command.equals("q") ) {
                System.exit(0);
            } else {
                for(int i = 0; i < argArr.length; i++)
                    System.out.println(argArr[i]);
            }
        } // while(true)
    } // main
}
