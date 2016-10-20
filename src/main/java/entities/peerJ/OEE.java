package entities.peerJ;

public class OEE {
    private String assetID;
    private String timeStamp;
    private String oee;

    public OEE() {
    }

    public OEE(String assetID, String timeStamp, String oee) {
        this.assetID = assetID;
        this.timeStamp = timeStamp;
        this.oee = oee;
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

    public String getOee() {
        return oee;
    }

    public void setOee(String oee) {
        this.oee = oee;
    }
}
