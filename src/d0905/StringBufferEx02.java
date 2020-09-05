package d0905;
//1 482p
public class StringBufferEx02 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01");
        StringBuffer sb2 = sb.append(23);
        sb.append('4').append(56);

        StringBuffer sb3 = sb.append(78);
        sb3.append(9.0);

        System.out.println("sb  = " + sb);  // sb1 ~3은 모두 동일. 참조변수만
        System.out.println("sb2 = " + sb2); // 다를 뿐. 같은 주소를 참조.
        System.out.println("sb3 = " + sb3); 
        System.out.println();
        System.out.println("sb = " + sb.deleteCharAt(10)); // 10번 째 문자 삭제
        System.out.println("sb = " + sb.delete(3, 6)); // 3~5번 까지의 문자 삭제
        System.out.println("sb = " + sb.insert(3, "abc")); // 3번째에 abc 추가
        System.out.println("sb = " + sb.replace(6, sb.length(), "END"));
                            // 6부터 문자열 길이까지 END로 대체
        System.out.println();
        System.out.println("capacity = " + sb.capacity()); // 버퍼크기(처음 문자열크기(2) + 16
        System.out.println("length = " + sb.length()); // 문자열의 크기

    }
}
