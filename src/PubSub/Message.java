package PubSub;

import java.util.UUID;

public class Message {
    String id;
    String content;

    Message() {
        id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content;
    }
}
