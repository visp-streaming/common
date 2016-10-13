package entities.peerJ;

public class OOEQuality {
    private String assetID;
    private String timeStamp;
    private String quality;

    public OOEQuality() {
    }

    public OOEQuality(String assetID, String timeStamp, String quality) {
        this.assetID = assetID;
        this.timeStamp = timeStamp;
        this.quality = quality;
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

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
