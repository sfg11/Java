public class StackException extends Exception {

    /**
     * Creates a new instance of <code>StackException</code> without detail
     * message.
     */
    public StackException() {
        super();
    }

    /**
     * Constructs an instance of <code>StackException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public StackException(String msg) {
        super(msg);
    }
}
