package ExceptionHandle;

public class MyCustom extends RuntimeException{
    public MyCustom() {
    }

    public MyCustom(String message) {
        super(message);
    }

    public MyCustom(String message, Throwable cause) {
        super(message, cause);
    }

    public MyCustom(Throwable cause) {
        super(cause);
    }


    public MyCustom(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
