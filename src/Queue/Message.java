package Queue;

public class Message {
    private String message;
    private String to;

    public Message(String message, String to) {
        this.message = message;
        this.to = to;
    }


    public String getMessage() {
        return message;
    }

    public String getTo() {
        return to;
    }
}
