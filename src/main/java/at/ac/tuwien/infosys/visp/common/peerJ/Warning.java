package at.ac.tuwien.infosys.visp.common.peerJ;

public class Warning {
    private String message;
    private String timestamp;
    private String assetID;
    private String type;

    public Warning() {
    }

    public Warning(String message, String timestamp, String assetID, String type) {
        this.message = message;
        this.timestamp = timestamp;
        this.assetID = assetID;
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}


