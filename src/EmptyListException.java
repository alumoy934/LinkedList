public class EmptyListException extends ObjectNotFoundException {
    EmptyListException() {
        super();
    }
    EmptyListException(String message) {
        super(message);
    }
}