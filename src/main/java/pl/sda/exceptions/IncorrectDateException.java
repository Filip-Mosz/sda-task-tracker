package pl.sda.exceptions;

public class IncorrectDateException extends RuntimeException{
    String message = "Podano niewłąściwą datę";

    public IncorrectDateException() {
        this.message = message;
    }
}
