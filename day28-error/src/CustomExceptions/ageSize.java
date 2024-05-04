package CustomExceptions;

public class ageSize extends RuntimeException{
    public ageSize() {
    }

    public ageSize(String message) {
        super(message);
    }
}
