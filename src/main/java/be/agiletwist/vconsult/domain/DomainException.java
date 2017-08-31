package be.agiletwist.vconsult.domain;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}
