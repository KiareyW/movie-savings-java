public class AgeException extends Exception {
    public AgeException() {
        super("Invalid age entered.");
    }

    public AgeException(String message) {
        super(message);
    }
}
