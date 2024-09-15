package ExceptionHandle;

public class InvalidAgeEcxeption extends Exception {
    public InvalidAgeEcxeption() {
    }

    public InvalidAgeEcxeption(String message) {
        super(message);
    }

    public InvalidAgeEcxeption(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAgeEcxeption(Throwable cause) {
        super(cause);
    }

    public InvalidAgeEcxeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

