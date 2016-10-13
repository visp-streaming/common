package entities.peerJ;

public class OOE {
    private String assetID;
    private String timeStamp;
    private String ooe;

    public OOE() {
    }

    public OOE(String assetID, String timeStamp, String ooe) {
        this.assetID = assetID;
        this.timeStamp = timeStamp;
        this.ooe = ooe;
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

    public String getOoe() {
        return ooe;
    }

    public void setOoe(String ooe) {
        this.ooe = ooe;
    }
}
