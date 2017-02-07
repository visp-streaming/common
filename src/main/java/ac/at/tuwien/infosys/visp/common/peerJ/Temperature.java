package ac.at.tuwien.infosys.visp.common.peerJ;

public class Temperature {
    private Integer temperature;
    private String timestamp;
    private String assetID;

    public Temperature() {
    }

    public Temperature(Integer temperature, String timestamp, String assetID) {
        this.temperature = temperature;
        this.timestamp = timestamp;
        this.assetID = assetID;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
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


