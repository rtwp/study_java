package Excercise;
// 암호
public class Ex05_10 {
    public static void main(String[] args) {
        char[]abcCode =
        {'`','~','!','@','#','$','%','^','&','*',
                '(',')','-','_','+','=','|','[',']','{',
                '}',';',':',',','.','/'};
                    //  0   1   2   3   4    5   6   7  8    9
        char[]numCode={'q','w','e','r','t','y','u','i','o','p'};

        String src="abc123";
        String result="";

        //문자열 src의문자를 charAt()으로하나씩읽어서 변환후 result에저장
        for(int i=0;i <src.length();i++){
            char ch=src.charAt(i);
            if ( 'a' <= ch && ch <= 'z') {
                result += abcCode[ch - 'a'];
            } else {
                result += numCode[ch - '0'];
            }

        }

        System.out.println("src:"+src);
        System.out.println("result:"+result);
    }
}
