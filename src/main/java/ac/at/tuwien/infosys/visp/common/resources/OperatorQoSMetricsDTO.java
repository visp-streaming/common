package ac.at.tuwien.infosys.visp.common.resources;

/**
 *
 * QoS metrics of one operator of a running topolgy
 */
public class OperatorQoSMetricsDTO {

    private String name;
    private String timestamp;
    private double processedMessages;
    private double receivedMessages;
    //time (in seconds) since the last measurement
    private double deltaSeconds;

    public OperatorQoSMetricsDTO() {
    }

    public OperatorQoSMetricsDTO(String name, String timestamp, double processedMessages, double receivedMessages, double deltaSeconds) {
        super();
        this.name = name;
        this.timestamp = timestamp;
        this.processedMessages = processedMessages;
        this.receivedMessages = receivedMessages;
        this.deltaSeconds = deltaSeconds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public double getProcessedMessages() {
        return processedMessages;
    }

    public void setProcessedMessages(double processedMessages) {
        this.processedMessages = processedMessages;
    }

    public double getReceivedMessages() {
        return receivedMessages;
    }

    public void setReceivedMessages(double receivedMessages) {
        this.receivedMessages = receivedMessages;
    }

    public double getDeltaSeconds() {
        return deltaSeconds;
    }

    public void setDeltaSeconds(double deltaSeconds) {
        this.deltaSeconds = deltaSeconds;
    }
}