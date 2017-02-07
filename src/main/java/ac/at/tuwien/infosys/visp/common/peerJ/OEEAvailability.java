package ac.at.tuwien.infosys.visp.common.peerJ;

public class OEEAvailability {
    private String assetID;
    private String timeStamp;
    private String availability;

    public OEEAvailability() {
    }

    public OEEAvailability(String assetID, String timeStamp, String availability) {
        this.assetID = assetID;
        this.timeStamp = timeStamp;
        this.availability = availability;
    }

    public String getAssetID() {
        return assetID;
    }

    public void setAssetID(String assetID) {
        this.assetID = assetID;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}
