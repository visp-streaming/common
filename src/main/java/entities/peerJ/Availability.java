package entities.peerJ;

public class Availability {
    private Status availability;
    private String timestamp;
    private String assetID;

    public Availability() {
    }

    public Availability(Status availability, String timestamp, String assetID) {
        this.availability = availability;
        this.timestamp = timestamp;
        this.assetID = assetID;
    }

    public Status getAvailability() {
        return availability;
    }

    public void setAvailability(Status availability) {
        this.availability = availability;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getAssetID() {
        return assetID;
    }

    public void setAssetID(String assetID) {
        this.assetID = assetID;
    }
}


