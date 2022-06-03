package exception;

public class BadClothesException extends Exception{
    public BadClothesException() {
    }

    public BadClothesException(String message) {
        super(message);
    }

    public BadClothesException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadClothesException(Throwable cause) {
        super(cause);
    }

    public BadClothesException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
