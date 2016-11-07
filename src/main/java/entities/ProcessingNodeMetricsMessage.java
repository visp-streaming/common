package entities;

import java.io.Serializable;
import java.util.Map;
import java.util.UUID;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class ProcessingNodeMetricsMessage implements Serializable{

    private static final long serialVersionUID = 6736695181027775267L;
	
	private String id;
    private String processingNode;
    private String timestamp; 
    private Map<String, Long> processedMessages;
    private Map<String, Long> emittedMessages;
    

    public ProcessingNodeMetricsMessage() {

    	this.id = UUID.randomUUID().toString();
    	this.timestamp = Long.toString(System.currentTimeMillis()); // new DateTime(DateTimeZone.UTC).toString();
    	
    }

    public ProcessingNodeMetricsMessage(String processingNode, Map<String, Long> processedMessages, Map<String, Long> emittedMessages) {

    	this.id = UUID.randomUUID().toString();
    	this.processingNode = processingNode;
    	this.processedMessages = processedMessages;
    	this.emittedMessages = emittedMessages;
        this.timestamp = new DateTime(DateTimeZone.UTC).toString();

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProcessingNode() {
		return processingNode;
	}

	public void setProcessingNode(String processingNode) {
		this.processingNode = processingNode;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Map<String, Long> getProcessedMessages() {
		return processedMessages;
	}

	public void setProcessedMessages(Map<String, Long> processedMessages) {
		this.processedMessages = processedMessages;
	}

	public Map<String, Long> getEmittedMessages() {
		return emittedMessages;
	}

	public void setEmittedMessages(Map<String, Long> emittedMessages) {
		this.emittedMessages = emittedMessages;
	}

	@Override
	public String toString() {
		
	    return "s{" +
		    		id +
		    		", " + processingNode +
		    		", p:" + processedMessages + 
		    		", e:" + emittedMessages + 
		    		", " + timestamp + 
		        '}';
	    
	}

}

