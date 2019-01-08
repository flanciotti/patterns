package singleton;

public class SingletonException extends Exception {
    public SingletonException() {
        super("Singleton pattern doesn't allow more than one instance!");
    }
}
