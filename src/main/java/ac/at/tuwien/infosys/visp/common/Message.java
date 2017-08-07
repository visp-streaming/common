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
    private String containerid;

    public Message(String id, String header, String payload, String containerid) {
        this.id = id;
        this.payload = payload;
        this.header = header;
        this.processingDuration = new DateTime(DateTimeZone.UTC).toString();
        this.containerid = containerid;
    }

    public Message() { }

    public Message(String payload, String containerid) {
        this.payload = payload;
        this.header = "initial";
        this.id = UUID.randomUUID().toString();
        this.processingDuration = new DateTime(DateTimeZone.UTC).toString();
        this.containerid = containerid;
    }

    public Message(String header, String payload, String containerid) {
        this.payload = payload;
        this.header = header;
        this.id = UUID.randomUUID().toString();
        this.processingDuration = new DateTime(DateTimeZone.UTC).toString();
        this.containerid = containerid;
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

    public String getContainerid() {
        return containerid;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", payload='" + payload + '\'' +
                ", header='" + header + '\'' +
                ", processingDuration='" + processingDuration + '\'' +
                ", containerid='" + containerid + '\'' +
                '}';
    }
}

