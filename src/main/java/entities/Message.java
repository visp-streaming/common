package entities;

import java.io.Serializable;
import java.util.UUID;

public class Message implements Serializable {

    private UUID id;
    private String payload;


    public Message(String payload) {
        this.payload = payload;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }
}

