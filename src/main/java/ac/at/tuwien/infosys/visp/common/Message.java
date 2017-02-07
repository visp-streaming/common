package ac.at.tuwien.infosys.visp.common;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.io.Serializable;
import java.util.UUID;

public class Message implements Serializable {

    private String id;
    private String payload;
    private String header;
    private String processingDuration;

    public Message(String id, String header, String payload) {
        this.id = id;
        this.payload = payload;
        this.header = header;
        this.processingDuration = new DateTime(DateTimeZone.UTC).toString();
    }

    public Message() { }

    public Message(String payload) {
        this.payload = payload;
        this.header = "initial";
        this.id = UUID.randomUUID().toString();
        this.processingDuration = new DateTime(DateTimeZone.UTC).toString();
    }

    public Message(String header, String payload) {
        this.payload = payload;
        this.header = header;
        this.id = UUID.randomUUID().toString();
        this.processingDuration = new DateTime(DateTimeZone.UTC).toString();
    }

    
    public void setId(String id) {
		this.id = id;
	}

	public String getId() {
        return id;
    }

    public String getPayload() {
        return payload;
    }

    public String getHeader() {
        return header;
    }

    public String getProcessingDuration() {
        return processingDuration;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", payload='" + payload + '\'' +
                ", header='" + header + '\'' +
                ", processingDuration='" + processingDuration + '\'' +
                '}';
    }
}

