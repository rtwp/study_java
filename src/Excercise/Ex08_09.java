package Excercise;

public class Ex08_09 {
    public static void main(String[] args)
     throws Exception {
        throw new UnsupportedFunctionException("지원x", 100);
    }
}
class UnsupportedFunctionException
        extends RuntimeException {
    final private int ERR_CODE;


    UnsupportedFunctionException(String msg, int ec) {
        super(msg);
        ERR_CODE = ec;
    }

    public int getErrorCode() {
        return ERR_CODE;
    }

    public String getMessage() {
        return "[" + getErrorCode() + "]" + super.getMessage();
    }

}