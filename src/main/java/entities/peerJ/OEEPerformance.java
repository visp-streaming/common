package entities.peerJ;

public class OEEPerformance {
    private String assetID;
    private String timeStamp;
    private String performance;

    public OEEPerformance() {
    }

    public OEEPerformance(String assetID, String timeStamp, String performance) {
        this.assetID = assetID;
        this.timeStamp = timeStamp;
        this.performance = performance;
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

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }
}
