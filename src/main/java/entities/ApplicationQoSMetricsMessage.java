package entities;

import java.io.Serializable;
import java.util.UUID;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class ApplicationQoSMetricsMessage implements Serializable{

    private static final long serialVersionUID = 6736695181027775267L;
	
	private String id;
    private String applicationName;
    private String timestamp;
    private Double averageResponseTime;

    public ApplicationQoSMetricsMessage() {
    	
    }

    public ApplicationQoSMetricsMessage(String applicationName, Double averageResponseTime) {

    	this.id = UUID.randomUUID().toString();
		this.applicationName = applicationName;
		this.averageResponseTime = averageResponseTime;
        this.timestamp = new DateTime(DateTimeZone.UTC).toString();

	}

    public ApplicationQoSMetricsMessage(String id, String applicationName, Double averageResponseTime) {

    	this.id = id;
		this.applicationName = applicationName;
		this.averageResponseTime = averageResponseTime;
        this.timestamp = new DateTime(DateTimeZone.UTC).toString();

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public Double getAverageResponseTime() {
		return averageResponseTime;
	}

	public void setAverageResponseTime(Double averageResponseTime) {
		this.averageResponseTime = averageResponseTime;
	}

	@Override
	public String toString() {
		
	    return "a{" +
		    		id +
		    		", '" + applicationName + "'" +
			        ", " + averageResponseTime + " ms " +
			        ", " + timestamp +
		        '}';
	}

}

