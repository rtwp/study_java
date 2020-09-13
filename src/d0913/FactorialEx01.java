package d0913;
//1 271p 직접

public class FactorialEx01 {
    public static void main(String[] args) {
        System.out.println(factorialFor(-2));
        System.out.println(factorialWhile(5));
        System.out.println(factorialRecursive(-2));

    }

    static int factorialFor(int n) {
        if (n <= 0)
            return 1;
        int result = n;
        for(int i = n - 1; i > 1; i--)
            result *= i;
        return result;
    }

    static int factorialWhile(int n) {
        if (n <= 1)
            return 1;
        int result = 1;
        while(n > 1) {
            result *= n;
            n--;
            //위 두 문장을 result *= n--; 로 표현가능
        }
        return result;
    }

    static int factorialRecursive(int n) {
        if (n <= 1)
            return 1;
        int result = n;
        result *= factorialRecursive(n -1);
        return result;
    }
}