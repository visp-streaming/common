package ac.at.tuwien.infosys.visp.common.peerJ;

public class Availability {
    private String availability;
    private String timestamp;
    private String assetID;

    public Availability() {
    }

    public Availability(String availability, String timestamp, String assetID) {
        this.availability = availability;
        this.timestamp = timestamp;
        this.assetID = assetID;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
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


