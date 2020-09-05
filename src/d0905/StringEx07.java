package d0905;
//1 475p
public class StringEx07 {
    public static void main(String[] args) {
        String fullName = "Hello.java";

        //fullName에서 '.'의 위치를 찾는다.
        int index = fullName.indexOf('.');

        //fullName의 첫 글자부터 int index('.'의 위치) 까지의 문자열을 추출한다.
        String fileName = fullName.substring(0, index);

        //int index+1('.'의 다음 문자) 부터 문자열 끝까지 추출.
        //         = fullName.substring(index+1, fullName.length());
        String ext = fullName.substring(index+1);
        System.out.println(fullName);
        System.out.println("파일명 : " + fileName);
        System.out.println("확장자 : " + ext);
    }
}