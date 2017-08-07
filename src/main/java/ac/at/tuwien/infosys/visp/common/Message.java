package ac.at.tuwien.infosys.visp.common;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.io.Serializable;
import java.util.UUID;

public class Message implements Serializable {

    private String id;
    private String payload;
    private String operatorType;
    private String operatorName;
    private String containerID;
    private String processingDuration;

    public Message(String id, String operatorType, String operatorName, String containerID, String payload) {
        this.id = id;
        this.payload = payload;
        this.operatorType = operatorType;
        this.operatorName = operatorName;
        this.containerID = containerID;
        this.processingDuration = new DateTime(DateTimeZone.UTC).toString();
    }

    public Message() { }

    public Message(String payload) {
        this.payload = payload;
        this.operatorType = "initial";
        this.operatorName = "initial";
        this.containerID = "initial";
        this.id = UUID.randomUUID().toString();
        this.processingDuration = new DateTime(DateTimeZone.UTC).toString();
    }

    public Message(String operatorType, String operatorName, String containerID, String payload) {
        this.id = UUID.randomUUID().toString();
        this.payload = payload;
        this.operatorType = operatorType;
        this.operatorName = operatorName;
        this.containerID = containerID;
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

    public String getProcessingDuration() {
        return processingDuration;
    }

    public String getOperatorType() {
        return operatorType;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public String getContainerID() {
        return containerID;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", payload='" + payload + '\'' +
                ", operatortype='" + operatorType + '\'' +
                ", operatorname='" + operatorName + '\'' +
                ", containerid='" + containerID + '\'' +
                ", processingDuration='" + processingDuration + '\'' +
                '}';
    }
}

