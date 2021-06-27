package kz.hackeevo.spring.exceptions;

public class NotDefaultBillException extends RuntimeException {
    public NotDefaultBillException(String message) {
        super(message);
    }
}
