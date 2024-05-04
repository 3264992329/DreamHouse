package CustomExceptions;

public class formateLength extends RuntimeException{
    //Alt+insert

    public formateLength() {
    }

    public formateLength(String message) {
        super(message);
    }
}
