package entities;

import java.io.Serializable;
import java.util.UUID;

public class Message implements Serializable {

    private String id;
    private String payload;

    public Message(String id, String payload) {
        this.id = id;
        this.payload = payload;
    }

    public Message() { }

    public Message(String payload) {
        this.payload = payload;
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {
        return id;
    }

    public String getPayload() {
        return payload;
    }

}

